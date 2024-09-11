package com.usaclean.getlyftd.ui.vendor.order

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.usaclean.getlyftd.databinding.ItemNewOrderBinding
import com.usaclean.getlyftd.databinding.ItemVendorNewBinding
import com.usaclean.getlyftd.ui.driver.driverOrder.NewOrderAdapter

class NewOrderVendorAdapter(val onClick: () -> Unit) :
    RecyclerView.Adapter<NewOrderVendorAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: ItemVendorNewBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemVendorNewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
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