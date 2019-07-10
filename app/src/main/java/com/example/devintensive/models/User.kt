package com.example.devintensive.models

import com.example.devintensive.utils.Utils
import java.util.*

data class User(
    val id:String,
    var firstName:String?,
    var lastName:String?,
    var avatar:String?,
    var rating:Int = 0,
    var respect:Int = 0,
    var lastVisit:Date? = null,
    val isOnline:Boolean = false
) {
    constructor(id:String, firstName:String?, lastName:String?) : this(id, firstName, lastName, null)

    constructor(id: String) : this(id, "John", "Doe $id")

    init {
        println("it's alive. His name is $firstName and last name $lastName")
    }

    companion object Factory {
        private var lastId : Int = -1
        fun makeUser(fullname:String?) : User {
            lastId++

            val (firstName, lastName) = Utils.parseFullName(fullname)

            return User(id = "$lastId", firstName = firstName, lastName = lastName)
        }
    }
}