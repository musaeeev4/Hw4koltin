package com.example.hw4koltin.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.hw4koltin.databinding.Fragment1Binding
import com.example.hw4koltin.viewmodel.MainViewModel

class Fragment1 : Fragment() {

    private lateinit var binding: Fragment1Binding
    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = Fragment1Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)

        binding.plus.setOnClickListener {
            viewModel.onIccrementClick()
        }

        binding.minus.setOnClickListener {
            viewModel.onDecrementClick()
        }

    }

}