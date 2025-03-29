# 📊 StockAnalysis - JavaFX Stock Prediction App

## 🧠 Overview

**StockAnalysis** is a JavaFX-based desktop application for visualizing and analyzing stock market predictions using various machine learning regression models.

---

## 🚀 Getting Started

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/RoshanakBehrouz/StockAnalysis.git
cd StockAnalysis
```

### 2️⃣ Build the Application

```bash
./gradlew build
```

This will:

- ✅ Compile the project  
- ✅ Run **Checkstyle** and **PMD**  
- ✅ Run all unit tests  
- ✅ Generate reports in `build/reports/`

> 💥 **If the build fails due to rule violations, refer to the generated reports in the `/build/reports/` folder.**

---

### 3️⃣ Run the Application

```bash
./gradlew run
```

> 💡 **Ensure `JAVAFX_HOME` is set** if JavaFX is not included in your system environment:

1. Download JavaFX SDK version 21  
2. Set the path:

```bash
export JAVAFX_HOME=/path/to/javafx-sdk
```

---

### 4️⃣ Run Unit Tests

```bash
./gradlew test
```

- Uses **JUnit 5** and **Mockito**  
- GUI-related tests are skipped automatically in CI (e.g., GitHub Actions)

---

## ✅ Code Quality Tools

This project integrates:

- 🧹 **Checkstyle** – Enforces coding style
- 🕵️ **PMD** – Detects potential code issues

---

### 📁 Reports Location

- **Checkstyle**:  
  - `build/reports/checkstyle/main.html`  
  - `build/reports/checkstyle/test.html`

- **PMD**:  
  - Standard: `build/reports/pmd/main.html`, `test.html`  
  - Grouped (custom): `build/reports/pmd/pmd_report_grouped.html`

---

## 🛠️ Manually Generate Grouped PMD Report

To generate an enhanced, grouped PMD report by priority/severity, run:

```bash
python3 scripts/generate_pmd_report.py
```

This script:

- Parses PMD XML reports  
- Creates a grouped HTML report:

📄 `build/reports/pmd/pmd_report_grouped.html`

> ⚠️ **This task must be run manually**, as it doesn't run automatically after a failed Gradle build.

---

## 📁 Project Structure

```bash
├── src/main/java       # Application source code  
├── src/test/java       # Unit & Integration tests  
├── config/             # PMD & Checkstyle config files  
├── scripts/            # Python script for grouped PMD report  
├── build.gradle        # Build logic and dependencies  
└── README.md           # Project info and usage guide  
```

---

## 📌 Notes for Developers

- 🧱 **PMD** and **Checkstyle** are strict — the build will fail if violations are found  
- ✂️ Keep methods under **50 lines** where possible  
- 🧼 Use consistent **indentation** and **Javadoc comments**  

**To inspect issues:**

- Open these files in a browser:
  - `build/reports/checkstyle/main.html`
  - `build/reports/pmd/main.html`
- After PMD runs, don't forget to **manually generate the grouped HTML report**

---

## 👥 Team Setup Recommendations

To ensure smooth development:

- ✅ Java 21 (Temurin or OpenJDK)  
- ✅ Gradle 8+  
- ✅ JavaFX SDK 21+  
- ✅ Python 3 (for the PMD report script)

---
