package com.usaclean.getlyftd.ui.driver.wallet

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.usaclean.getlyftd.databinding.ItemNewOrderBinding
import com.usaclean.getlyftd.databinding.ItemWalletBinding
import com.usaclean.getlyftd.ui.driver.driverOrder.NewOrderAdapter

class WalletAdpater (val onClick: () -> Unit) :
    RecyclerView.Adapter<WalletAdpater.ViewHolder>() {

    inner class ViewHolder(val binding: ItemWalletBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemWalletBinding.inflate(LayoutInflater.from(parent.context), parent, false)
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