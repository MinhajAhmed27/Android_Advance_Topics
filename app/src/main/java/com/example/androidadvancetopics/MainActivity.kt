package com.example.androidadvancetopics

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.paging.ExperimentalPagingApi
import com.example.androidadvancetopics.databinding.ActivityMainBinding
import com.example.androidadvancetopics.paging.QuotePagingAdapter
import com.example.androidadvancetopics.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@ExperimentalPagingApi
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private lateinit var quoteViewModel: MainViewModel
    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

/*        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.fragmentContainerView) as NavHostFragment

        navController = navHostFragment.navController*/
/*
            quoteViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

            val recyclerView = binding.quoteList
            val adapter = QuotePagingAdapter()
            recyclerView.setHasFixedSize(true)
            recyclerView.adapter = adapter


            quoteViewModel.list.observe(this) {

                adapter.submitData(lifecycle, it)
            }
*/


//        if (savedInstanceState == null) {
//            supportFragmentManager.beginTransaction()
//                .replace(R.id.container, MainFragment.newInstance())
//                .commitNow()
//        }
    }
}