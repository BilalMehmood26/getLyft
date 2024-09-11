package com.usaclean.getlyftd.ui.driver.driverOrder

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.usaclean.getlyftd.databinding.ItemRunningOrderBinding

class RunningOrderAdapter  (val onClick: () -> Unit) :
    RecyclerView.Adapter<RunningOrderAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: ItemRunningOrderBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemRunningOrderBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return 5
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.apply {
            root.setOnClickListener {
                onClick.invoke()
            }
        }
    }

}