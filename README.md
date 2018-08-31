# mld-play-publisher

A Gradle plugin that publishes Android apps to the Google Play Store. 


[![Travis (.com) branch](https://img.shields.io/travis/com/moonlitdoor/mld-play-publisher/master.svg?style=for-the-badge)](https://travis-ci.com/moonlitdoor/mld-play-publisher)
[![Version](https://img.shields.io/github/release/moonlitdoor/mld-play-publisher.svg?style=for-the-badge)](https://github.com/moonlitdoor/mld-play-publisher/releases)
[![GitHub](https://img.shields.io/github/license/mashape/apistatus.svg?style=for-the-badge)](https://opensource.org/licenses/MIT)


[Published to Gradle Plugins](https://plugins.gradle.org/plugin/com.moonlitdoor.play-publisher)

## Description

## Usage

#### Groovy 

```groovy
plugins {
    id "com.moonlitdoor.play-publisher" version "0.0.7"
}
```

#### Kotlin

```kotlin
plugins {
    id("com.moonlitdoor.play-publisher") version "0.0.7"
}
```

#### [Master Builds](https://jitpack.io/private#moonlitdoor/mld-play-publisher/master-SNAPSHOT)

```groovy
	allprojects {
		repositories {
			maven { url 'https://jitpack.io' }
		}
	}
```

```groovy
	dependencies {
    	        implementation 'com.github.moonlitdoor:mld-play-publisher:master-SNAPSHOT'
    	}
```
 
## Issue Tracking
Want to file a bug? Want to suggest an idea? Add an [issue](https://github.com/moonlitdoor/mld-play-publisher/issues).

## License
All Moonlit Door Software is licensed under the [MIT License](./LICENSE).

## Contributing
Please see [CONTRIBUTING.md](./CONTRIBUTING.md) for details of how to build and contribute to the project.