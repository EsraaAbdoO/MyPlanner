package com.example.myplanner

import RecyclerView.RecyclerAdapter
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myplanner.databinding.FragmentToDoListBinding

class ToDoListFragment : Fragment() {

        private lateinit var binding: FragmentToDoListBinding
        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View {
            binding = FragmentToDoListBinding.inflate(inflater, container, false)
            binding.recyclerView.adapter = RecyclerAdapter()
            val listData = mutableListOf<String>()
            listData.add("wake up")
            listData.add("have breakfast")
            listData.add("study")
            listData.add("have lunch")
            listData.add("do dishes")
            listData.add("do exercise")
            listData.add("study")
            RecyclerAdapter().list = listData
            return binding.root
        }
    }
