package com.hefesto.easycall.UI.home.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import com.hefesto.easycall.R
import com.hefesto.easycall.UI.home.adapter.ContactAdapter
import com.hefesto.easycall.UI.home.viewmodel.HomeViewModel
import com.hefesto.easycall.UI.home.viewmodel.HomeViewModelFactory
import com.hefesto.easycall.utils.ContactListMock
import kotlinx.android.synthetic.main.fragment_list_contacts.*

class ContactListFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_list_contacts, container, false)
    }

   private val homeViewModel by lazy {
        ViewModelProviders.of(requireActivity(), HomeViewModelFactory()).get(HomeViewModel::class.java)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fg_list_contacts_rv_contacts_list.adapter = ContactAdapter(ContactListMock.contactMock){
            homeViewModel.selectContact(it)
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
    }

}