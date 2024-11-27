/*
 * @Author: JeffreyZhu 1624410543@qq.com
 * @Date: 2024-11-25 20:52:43
 * @LastEditors: JeffreyZhu 1624410543@qq.com
 * @LastEditTime: 2024-11-27 23:35:40
 * @FilePath: \JeffreysBlog\jeffreysblogfronted\src\components\NavBar.tsx
 * @Description: File Description Here...
 * 
 * Copyright (c) 2024 by JeffreyZhu, All Rights Reserved. 
 */

import React from "react"
import { AiOutlineClose, AiOutlineMenu } from 'react-icons/ai'
import {useState} from 'react'

const links = [
    {
        name:"Home",
        path:'/home'
    },
    {
        name:"Blogs",
        path:'/blogs'
    },
    {
        name:"Projects",
        path:'/projects'
    }
]


function NavBar(){

    const [nav,setNav] = useState(false)

    const handleNav = ()=>{
        setNav(!nav)
    }

    return (
        <div className="flex justify-between items-center h-20 md:h-24 w-full mx-auto px-4 text-white bg-slate-600 md:px-10">
            <h1 className="w-full text-3xl font-bold text-[#00df9a]">Jeffrey's Blog</h1>

            <ul className='hidden md:flex font-bold text-lg'>
                {
                    links.map((item)=>{
                        return <li className='p-4 hover:underline hover:decoration-solid hover:underline-offset-8 decoration-4 cursor-pointer transition-colors duration-500'>{item.name}</li>
                    })
                }
                
            </ul>
            
            <div onClick={handleNav} className='block md:hidden'>
                {
                    !nav ? <AiOutlineMenu size={20} /> : <AiOutlineClose size={20} />
                }
            </div>
            
            <div className={nav ? ' fixed right-0 top-0 w-[60%] h-full border-r bg-slate-600 ease-in-out duration-500 md:hidden' : "fixed right-[-60%] top-0 w-[60%] h-full border-r bg-slate-600 ease-in-out duration-500 md:hidden"}>
                <h1 className='w-full text-3xl font-bold text-[#00df9a] m-8'>Jeffrey's Blog</h1>

                <ul className='uppercase p-4'>
                    {
                        links.map((item)=>{
                            return <li className='p-4 border-b border-gray-600'>{item.name}</li>
                        })
                    }
                    
                    <div onClick={handleNav} className='block md:hidden p-4 my-10'>
                        {
                            !nav ? <></> : <AiOutlineClose size={40} />
                        }
                    </div>
                </ul>
                
            </div>

        </div>
    )

}

export default NavBar