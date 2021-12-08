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
            MyCalls("Mokamu Aku", "Hari Ini")
        )
        listCalls.add(
            MyCalls("Kharis Petir", "Kemarin")
        )
        listCalls.add(
            MyCalls("Malinda AHM", "Wingi")
        )
        listCalls.add(
            MyCalls("Idzam Muhammad", "Bien")
        )
        listCalls.add(
            MyCalls("Fahrul Top Topan", "Bien")
        )
        listCalls.add(
            MyCalls("Engga PP", "Hari Ini")
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