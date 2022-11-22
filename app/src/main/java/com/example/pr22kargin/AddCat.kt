package com.example.pr22kargin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import android.widget.Toast.makeText
class AddCat : Fragment()
{
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View?
    {

        return inflater.inflate(R.layout.fragment_add_cat, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?)
    {
        super.onViewCreated(view, savedInstanceState)
        var btnAdd : Button? = getView()?.findViewById(R.id.btnFragmentAdd)
        btnAdd?.setOnClickListener {
            btnClick()
        }
    }
    fun btnClick()
    {
        var CatName : EditText? = getView()?.findViewById(R.id.boxName)
        var CatAge : EditText? = getView()?.findViewById(R.id.boxAge)
        var catAge :Int? = CatAge?.text.toString().toIntOrNull()
        if(CatName != null && CatAge != null && catAge != null )
        {
            MainActivity.Cats.add(Cat(CatName.text.toString(), catAge))
            CatName.setText("")
            CatAge.setText("")
        }
    }
    companion object
    {
        fun newInstance() = AddCat()


    }
}