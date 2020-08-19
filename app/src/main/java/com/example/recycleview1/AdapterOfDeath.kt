package com.example.recycleview1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class AdapterOfDeath (private val array: ArrayList<String>):RecyclerView.Adapter<ViewHolderOfDeath>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderOfDeath {
        val viewHorizontal = LayoutInflater.from(parent.context).inflate(R.layout.rv_horizontal, parent, false)

        return ViewHolderOfDeath(viewHorizontal)
    }

    override fun getItemCount(): Int {
        return array.size
    }

    override fun onBindViewHolder(holder: ViewHolderOfDeath, position: Int) {

    }

}

class ViewHolderOfDeath(view: View): RecyclerView.ViewHolder(view) {

}

