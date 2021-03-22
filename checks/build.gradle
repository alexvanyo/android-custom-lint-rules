apply plugin: 'java-library'
apply plugin: 'kotlin'
apply plugin: 'com.android.lint'

lintOptions {
    htmlReport true
    htmlOutput file("lint-report.html")
    textReport true
    absolutePaths false
    ignoreTestSources true
}

dependencies {
    // For a description of the below dependencies, see the main project README
    compileOnly "com.android.tools.lint:lint-api:${Versions.lint}"
    // You typically don't need this one:
    compileOnly "com.android.tools.lint:lint-checks:${Versions.lint}"
    compileOnly "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"

    testImplementation "junit:junit:4.13.2"
    testImplementation "com.android.tools.lint:lint:${Versions.lint}"
    testImplementation "com.android.tools.lint:lint-tests:${Versions.lint}"
}

sourceCompatibility = "1.8"
targetCompatibility = "1.8"
