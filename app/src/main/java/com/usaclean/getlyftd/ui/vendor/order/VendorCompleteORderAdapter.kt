package com.usaclean.getlyftd.ui.vendor.order

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.usaclean.getlyftd.databinding.ItemVendorCompletedBinding

class VendorCompleteORderAdapter(val onClick: () -> Unit) :
    RecyclerView.Adapter<VendorCompleteORderAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: ItemVendorCompletedBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemVendorCompletedBinding.inflate(LayoutInflater.from(parent.context), parent, false)
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