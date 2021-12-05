package com.apps.whatsappui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_chat.*

class chatFragment : Fragment(){
    lateinit var listChat:ArrayList<MyChat>

        private fun simulasiDataChat(){
            listChat= ArrayList()
            listChat.add(
                MyChat("Mokamu Aku", "Hai cantik :)", ".", "✔✔")
            )
            listChat.add(
                MyChat("Kharis Petir", "He lapo??",".","✔✔")
            )
            listChat.add(
                MyChat("Engga gpp", "Siap wes.. aman", "✔",".")
            )
            listChat.add(
                MyChat("Fahroel Cimoel", "Lapo bro?", "✔✔", ".")
            )
            listChat.add(
                MyChat("Ijam Aja", "Ayo mabar!", "✔",".")
            )
            listChat.add(
                MyChat("Malinda M", "Helehh preketek", "✔",".")
            )
        }

    private fun tampilChat(){
        rv_listMychats.layoutManager= LinearLayoutManager(activity)
        rv_listMychats.adapter=MyChatAdapter(requireActivity(), listChat)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_chat, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView(){
        simulasiDataChat()
        tampilChat()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}