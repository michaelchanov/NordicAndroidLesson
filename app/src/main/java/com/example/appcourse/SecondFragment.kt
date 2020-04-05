package com.example.appcourse

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment2.*
import kotlinx.android.synthetic.main.fragment_one.*
import kotlinx.android.synthetic.main.fragment_one.selectSupreme

class SecondFragment :Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
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
        navToFirstFragment.setOnClickListener{
            fragmentManager?.beginTransaction()
                ?.replace(R.id.fragmentContainer,FirstFragment())
                ?.addToBackStack(null)
                ?.commit()
        }

    }
}