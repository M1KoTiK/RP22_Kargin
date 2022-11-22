package com.example.pr22kargin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class DelCat : Fragment() {
    lateinit var boxDelCat :EditText
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_del_cat, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var btnDel : Button? = getView()?.findViewById(R.id.btnFragmentDel)
        btnDel?.setOnClickListener {
            btnClick()
        }
        var testBoxDel : EditText? = getView()?.findViewById(R.id.boxDelCat)
        if(testBoxDel != null)
        {
            boxDelCat = testBoxDel
        }

    }
    fun btnClick(){
        val position :Int = boxDelCat.text.toString().toIntOrNull()!!
        if( position != null && MainActivity.Cats.getOrNull(position)!= null)
        {
            val removeAt = MainActivity.Cats.removeAt(boxDelCat.text.toString().toInt())
            boxDelCat.setText("")
        }

    }
    companion object {

        @JvmStatic
        fun newInstance() = DelCat()
    }
}