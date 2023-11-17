package com.example.androidadvancetopics

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.paging.ExperimentalPagingApi
import com.example.androidadvancetopics.databinding.FragmentMainBinding
import com.example.androidadvancetopics.paging.QuotePagingAdapter
import com.example.androidadvancetopics.viewmodel.MainViewModel

@ExperimentalPagingApi
class MainFragment : Fragment() {

    private lateinit var quoteViewModel: MainViewModel
    lateinit var binding: FragmentMainBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        val view = inflater.inflate(R.layout.fragment_main, container, false)
        /*        quoteViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

                val recyclerView = binding.quoteList
                val adapter = QuotePagingAdapter()
                recyclerView.setHasFixedSize(true)
                recyclerView.adapter = adapter


                quoteViewModel.list.observe(viewLifecycleOwner) {

                    adapter.submitData(lifecycle, it)
                }
        */


        return view
    }

}