import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `java-gradle-plugin`
    `kotlin-dsl`
    `maven-publish`
    id("com.moonlitdoor.git-version") version "0.0.8"
    id("com.gradle.plugin-publish") version "0.10.0"
}

version = gitVersion

kotlinDslPluginOptions {
    experimentalWarning.set(false)
}

dependencies {
    implementation("com.google.code.gson:gson:2.8.5")
    implementation(kotlin("stdlib-jdk8"))
    testImplementation("junit:junit:4.12")
}

gradlePlugin {
    plugins {
        register("play-publisher") {
            id = "com.moonlitdoor.play-publisher"
            implementationClass = "com.moonlitdoor.play.publisher.PlayPublisherPlugin"
        }
    }
}

pluginBundle {
    website = "https://github.com/moonlitdoor/mld-play-publisher"
    vcsUrl = "https://github.com/moonlitdoor/mld-play-publisher"
    description = "A Gradle plugin that publishes Android apps to the Google Play Store."
    (plugins) {
        "play-publisher" {
            displayName = "Play Publisher Plugin"
            tags = listOf("Android", "Play", "Publish")
        }
    }
}