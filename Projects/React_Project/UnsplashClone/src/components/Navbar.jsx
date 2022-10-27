import React from 'react'
import {Link} from "react-router-dom"
const Navbar = () => {
  return (
    <div className="flex space-x-4 items-center px-5 bg-gray-50 sticky top-0 z-50">
        <Link to="/" >
          <img src="https://unsplash.com/assets/core/logo-black-df2168ed0c378fa5506b1816e75eb379d06cfcd0af01e07a2eb813ae9b5d7405.svg" alt=""className='w-16 h-8'/>
        </Link>
        <Link className="text-sm hover:bg-black hover:text-white  px-2 py-1  hover:scale-110 duration-300" to="/Editorials">Editorials</Link>
        <div className="w-auto flex space-x-7 text-xs font-inter text-gray-600  px-4 overflow-scroll scrollbar-hide border-l-2 border-gray-800 my-4">
            <Link className="hover:bg-black hover:text-white  px-3 py-2  hover:scale-110 duration-300" to="/Events"><p className="w-max">Current Events</p></Link>
            <Link className="hover:bg-black hover:text-white  px-3 py-2 hover:scale-110 duration-300" to="/Wallpapers">Wallpapers</Link>
            <Link className="hover:bg-black hover:text-white  px-3 py-2  hover:scale-110 duration-300" to="/Renders"><p className="w-max">3D Renders</p></Link>
            <Link className="hover:bg-black hover:text-white  px-3 py-2 hover:scale-110 duration-300" to="/Patterns"><p className="w-max">Texture & Patterns</p></Link>
            <Link className="hover:bg-black hover:text-white  px-3 py-2  hover:scale-110 duration-300" to="/Experimental">Experimental</Link>
            <Link className="hover:bg-black hover:text-white  px-3 py-2  hover:scale-110 duration-300" to="/Architecture">Architecture</Link>
            <Link className="hover:bg-black hover:text-white  px-3 py-2 hover:scale-110 duration-300" to="/Nature">Nature</Link>
            <Link className="hover:bg-black hover:text-white  px-3 py-2 hover:scale-110 duration-300" to="/Business"><p className="w-max">Business & Work</p></Link>
            <Link className="hover:bg-black hover:text-white  px-3 py-2 hover:scale-110 duration-300" to="/Fashion">Fashion</Link>
            <Link className="hover:bg-black hover:text-white  px-3 py-2 hover:scale-110 duration-300" to="/Film">Film</Link>
            <Link className="hover:bg-black hover:text-white  px-3 py-2 hover:scale-110 duration-300" to="/Drink"><p className="w-max">Food & Drink</p></Link>
            <Link className="hover:bg-black hover:text-white  px-3 py-2 hover:scale-110 duration-300" to="/Wellness"><p className="w-max">Health & Wellness</p></Link>
            <Link className="hover:bg-black hover:text-white  px-3 py-2 hover:scale-110 duration-300" to="/People">People</Link>
            <Link className="hover:bg-black hover:text-white  px-3 py-2 hover:scale-110 duration-300" to="/Interiors">Interiors</Link>
            <Link className="hover:bg-black hover:text-white  px-3 py-2 hover:scale-110 duration-300" to="/Photography"><p className="w-max">Street Photography</p></Link>
            <Link className="hover:bg-black hover:text-white  px-3 py-2 hover:scale-110 duration-300" to="/Travel">Travel</Link>
            <Link className="hover:bg-black hover:text-white  px-3 py-2 hover:scale-110 duration-300" to="/Animals">Animals</Link>
            <Link className="hover:bg-black hover:text-white  px-3 py-2 hover:scale-110 duration-300" to="/Spirtuality">Spirtuality</Link>
            <Link className="hover:bg-black hover:text-white  px-3 py-2 hover:scale-110 duration-300" to="/Culture"><p className="w-max">Arts & Culture</p></Link>
            <Link className="hover:bg-black hover:text-white  px-3 py-2 hover:scale-110 duration-300" to="/History">History</Link>
            <Link className="hover:bg-black hover:text-white  px-3 py-2 hover:scale-110 duration-300" to="/Athelitics">Athelitics</Link>
        </div>
    </div>
  )
}















export default Navbar