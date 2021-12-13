package com.apps.whatsappui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_status.*

class statusFragment : Fragment() {

    lateinit var listStatus:ArrayList<MyStatus>

    private fun simulasiDataStatus(){
        listStatus= ArrayList()
        listStatus.add(
            MyStatus("Mokamu Aku", "Today,", R.drawable.pp4)
        )
        listStatus.add(
            MyStatus("Kharis Petir", "Today,", R.drawable.pp3)
        )
        listStatus.add(
            MyStatus("Engga PP", "Today,", R.drawable.pp1)
        )
        listStatus.add(
            MyStatus("Fahroel Cimoel", "Yesterday,", R.drawable.pp6)
        )
        listStatus.add(
            MyStatus("Ijam Aja", "Yesterday,", R.drawable.pp5)
        )
        listStatus.add(
            MyStatus("Malinda M", "Yesterday,", R.drawable.pp2)
        )

    }

    private fun tampilStatus(){
        rv_listMyStatus.layoutManager=LinearLayoutManager(activity)
        rv_listMyStatus.adapter=MyStatusAdapter(requireActivity(), listStatus)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_status, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView(){
        simulasiDataStatus()
        tampilStatus()
    }

    override fun onDestroy(){
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}