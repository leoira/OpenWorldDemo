package com.nbpt.openworlddemo.ui.acc

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.support.v4.app.Fragment
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import com.nbpt.openworlddemo.R

class AccFragment : Fragment() {

    private lateinit var accViewModel: AccViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        accViewModel =
                ViewModelProviders.of(this).get(AccViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_acc, container, false)
        val textView: TextView = root.findViewById(R.id.text_acc)
        accViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}
