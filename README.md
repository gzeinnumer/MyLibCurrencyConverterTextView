<p align="center">
  <img src="https://github.com/gzeinnumer/MyLibCurrencyConverterTextView/blob/master/preview/example1_1.jpg"/>
</p>

<h1 align="center">
    MyLibCurrencyConverterTextView
</h1>

<p align="center">
    <a><img src="https://img.shields.io/badge/Version-1.0.1-brightgreen.svg?style=flat"></a>
    <a><img src="https://img.shields.io/badge/ID-gzeinnumer-blue.svg?style=flat"></a>
    <a><img src="https://img.shields.io/badge/Java-Suport-green?logo=java&style=flat"></a>
    <a><img src="https://img.shields.io/badge/Kotlin-Suport-green?logo=kotlin&style=flat"></a>
    <a href="https://github.com/gzeinnumer"><img src="https://img.shields.io/github/followers/gzeinnumer?label=follow&style=social"></a>
    <br>
    <p>Simple way to convert 1000000 to Rp 1,000,000 .</p>
</p>

---
# Content List
* [Download](#download)
* [Feature List](#feature-list)
* [Usage](#usage)
* [Version](#version)
* [Contribution](#contribution)

---
# Download
Add maven `jitpack.io` and `dependencies` in build.gradle (Project) :
```gradle
// build.gradle project
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}

// build.gradle app/module
dependencies {
  ...
  implementation 'com.github.gzeinnumer:MyLibCurrencyConverterTextView:version'
}
```

---
# Feature List
- [x] **CurrencyConverter Programatically**.

---
# Usage

### CurrencyConverter Programatically.

**Note** `RP 123,456,789.111` To Remove `Prefix` `RP` and symbol `,` you can use this :
```java
TextView textView = findViewById(R.id.textView);
TextView textView2 = findViewById(R.id.textView2);

textView.setText(CurrencyTextView.changePattern("Rp ","10000"));

//remove prefix and comma
textView2.setText(CurrencyTextView.trimCommaOfString("Rp ",textView.getText().toString()));
```

**Preview** :
|<img src="https://github.com/gzeinnumer/MyLibCurrencyConverterTextView/blob/master/preview/example1_1.jpg" width="400"/>|
|---|

---
# Version
- **1.0.1**
  - First Release

---
# Contribution
You can sent your constibution to `branch` `open-pull`.

---

```
Copyright 2020 M. Fadli Zein
```
