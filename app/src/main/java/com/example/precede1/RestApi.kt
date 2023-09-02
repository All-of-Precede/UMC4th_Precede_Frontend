package com.example.precede1
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface RestApi {
    @POST("api/mail/Send")
    fun sendemails(@Body mail: Mail): Call<Mail>

    @POST("api/mail/auth/check")
    fun sendchecks(@Body mail: MailCheck): Call<MailCheck>

    @POST("api/auth/sign-up/person")
    fun sendregisters(@Body register: Register): Call<Register>

    @POST("api/auth/sign-in")
    fun sendlogin(@Body person: Person): Call<Person>
}