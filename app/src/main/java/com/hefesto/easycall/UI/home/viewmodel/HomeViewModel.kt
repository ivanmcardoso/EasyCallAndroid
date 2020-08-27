package com.hefesto.easycall.UI.home.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hefesto.easycall.data.Contact

class HomeViewModel: ViewModel() {

    private val _contactSelectedLiveData = MutableLiveData<Contact>()
    val contactSelectedLiveData: LiveData<Contact> = _contactSelectedLiveData

    fun selectContact(contact: Contact) {
        _contactSelectedLiveData.value = contact
    }

}