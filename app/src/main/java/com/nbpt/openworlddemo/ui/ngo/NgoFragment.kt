package com.nbpt.openworlddemo.ui.ngo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.support.v4.app.Fragment
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import com.nbpt.openworlddemo.R

class NgoFragment : Fragment() {

    private lateinit var ngoViewModel: NgoViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        ngoViewModel =
                ViewModelProviders.of(this).get(NgoViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_ngo, container, false)
        val textView: TextView = root.findViewById(R.id.text_ngo)
        ngoViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}
