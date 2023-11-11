package com.example.androidadvancetopics

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.paging.ExperimentalPagingApi
import com.example.androidadvancetopics.databinding.ActivityMainBinding
import com.example.androidadvancetopics.paging.QuotePagingAdapter
import com.example.androidadvancetopics.ui.main.MainFragment
import com.example.androidadvancetopics.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@ExperimentalPagingApi
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private lateinit var quoteViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

            quoteViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

            val recyclerView = binding.quoteList
            val adapter = QuotePagingAdapter()
            recyclerView.setHasFixedSize(true)
            recyclerView.adapter = adapter


            quoteViewModel.list.observe(this) {

                adapter.submitData(lifecycle, it)
            }


//        if (savedInstanceState == null) {
//            supportFragmentManager.beginTransaction()
//                .replace(R.id.container, MainFragment.newInstance())
//                .commitNow()
//        }
    }
}