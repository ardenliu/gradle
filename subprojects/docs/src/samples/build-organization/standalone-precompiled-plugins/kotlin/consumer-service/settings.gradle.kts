pluginManagement {
    repositories {
        // NOTE: This is only needed to demonstrate resolving the plugin in this sample.
        // Your plugin should be published to an artifact repository or to the Plugin Portal
        maven {
            url = uri("../build/my-repo")
        }
        gradlePluginPortal()
    }
}
