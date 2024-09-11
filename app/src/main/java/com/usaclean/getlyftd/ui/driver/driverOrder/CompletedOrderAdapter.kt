package com.usaclean.getlyftd.ui.driver.driverOrder

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.usaclean.getlyftd.databinding.ItemNewOrderBinding

class CompletedOrderAdapter (val onClick: () -> Unit) :
    RecyclerView.Adapter<CompletedOrderAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: ItemNewOrderBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemNewOrderBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return 2
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.apply {
            materialButton.visibility = View.GONE
            materialButton2.visibility = View.GONE
            root.setOnClickListener {
                onClick.invoke()
            }
        }
    }

}