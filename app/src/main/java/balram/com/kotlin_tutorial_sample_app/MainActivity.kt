package balram.com.kotlin_tutorial_sample_app

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


/*
Press shift twice in Android Studio Editor.
You should be able to see finder, then you should type convert Kotlin and select option*/

class MainActivity : AppCompatActivity() {

    // Kotlin Variable declaration

    var a:Int = 20;
    var b:Int = 10

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Kotlin Control Flow

        var result = if (a>b) a else b;
        Log.e("Result",""+result);


    }


}
