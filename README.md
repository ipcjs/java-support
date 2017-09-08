# java-support

All files copy from Android 25.

## Features

- Functional Interface: `java.util.function.*` -> `java8.util.function.*`
- Objects: `java.util.Objects` -> `java7.util.Objects`

## Usage

```groovy
allprojects {
	repositories {
		maven { url 'https://jitpack.io' }
	}
}
dependencies {
        compile 'com.github.ipcjs:java-support:0.0.2'
}
```