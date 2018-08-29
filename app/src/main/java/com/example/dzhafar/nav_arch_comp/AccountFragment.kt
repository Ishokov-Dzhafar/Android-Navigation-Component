package com.example.dzhafar.nav_arch_comp


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_account.*

class AccountFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_account, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        nextBtn.setOnClickListener{
            /* First Variant
            val nameBundle = Bundle()
            nameBundle.putString("nameArg", nameET.text.toString())
            it.findNavController().navigate(R.id.nameFragment, nameBundle)*/
            //Second Variant
            val action = AccountFragmentDirections.toNameFragment()
            action.setNameArg(nameET.text.toString())
            it.findNavController().navigate(action)
        }
    }
}
