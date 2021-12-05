package com.apps.whatsappui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentContainerView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.my_chats_item.*

class MyChatAdapter (private val context: Context, private val items: ArrayList<MyChat>):
    RecyclerView.Adapter<MyChatAdapter.ViewHolder>()  {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)=ViewHolder(
        LayoutInflater.from(context).inflate(R.layout.my_chats_item, parent, false)
    )

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(items.get(position))
    }

    class ViewHolder(override val containerView: View):
        RecyclerView.ViewHolder(containerView), LayoutContainer {
        fun bindItem(item:MyChat) {
            txtFriendName.text=item.nama
            txtFriendText.text=item.chatnya
            txtFriendCtg.text=item.centang
            txtFriendCtgg.text=item.centangb
        }
    }
}