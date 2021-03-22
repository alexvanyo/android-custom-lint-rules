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
    compileOnly("com.android.tools.lint:lint-api:${Versions.lint}")
    // You typically don't need this one:
    compileOnly("com.android.tools.lint:lint-checks:${Versions.lint}")
    compileOnly(kotlin("stdlib"))

    testImplementation("junit:junit:4.13.2")
    testImplementation("com.android.tools.lint:lint:${Versions.lint}")
    testImplementation("com.android.tools.lint:lint-tests:${Versions.lint}")
}
