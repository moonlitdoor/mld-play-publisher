package com.moonlitdoor.play.publisher

import com.moonlitdoor.play.publisher.task.InitialTask
import org.gradle.api.Plugin
import org.gradle.api.Project

@Suppress("Unused")
class PlayPublisherPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.tasks.create(InitialTask.TASK_NAME, InitialTask::class.java)
    }
}