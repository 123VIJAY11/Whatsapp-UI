package com.apps.whatsappui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.my_calls_item.*
import kotlinx.android.synthetic.main.my_chats_item.*
import kotlinx.android.synthetic.main.my_chats_item.txtFriendNameChat
import kotlinx.android.synthetic.main.my_chats_item.txtFriendTextChat
import kotlinx.android.synthetic.main.my_chats_item.pp1 as pp11

class MyCallsAdapter (private val context: Context, private val items: ArrayList<MyCalls>):
    RecyclerView.Adapter<MyCallsAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)=ViewHolder(
        LayoutInflater.from(context).inflate(R.layout.my_calls_item, parent, false)
    )

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(items.get(position))
    }

    class ViewHolder(override val containerView: View):
        RecyclerView.ViewHolder(containerView), LayoutContainer {
        fun bindItem(item: MyCalls) {
            txtFriendNameCall.text=item.nama
            txtDateCall.text = item.tanggal
            this.pp.setImageResource(item.gambar)
            this.arrow.setImageResource(item.panah)
        }
    }
}