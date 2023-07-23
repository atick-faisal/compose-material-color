plugins {
    id("com.android.library") version "7.2.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
}

task("clean", Delete::class) {
    delete(rootProject.buildDir)
}