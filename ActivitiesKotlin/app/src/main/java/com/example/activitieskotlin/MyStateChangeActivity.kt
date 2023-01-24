package com.example.activitieskotlin

import android.app.Activity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MyStateChangeActivity: AppCompatActivity() {
     private val tag :String ="MyStateChangeActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(tag ,"onCreate()")

    }


    override fun onStart() {
        super.onStart()
        Log.d(tag ,"onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(tag ,"onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(tag ,"onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(tag ,"onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(tag ,"onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(tag ,"onRestart")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(tag ,"onRestoreInstanceState")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(tag ,"onSaveInstanceState")
    }



    // invoked when the activity may be temporarily destroyed, save the instance state here


}