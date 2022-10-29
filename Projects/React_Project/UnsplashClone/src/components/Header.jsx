import React from 'react'

const Header = ({name}) => {
  return (
    <div className="mx-16 text-inter font-black text-7xl w-screen h-28 border-b-2 border-gray-200 text-center mt-8 mb-8 text-gray-900">
      <p className=''>{name}</p>
    </div>
  )
}

export default Header