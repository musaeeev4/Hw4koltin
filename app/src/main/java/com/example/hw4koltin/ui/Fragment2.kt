package com.example.hw4koltin.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.hw4koltin.databinding.Fragment2Binding
import com.example.hw4koltin.viewmodel.MainViewModel

class Fragment2 : Fragment() {

    private lateinit var binding: Fragment2Binding
    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = Fragment2Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)
        viewModel.counter.observe(viewLifecycleOwner,{
            binding.textViewResult.text = it.toString()
        })

    }

}