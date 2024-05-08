package com.example.peoplecompose.data.model

import android.graphics.Picture
import com.google.gson.annotations.SerializedName
import java.util.jar.Attributes

data class PersonWrapper(

    @SerializedName("results")
    val results: List<Person>

)

data class Person(
    @SerializedName("name")
    val name: Name,

    @SerializedName("email")
    val email: String,

    @SerializedName("cell")
    val cell: String,

    @SerializedName("picture")
    val picture: PicturePerson
)

data class Name(
    @SerializedName("first")
    val first: String,

    @SerializedName("last")
    val last: String
)

data class PicturePerson(
    @SerializedName("thumbnail")
    val thumbnail: String
)

