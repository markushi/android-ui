# android-ui
Android library for UI components.<br />
Gradle integration:

```groovy
repositories {
    mavenCentral()
}

dependencies {
    compile 'com.github.markushi:android-ui:1.2'
}
```

Requires API level 14+ <br />
[Download example apk](example.apk)

## Components

### ActionView
<img src="https://raw.githubusercontent.com/markushi/android-ui/master/example-action.gif" alt="ActionView Example" /><br />
A widget which can dynamically animate between defined Actions.
```xml
<at.markushi.ui.ActionView
	android:id="@+id/action"
	android:layout_width="56dip"
	android:layout_height="56dip"
	android:padding="16dip"
	app:av_color="@android:color/white"
	app:av_action="drawer"/>
```
You can dynamically change the action with:
```java
actionView.setAction(new BackAction(), ActionView.ROTATE_COUNTER_CLOCKWISE);
```

The following Actions are built in:

 * DrawerAction
 * BackAction
 * CloseAction
 * PlusAction

Please note: ActionView is still under development. The API might change at any time.

### RevealColorView
<img src="https://raw.githubusercontent.com/markushi/android-ui/master/example-reveal.gif" width="280px" alt="RevealColorView Example" /><br />
A component which mimics parts of the circular reveal/hide animation introduced [in the Android-L preview](http://developer.android.com/preview/material/animations.html#reveal).<br />
Note: This is not a backport of the original reveal/hide effect. 

See [this example gist](https://gist.github.com/markushi/68ce8df77bed164b6275) on how to use it.
