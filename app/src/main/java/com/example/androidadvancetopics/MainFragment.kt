package com.example.androidadvancetopics.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.paging.ExperimentalPagingApi
import com.example.androidadvancetopics.R
import com.example.androidadvancetopics.databinding.FragmentMainBinding
import com.example.androidadvancetopics.paging.QuotePagingAdapter
import com.example.androidadvancetopics.viewmodel.MainViewModel

@ExperimentalPagingApi
class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var quoteViewModel: MainViewModel
    lateinit var binding: FragmentMainBinding
 /*   override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        quoteViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        val recyclerView = binding.quoteList
        val adapter = QuotePagingAdapter()
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = adapter


        quoteViewModel.list.observe(context) {
            adapter.submitData(lifecycle, it)
        }

        return inflater.inflate(R.layout.fragment_main, container, false)
    }*/

//    override fun onActivityCreated(savedInstanceState: Bundle?) {
//        super.onActivityCreated(savedInstanceState)
//        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
//        // TODO: Use the ViewModel
//    }

}