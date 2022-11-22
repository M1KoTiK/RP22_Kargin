package com.example.pr22kargin

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment


class MainActivity : AppCompatActivity() {
    lateinit var btnAddCat :Button
    lateinit var btnViewCat :Button
    lateinit var btnDelCat :Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().
        replace(R.id.placeHolder, AddCat()).
        commit()
        btnAddCat = findViewById(R.id.btnAddCat)
        btnViewCat = findViewById(R.id.btnViewCat)
        btnDelCat = findViewById(R.id.btnDelCat)



    }

    fun SwitchFragment(WorkFragment: Fragment)
    {
        supportFragmentManager.beginTransaction().
        replace(R.id.placeHolder, WorkFragment).
        commit()
    }

    fun ShowToast(text : String)
    {
        Toast.makeText(this ,text,Toast.LENGTH_SHORT).show()
    }

    fun btn_Click(view: View)
    {
        when(view.id)
        {
            R.id.btnViewCat -> SwitchFragment(ViewCat())
            R.id.btnAddCat -> SwitchFragment(AddCat())
            R.id.btnDelCat -> SwitchFragment(DelCat())
        }
    }
    companion object
    {
        var Cats = mutableListOf<Cat>()
    }
}