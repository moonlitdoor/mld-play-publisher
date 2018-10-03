package com.moonlitdoor.play.publisher

import com.google.gson.GsonBuilder
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

object Http {

    private val gson = GsonBuilder().create()

    fun <T> get(url: String, classOfT: Class<T>): T {
        val connection = (URL(url).openConnection() as HttpURLConnection).apply {
            doOutput = true
            requestMethod = GET
//            setRequestProperty(AUTHORIZATION, ??)
            setRequestProperty(CONTENT_TYPE, APPLICATION_JSON)
            setRequestProperty(ACCEPT, APPLICATION_JSON)
            setRequestProperty(USER_AGENT, USER_AGENT_VALUE)
        }
        return gson.fromJson<T>(InputStreamReader(connection.inputStream), classOfT)
    }

    fun <T, K> post(url: String, body: T, classOfK: Class<K>): K {
        val connection = (URL(url).openConnection() as HttpURLConnection).apply {
            doOutput = true
            requestMethod = POST
//            setRequestProperty(AUTHORIZATION, ??)
            setRequestProperty(CONTENT_TYPE, APPLICATION_JSON)
            setRequestProperty(ACCEPT, APPLICATION_JSON)
            setRequestProperty(USER_AGENT, USER_AGENT_VALUE)
        }
        connection.outputStream.use { it.write(gson.toJson(body).toByteArray()) }
        return gson.fromJson<K>(InputStreamReader(connection.inputStream), classOfK)
    }

    fun <T> delete(url: String, classOfT: Class<T>): T {
        val connection = (URL(url).openConnection() as HttpURLConnection).apply {
            doOutput = true
            requestMethod = DELETE
//            setRequestProperty(AUTHORIZATION, ??)
            setRequestProperty(CONTENT_TYPE, APPLICATION_JSON)
            setRequestProperty(ACCEPT, APPLICATION_JSON)
            setRequestProperty(USER_AGENT, USER_AGENT_VALUE)
        }
        return gson.fromJson<T>(InputStreamReader(connection.inputStream), classOfT)
    }

    private const val GET = "GET"
    private const val POST = "POST"
    private const val DELETE = "DELETE"
    private const val AUTHORIZATION = "Authorization"
    private const val ACCEPT = "Accept"
    private const val CONTENT_TYPE = "Content-Type"
    private const val USER_AGENT = "User-Agent"
    private const val APPLICATION_JSON = "application/json"
    private const val USER_AGENT_VALUE = "com.moonlitdoor.play-publisher"


}