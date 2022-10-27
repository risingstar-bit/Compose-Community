import React, { useState } from 'react'
import Header from '../components/Header'
import Navbar from '../components/Navbar'
import {searchImages} from "../unsplash"
import Image from "../components/Image"
const NavPages = ({name}) => {
  const [image , setImage] = useState([])
  const fetch_func = () =>{
    document.title = `Unsplash-${name}`;
    searchImages(name).then((res)=>res.results).then((out)=>{
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
  }
  fetch_func();
  return (
    <div className='overflow-x-hidden'>
        <Navbar/>
        <Header name={name}/>
        <Image prop_one={image}/>
    </div>
  )
}

export default NavPages