# Example of using Kodif SDK

1. Your project should support Java 11
2. Add `mavenCentral()` in project `build.gradle`
```
repositories {
        google()
        mavenCentral()
    }
```
3. Add `implementation 'io.kodif.android:kodif-android:1.0.6'` in module `build.gradle`
4. Start KodifActivity and send your prams via intent

```
val intent = Intent(this, KodifActivity::class.java)
intent.putExtra("BASE_URL", "https://api.kodif.io")
intent.putExtra("flowUuid", "yourFlowUuid")
intent.putExtra("companyId", 0) //your companyId Id
intent.putExtra("email", "yourEmail@email.com")
startActivity(intent)
```
