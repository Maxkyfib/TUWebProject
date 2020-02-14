package com.example.demo.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name ="STUDENT_DETAIL")
class UserEntity (
        @Column(name = "STUDENT_ID")
        @Id
        var student_persanal_id : String = "",
        @Column(name = "STUDENT_PHONE")
        var student_phone: String = "",
        @Column(name = "STUDENT_NAME")
        var student_name: String = "",
        @Column(name = "STUDENT_TESTROOM")
        var student_testroom : String = "",
        @Column(name = "STUDENT_TESTNO")
        var student_test_no : String = "",
        @Column(name = "STUDENT_COURSE_SYLLABUS")
        var student_course :  String = "",
        @Column(name = "STUDENT_TEST_TYPE")
        var student_type :  String = ""
)
