package com.hefesto.easycall.UI.home.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hefesto.easycall.R
import com.hefesto.easycall.data.Contact
import kotlinx.android.synthetic.main.item_list_contacts.view.*

class ContactAdapter(
    private val contactList: MutableList<Contact>,
    private val onCardClick: (Contact) -> Unit
) : RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder =
        LayoutInflater.from(parent.context).inflate(R.layout.item_list_contacts, parent,false)
            .let { ContactViewHolder(it) }


    override fun getItemCount() = contactList.size

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        holder.bindView(contactList[position], onCardClick)
    }
}

class ContactViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bindView(contact: Contact, onCardClick: (Contact) -> Unit) {
        itemView.item_contact_tv_name_letters.text = contact.letters
        itemView.item_contact_tv_name.text = contact.name
        itemView.item_contact_switch_active.isChecked = contact.active

        itemView.setOnClickListener {
            onCardClick(contact)
        }
    }
}