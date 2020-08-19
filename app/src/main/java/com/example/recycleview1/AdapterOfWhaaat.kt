package com.example.recycleview1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class AdapterOfWhaaat (private val array: ArrayList<String>):RecyclerView.Adapter<ViewHolderOfWhaaat>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderOfWhaaat {
        val viewVertical = LayoutInflater.from(parent.context).inflate(R.layout.rv_vertical, parent, false)

        return ViewHolderOfWhaaat(viewVertical)
    }

    override fun getItemCount(): Int {
        return array.size
    }

    override fun onBindViewHolder(holder: ViewHolderOfWhaaat, position: Int) {

    }

}

class ViewHolderOfWhaaat(view: View): RecyclerView.ViewHolder(view) {

}

