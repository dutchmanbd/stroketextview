## StrokeTextView Library

## Get Started

Add it in your root build.gradle at the end of repositories:

```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }	
	}
}
```
Add the dependency

```
dependencies {
	implementation 'com.github.dutchmanbd:stroketextview:1.0.0
}
```

### How to use

```
<com.zxdmjr.stroketextview.StrokeTextView
        android:id="+@/strokeTextView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:text="Hello World!"
        app:textSize="18sp"
        app:strokeColor="@color/colorWhite"
        app:textColor="@color/colorBlack"
        />
```





