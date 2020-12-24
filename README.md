<p align="center">
  <img src="https://github.com/gzeinnumer/MyLibCurrencyConverterTextView/blob/master/preview/example12.jpg" width="400"/>
</p>

<h1 align="center">
    MyLibCurrencyConverterTextView
</h1>

<p align="center">
    <a><img src="https://img.shields.io/badge/Version-1.0.0-brightgreen.svg?style=flat"></a>
    <a><img src="https://img.shields.io/badge/ID-gzeinnumer-blue.svg?style=flat"></a>
    <a><img src="https://img.shields.io/badge/Java-Suport-green?logo=java&style=flat"></a>
    <a><img src="https://img.shields.io/badge/Koltin-Suport-green?logo=kotlin&style=flat"></a>
    <a href="https://github.com/gzeinnumer"><img src="https://img.shields.io/github/followers/gzeinnumer?label=follow&style=social"></a>
    <br>
    <p>Simple way to convert 1000000 to Rp 1,000,000 .</p>
</p>

---
## Download
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
  implementation 'com.github.gzeinnumer:MyLibCurrencyConverterTextViewTextView:version'
  implementation 'com.google.android.material:material:1.2.0'
}
```

## Feature List
- [x] **CurrencyConverter Programatically**.

## Tech stack and 3rd library
- Material.io ([docs](https://material.io/develop/android/docs/getting-started))

---

**First Step**. Use `MaterialComponents` in your style :

```xml
<style name="AppTheme" parent="Theme.MaterialComponents.Light.NoActionBar">
    <!-- Customize your theme here. -->
</style>
```

---
## Use

### CurrencyConverter Programatically.

**Note** `RP 123,456,789.111` To Remove `Prefix` `RP` and symbol `,` you can use this :
```java
TextView textView = findViewById(R.id.tv);
TextView textView2 = findViewById(R.id.tv2);

textView.setText(CurrencyTextView.changePattern("Rp ","10000"));

//remove prefix and comma
textView2.setText(CurrencyTextView.trimCommaOfString("Rp ",textView.getText().toString()));
```

**Preview** :
|<img src="https://github.com/gzeinnumer/MyLibCurrencyConverterTextView/blob/master/preview/example6.jpg" width="400"/>|<img src="https://github.com/gzeinnumer/MyLibCurrencyConverterTextView/blob/master/preview/example11.jpg" width="400"/>|
|---|---|

---

**FullCode [MainActivity](https://github.com/gzeinnumer/MyLibCurrencyConverterTextView/blob/master/app/src/main/java/com/gzeinnumer/mylibcurrencyconverterTextView/MainActivity.java)  & [XML](https://github.com/gzeinnumer/MyLibCurrencyConverterTextView/blob/master/app/src/main/res/layout/activity_main.xml)**

---

### Version
- **1.0.0**
  - First Release

---

### Contribution
You can sent your constibution to `branche` `open-pull`.

---

```
Copyright 2020 M. Fadli Zein
```
