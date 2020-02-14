package com.example.demo.Controller

import com.example.demo.entity.UserEntity
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import com.example.demo.respository.repository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.PathVariable
import java.util.*

@RestController
class controller{
    @Autowired
    lateinit var userrespository : repository

    @CrossOrigin(origins = arrayOf("http://localhost:8080"))
    @GetMapping("/")
    fun homeindex():String{
        println("hello")
        return "helllo"
    }

    @CrossOrigin(origins = arrayOf("http://localhost:8080"))
    @GetMapping("/GetUserData/{id}/{phone}")
    fun getUserdata(@PathVariable id: String, @PathVariable phone :String): ResponseEntity<Any> {
//            println(id)
//            println(phone)
        val userData  = userrespository.findById(id).get()
        println(userData.student_name)
        println(userData.student_phone)
        return if (userData.student_phone != phone) {
        ResponseEntity.notFound().build<Any>()
        } else ResponseEntity.ok<Any>(userData)

    }



}