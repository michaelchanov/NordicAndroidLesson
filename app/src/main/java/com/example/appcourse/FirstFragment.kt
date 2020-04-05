package com.example.appcourse

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_one.*

class FirstFragment: Fragment() {
    private lateinit var savedView:View
override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstaneState: Bundle?
    ): View? {
  if (!this::savedView.isInitialized){
      savedView =inflater.inflate(R.layout.fragment_one,container,false)
  }
    return savedView
}

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        selectSupreme.setOnClickListener{
            if (selectionSupreme.visibility == View.GONE){
                selectionSupreme.visibility = View.VISIBLE
            } else {
                selectionSupreme.visibility = View.GONE
            }
        }
        navToSecondFragment.setOnClickListener{
            fragmentManager?.beginTransaction()
                ?.replace(R.id.fragmentContainer,SecondFragment())
                ?.addToBackStack(null)
            ?.commit()
        }

    }
}