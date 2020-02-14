package com.example.demo.respository

import com.example.demo.entity.UserEntity
import org.springframework.data.jpa.repository.JpaRepository


interface repository : JpaRepository<UserEntity,String> {

}
