# java-support

[![](https://jitpack.io/v/ipcjs/java-support.svg)](https://jitpack.io/#ipcjs/java-support)

All files copy from Android Source Code.

## Features

- Functional Interface: `java.util.function.*` -> `java8.util.function.*`
- Objects: `java.util.Objects` -> `java7.util.Objects`
- Optional: `java.util.Optional*` -> `java8.util.Optional*`

## Usage

```groovy
allprojects {
	repositories {
		maven { url 'https://jitpack.io' }
	}
}
dependencies {
        compile 'com.github.ipcjs:java-support:0.1.0'
}
```
