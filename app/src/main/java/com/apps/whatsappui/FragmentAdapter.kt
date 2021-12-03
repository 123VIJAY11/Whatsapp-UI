package com.apps.whatsappui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class FragmentAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 4
    }

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0->{
                camFragment()
            }
            1->{
                chatFragment()
            }
            2->{
                statusFragment()
            }
            3->{
                callsFragment()
            }else->{
                chatFragment()
            }
        }
    }

}