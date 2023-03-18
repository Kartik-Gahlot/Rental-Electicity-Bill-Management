package com.example.rentalelecticitybillmanagement.ui.adapter

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.rentalelecticitybillmanagement.repo.Tenant

class TenantListAdapter(private val mList : ArrayList<Tenant>) : RecyclerView.Adapter<TenantViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TenantViewHolder {

    }

    override fun onBindViewHolder(holder: TenantViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return mList.size
    }
}

class TenantViewHolder(v : View) : RecyclerView.ViewHolder(v){

}