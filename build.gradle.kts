buildscript {
    val gradleVersion by extra { "7.0.3" }
    val kotlinVersion by extra { "1.6.10" }

    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:$gradleVersion")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
    }
}

task("clean", Delete::class) {
    delete(rootProject.buildDir)
}