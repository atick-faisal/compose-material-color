plugins {
    id("com.android.library") version "7.4.2" apply false
    id("org.jetbrains.kotlin.android") version "1.7.10" apply false
}

task("clean", Delete::class) {
    delete(rootProject.buildDir)
}