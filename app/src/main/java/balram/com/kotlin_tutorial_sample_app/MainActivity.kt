package balram.com.kotlin_tutorial_sample_app

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


/*
Press shift twice in Android Studio Editor.
You should be able to see finder, then you should type convert Kotlin and select option*/

class MainActivity : AppCompatActivity() {

    // Kotlin Variable declaration

    var a: Int = 20;
    var b: Int = 10
    var c: Int = 1;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val numbers: MutableList<Int> = mutableListOf(1, 2, 3) //Mutable list

        Log.e("MutableList",""+numbers);

        // Imutable list

        val readOnlyView: List<Int> = numbers

        Log.e("readOnlyView",""+readOnlyView);

        // Hash set

        val strings = hashSetOf("a", "b", "c", "c")

        Log.e("Hash Set",""+strings);



        // Kotlin Control Flow

        var result = if (a > b) a else b;
        Log.e("Result", "" + result);


        // Kotlin When Expression

        /*when replaces the switch operator
        of C-like languages*/

        when (c) {
            1 -> Log.e("X==", "1");
            2 -> Log.e("X==", "2");
            else -> { // Note the block

                print("x is neither 1 nor 2")
            }
        }

        // Kotlin Returns and Jumps

        /*Break and Continue Labels*/
        loop@ for (i in 1..100) {
            Log.e("Loop", "" + i);
        }

        loop@ for (i in 1..100) {
            for (j in 1..100) {
                Log.e("Loop in J", "" + j);
                if (j == 50) break@loop
            }
        }

        // Return at Labels

        loop@ for (i in 1..100) {
            for (j in 1..100) {
                Log.e("Loop in J", "" + j);
                if (j == 10) return
            }
        }
        // Kotlin Collection Mutable List

        // Mutable list













    }


}



