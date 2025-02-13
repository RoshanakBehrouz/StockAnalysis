plugins {
    id("application")
}

repositories {
    mavenCentral()
}

dependencies {
    // JSON Parsing Library
    implementation("org.json:json:20210307")

    // HTTP Client for API Calls (For Fetching Stock Data)
    implementation("com.squareup.okhttp3:okhttp:4.9.3")

    // SQLite JDBC Driver (For Storing Stock Data)
    implementation("org.xerial:sqlite-jdbc:3.36.0")

    // Apache Commons Math (For Stock Price Prediction)
    implementation("org.apache.commons:commons-math3:3.6.1")

    // Java Swing (Included in JDK, no extra dependency required)
}

application {
    mainClass.set("com.sdm.stock.StockGUI") // GUI as the default main class
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(17)) // Ensure Java 17+
}

