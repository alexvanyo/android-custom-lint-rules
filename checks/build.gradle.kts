plugins {
    kotlin("jvm")
    id("com.android.lint")
}

lintOptions {
    htmlReport = true
    htmlOutput = file("lint-report.html")
    textReport = true
    isAbsolutePaths = false
    isIgnoreTestSources = true
}

dependencies {
    // For a description of the below dependencies, see the main project README
    compileOnly(Dependencies.lintApi)
    // You typically don't need this one:
    compileOnly(Dependencies.lintChecks)
    compileOnly(kotlin("stdlib"))

    testImplementation(Dependencies.junit4)
    testImplementation(Dependencies.lintRuntime)
    testImplementation(Dependencies.lintTests)
}
