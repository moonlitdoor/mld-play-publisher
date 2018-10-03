package com.moonlitdoor.play.publisher.task

import com.moonlitdoor.play.publisher.Config
import com.moonlitdoor.play.publisher.Http
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

open class InitialTask : DefaultTask() {

    init {
        group = Config.GROUP
    }

    @Suppress("unused")
    @TaskAction
    fun taskAction() {
        println("com.moonlitdoor.play-publisher")
        println(Http.get("https://jsonplaceholder.typicode.com/todos/1", Todo::class.java))

    }

    companion object {
        const val TASK_NAME = "initialTask"
    }

    data class Todo(
            val userId: Int,
            val id: Int,
            val title: String,
            val completed: Boolean
    )

}