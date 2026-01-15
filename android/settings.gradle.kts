pluginManagement {
    includeBuild("../node_modules/@react-native/gradle-plugin")
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }
}

rootProject.name = "Fire"

apply(from = File(rootDir, "../node_modules/@react-native-community/cli-platform-android/native_modules.gradle"))
val applyNativeModulesSettingsGradle: groovy.lang.Closure<Any> = extra.get("applyNativeModulesSettingsGradle") as groovy.lang.Closure<Any>
applyNativeModulesSettingsGradle(settings)

include(":app")
includeBuild("../node_modules/@react-native/gradle-plugin")
