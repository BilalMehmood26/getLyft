package com.usaclean.getlyftd.ui.vendor.products

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.usaclean.getlyftd.databinding.ItemVendorProductsBinding

class VendorProductsAdapter(val onClick: () -> Unit) :
    RecyclerView.Adapter<VendorProductsAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: ItemVendorProductsBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemVendorProductsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
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