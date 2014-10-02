# android-ui
Android library for UI components.

Gradle integration:

```
repositories {
    mavenCentral()
}

dependencies {
    compile 'com.github.markushi:android-ui:1.0'
}
```

## RevealColorView
<img src="https://raw.githubusercontent.com/markushi/android-ui/master/example.gif" width="280px" alt="Sample" />

[Download example apk](example.apk)

Requires API level 14+

A component which mimics parts of the circular reveal/hide animation introduced in Android-L

(See: https://developer.android.com/preview/material/animations.html#reveal)

Note: This is not a backport of the original reveal/hide effect. 

See [this example gist](https://gist.github.com/markushi/68ce8df77bed164b6275) on how to use it.
