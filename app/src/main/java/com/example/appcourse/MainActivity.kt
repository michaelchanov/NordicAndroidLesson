package com.example.appcourse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_one.*

class MainActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            val fragmentOne = FirstFragment()
            val fragmentTwo = SecondFragment()

            val someData = Bundle()
            someData.putString("key", "value")
            someData.putInt("intKey", 42)

            fragmentOne.arguments = someData

            fragmentTwo.arguments = Bundle().also {
                it.putString("key", "value")
                it.putInt("intKey", 42)
            }

            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, fragmentOne)
                .commit()

//            supreme.setOnClickListener {
//                supportFragmentManager.beginTransaction()
//                    .replace(R.id.fragmentContainer, fragmentOne)
//                    .commit()
//            }
//
//            newBalance.setOnClickListener {
//                supportFragmentManager.beginTransaction()
//                    .replace(R.id.fragmentContainer, fragmentTwo)
//                    .commit()
//            }
        }

    override fun onStop() {
        super.onStop()
        Log.i("Third fragment","Has been stopped")
    }
    fun someVeryImportantFeature(){
        repeat(10){

        }
        println("Txt")
    }

    fun anotherImportantFeature(){

    }
    }
