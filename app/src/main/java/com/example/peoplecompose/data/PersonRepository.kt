package com.example.peoplecompose.data

import android.util.Log
import com.example.peoplecompose.data.model.PersonWrapper
import com.example.peoplecompose.data.remote.PersonService
import retrofit2.Response
import retrofit2.Retrofit

class PersonRepository(private val personService: PersonService) {
    class PersonRepository(private val personService: PersonService) {
        suspend fun getPersons(results: Int): Response<PersonWrapper> {
            val response = personService.getPersons(results).execute()
            if (response.isSuccessful) {
                return response
            } else {
                Log.e("PersonRepository", "Error ${response.code()} ${response.message()}")
                throw Exception("Error ${response.code()} ${response.message()}")
            }
        }
    }
}