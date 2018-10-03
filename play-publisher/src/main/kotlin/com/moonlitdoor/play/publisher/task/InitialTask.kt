package com.moonlitdoor.play.publisher.task

import com.moonlitdoor.play.publisher.Config
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

open class InitialTask : DefaultTask() {

    init {
        group = Config.GROUP
    }

    @TaskAction
    fun taskAction() {
        println("com.moonlitdoor.play-publisher")
    }

    companion object {
        const val TASK_NAME = "initialTask"
    }

}