import React from 'react'
import {AiOutlineDownload , AiFillHeart} from "react-icons/ai"
const Image = ({prop_one}) => {
    const handleFavourites = (img_link) =>{
        const local_arr = JSON.parse(localStorage.getItem("favImages")) || []
        local_arr.push(img_link);
        localStorage.setItem("favImages" , JSON.stringify(local_arr))
    }
    const handleDownload = async (url , userName)=>{
        try{
            const res  = await fetch(url)
            const blob = await res.blob()
            let url2 = window.URL.createObjectURL(blob)
            let a = document.createElement("a")
            a.style = "display: none"
            document.body.appendChild(a)
            a.href = url2
            a.download = userName
            a.click()
            a.remove()
            window.URL.revokeObjectURL(url2)
        }catch(err){
            console.log(err)
        }
    }
  return (
    <div className="mx-10 columns-3 pb-10">
        {
            prop_one.map((ig)=>(
            <div key={ig.id} className="relative group ">
                <img src={ig.imageUrl} alt="" className='break-inside-avoid mb-4 duration-300' />
                {/* <button className="opacity-0 group-hover:opacity-100 absolute top-4 right-6  px-4 py-3 rounded-full hover:scale-110 duration-200 active:scale-90 bg-white" onClick={()=>handleFavourites(ig.imageUrl)}> */}
                    {/* <AiFillHeart className="h-4 w-4 "/> */}
                {/* </button> */}
                <div className="opacity-0 group-hover:opacity-100 absolute bottom-4 flex w-full justify-between items-center px-4 ">
                    <a href={ig.profileUrl} className="flex items-center space-x-5  text-white rounded-full" target="_black">
                        <img src={ig.profileImageUrl} alt="" className='rounded-full h-[50px] w-[50px]'/>
                        <h1 className='text-md font-inter'>{ig.userName}</h1>
                    </a>
                    <button className="  px-4 py-3 rounded-full hover:scale-110 duration-200 active:scale-90 bg-white" onClick={()=>handleDownload(ig.downloadUrl , ig.userName)}>
                        <AiOutlineDownload className="h-4 w-4 "/>
                    </button>
                </div>
            </div>
        ))
        }
    </div>
  )
}

export default Image