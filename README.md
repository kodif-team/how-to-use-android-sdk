# Example of using Kodif SDK

1. Your project should support Java 11
2. Add `mavenCentral()` in project `build.gradle`
```
repositories {
        google()
        mavenCentral()
    }
```
3. Add `implementation 'io.kodif.android:kodif-android:1.0.13'` in module `build.gradle`
4. Start KodifActivity and send your prams via intent

```
val intent = Intent(this, KodifActivity::class.java)

intent.putExtra("flowUuid", "yourFlowUuid")

val initialParams = hashMapOf<String,String>()
initialParams["email"] = email //or user identifier specific to your flow
intent.putExtra("initialParams", initialParams)

startActivity(intent)
```

# Example of using callback

To open another activity in the same app you can use “callback“ function:

Examples:

callback button in flow

```
{
 "type": "button",
 "variable": {
   "value": "1",
   "key": "submitInput", 
 },
 "data": {
   "title": "Click Me", // button text
 },
  "action": {
    "actionType": "callback",
    "actionData": {
        "key": "textField" // key of the view which the result will show in
        "view": "com.eample.MapActivity" // the name of Activity with package name wich you want to open
    }
  }
}
```
to pass a data to Kodif SDK just put the data in the intent extra

```
button.setOnClickListener {
        intent.putExtra("value", "Central Park West, New York, NY 10024")
        setResult(RESULT_OK, intent)
        finish()
}

```
