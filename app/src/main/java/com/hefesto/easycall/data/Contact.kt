package com.hefesto.easycall.data

data class Contact(
    var id: Int?= null,
    var name: String? = "",
    var letters:String = "",
    var active: Boolean = true,
    var number: String? = ""
)