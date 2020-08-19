package com.example.recycleview1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var rvHorizontal: RecyclerView? = null
    private var rvVertical: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
        initList()
    }

    private fun initView(){
        rvHorizontal = findViewById(R.id.rvHorizontal)
        rvVertical = findViewById(R.id.rvVertical)
    }

    private fun initList(){
        val listHorizontal = arrayListOf<String>()
        val listVertical = arrayListOf<String>()
        for (i in 1..10){
            listHorizontal.add("item num $i")
            listVertical.add("item num $i")
        }

        val adapterHorizontal = AdapterOfDeath(listHorizontal)
        rvHorizontal?.adapter = adapterHorizontal

        val adapterVertical = AdapterOfWhaaat(listVertical)
        rvVertical?.adapter = adapterVertical
    }
}