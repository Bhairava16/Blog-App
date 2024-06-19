package com.example.blogapp.Model

data class UserData(
    val name: String ="",
    val email: String ="",
    val profileImage: String = ""
){
    constructor(): this("","","")
}
