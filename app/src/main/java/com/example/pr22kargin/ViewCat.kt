package com.example.pr22kargin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class ViewCat : Fragment()
{
    lateinit var listCats :TextView
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View?
    {
        return inflater.inflate(R.layout.fragment_view_cat, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?)
    {
        super.onViewCreated(view, savedInstanceState)
        if(MainActivity.Cats.getOrNull(0)!= null)
        {
            var listCats : TextView? = getView()?.findViewById(R.id.listCats)
            var TotalStr :String = ""
            for (cat in MainActivity.Cats)
            {
                TotalStr += "Котик: " + cat.name + ", " + cat.age + " годиков/лет " + "\n"
            }
            listCats?.text = TotalStr
        }
    }
    companion object
    {
        fun newInstance() = ViewCat()

    }
}