package com.usaclean.getlyftd.ui.vendor.order

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.usaclean.getlyftd.databinding.ItemRunningOrderBinding
import com.usaclean.getlyftd.databinding.ItemVendorRunningBinding
import com.usaclean.getlyftd.ui.driver.driverOrder.RunningOrderAdapter

class VendorRunningOrderAdapter (val onClick: () -> Unit) :
    RecyclerView.Adapter<VendorRunningOrderAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: ItemVendorRunningBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemVendorRunningBinding.inflate(LayoutInflater.from(parent.context), parent, false)
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