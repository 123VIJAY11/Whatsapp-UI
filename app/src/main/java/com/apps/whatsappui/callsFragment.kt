package com.apps.whatsappui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_calls.*
import kotlinx.android.synthetic.main.fragment_chat.*

class callsFragment : Fragment() {
    lateinit var listCalls:ArrayList<MyCalls>

    private fun simulasiDataCalss(){
        listCalls= ArrayList()
        listCalls.add(
            MyCalls("Mokamu Aku", "Today,", R.drawable.pp4, R.drawable.ic_call_made_green)
        )
        listCalls.add(
            MyCalls("Kharis Petir", "Today,", R.drawable.pp3, R.drawable.ic_call_made_red)
        )
        listCalls.add(
            MyCalls("Malinda AHM", "Yesterday,", R.drawable.pp2, R.drawable.ic_call_received_green)
        )
        listCalls.add(
            MyCalls("Idzam Muhammad", "Yesterday,", R.drawable.pp5, R.drawable.ic_call_received_red)
        )
        listCalls.add(
            MyCalls("Fahrul Top Topan", "December 2,", R.drawable.pp6, R.drawable.ic_call_made_green)
        )
        listCalls.add(
            MyCalls("Engga PP", "November 28,", R.drawable.pp1, R.drawable.ic_call_received_red)
        )
    }

    private fun tampilCalss(){
        rv_listMycalls.layoutManager= LinearLayoutManager(activity)
        rv_listMycalls.adapter=MyCallsAdapter(requireActivity(), listCalls)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_calls, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView(){
        simulasiDataCalss()
        tampilCalss()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}