package com.example.dzhafar.nav_arch_comp


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_account.*
import kotlinx.android.synthetic.main.fragment_name.*


class NameFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_name, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //First variant
        //nameTV.text = arguments?.getString("nameArg")
        //Second variant
        val args = NameFragmentArgs.fromBundle(arguments)
        val nameArg = args.nameArg
        nameTV.text = nameArg

    }


}
