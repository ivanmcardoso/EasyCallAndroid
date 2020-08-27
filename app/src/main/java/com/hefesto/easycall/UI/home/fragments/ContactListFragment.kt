package com.hefesto.easycall.UI.home.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.hefesto.easycall.R
import com.hefesto.easycall.UI.home.adapter.ContactAdapter
import com.hefesto.easycall.utils.ContactListMock
import kotlinx.android.synthetic.main.fragment_list_contacts.*

class ContactListFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_list_contacts, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fg_list_contacts_rv_contacts_list.adapter = ContactAdapter(ContactListMock.contactMock){
            Toast.makeText(requireContext(), it.name, Toast.LENGTH_LONG).show()
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
    }

}