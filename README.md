# Example of using Kodif SDK

1. Your project should support Java 11
2. Add `mavenCentral()` in project `build.gradle`
```
repositories {
        google()
        mavenCentral()
    }
```
3. Add `implementation 'io.kodif.android:kodif-android:1.0.7'` in module `build.gradle`
4. Start KodifActivity and send your prams via intent

```
val intent = Intent(this, KodifActivity::class.java)

intent.putExtra("flowUuid", "yourFlowUuid")

val initialParams = hashMapOf<String,String>()
initialParams["email"] = email //or user identifier specific to your flow
intent.putExtra("initialParams", initialParams)

startActivity(intent)
```
