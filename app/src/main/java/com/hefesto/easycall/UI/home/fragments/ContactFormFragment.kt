package com.hefesto.easycall.UI.home.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import com.hefesto.easycall.R
import com.hefesto.easycall.UI.home.viewmodel.HomeViewModel
import com.hefesto.easycall.UI.home.viewmodel.HomeViewModelFactory
import kotlinx.android.synthetic.main.fragment_contact_form.*

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class ContactFormFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contact_form, container, false)
    }
    private val homeViewModel by lazy {
        ViewModelProviders.of(requireActivity(), HomeViewModelFactory()).get(HomeViewModel::class.java)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        homeViewModel.contactSelectedLiveData.observe(viewLifecycleOwner, Observer { contact ->
            Toast.makeText(requireContext(), contact.name, Toast.LENGTH_LONG).show()
            fg_contact_form_tv_name_letters.text = contact.letters
            fg_contact_form_tiet_name.setText(contact.name)
            fg_contact_form_tiet_number.setText(contact.number)
        })


    }
}