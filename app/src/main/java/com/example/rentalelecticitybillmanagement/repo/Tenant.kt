package com.example.rentalelecticitybillmanagement.repo

import java.io.Serializable

data class Tenant(
    var name : String? = null,
    var roomNo : String? = null,
    var prevRecord : ArrayList<PreviousRecord>? = null,
    var areDuesCleared : Boolean = false
) : Serializable
