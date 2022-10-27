import React,{useEffect, useState , useRef} from 'react'
import Navbar from '../components/Navbar'
import Spinner from "../components/Spinner"
import {AiOutlineSearch} from "react-icons/ai"
import {getRandomImages , searchImages} from "../unsplash"

import Image from "../components/Image"
const Home = () => {
  const ref = useRef();
  const [input , setInput] = useState("")
  const [image , setImage] = useState([])

  const handleEnter = async (e)=>{
    if(e.key === "Enter"){
      searchImages(input).then((res)=>res.results).then((out)=>{
        console.log(out)
        setImage(out.map((img)=>({
          id:img.id,
          imageUrl:img.urls.regular,
          downloadUrl:img.urls.full,
          userName:img.user.username,
          profileImageUrl:img.user.profile_image.medium,
          profileUrl:img.user.links.html
        })))
      })
      const gotIt = ref.current
      if(gotIt){
        console.log(gotIt)
        gotIt.scrollIntoView({
          behavior:"smooth",
          block:"start"
        })
      }
    }
  }
  useEffect(()=>{
    getRandomImages().then((res)=>{
      console.log(res)
      setImage(res.map((ele)=>({
        id:ele.id,
        imageUrl:ele.urls.regular,
        downloadUrl:ele.urls.full,
        userName:ele.user.username,
        profileImageUrl:ele.user.profile_image.medium,
        profileUrl:ele.user.links.html
      })))
    }).catch(error=>alert(error))
  },[])
 
  return (
    <div>
        <div className='h-screen w-screen overflow-x-hidden'>
          <Navbar/>
          <div className='h-full w-full relative'>
            <img src="https://images.pexels.com/photos/189215/pexels-photo-189215.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1" alt="" className="object-cover w-full h-[90vh]"/>
            <div className='absolute flex flex-col top-[25vh] left-[30vw] w-[600px] outline-none space-y-14 text-center'>
              <p className='font-inter text-white text-8xl tracking-tight font-black'>Unsplash</p>
              <div className="flex space-x-3 border-2 border-white bg-white items-center
              px-4 py-3">
                <AiOutlineSearch/>
                <input value={input} type="text" placeholder="Search free high-resolution photos" className="text-md text-gray-900 outline-none w-full" onChange={(e)=>setInput(e.target.value)} onKeyPress={(e)=>handleEnter(e)}/>
              </div>
            </div>
          </div>
          <div ref={ref}>
            <Image prop_one={image}/>
          </div>
        </div>
    </div>
  )
}

export default Home