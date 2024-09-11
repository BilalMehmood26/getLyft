package com.usaclean.getlyftd.customer.cart.addToCart

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.usaclean.getlyftd.customer.shop.shopList.ShopAdapter
import com.usaclean.getlyftd.databinding.ItemCartBinding
import com.usaclean.getlyftd.databinding.ItemShopsBinding

class AddToCartAdapter(val onClick: ()->Unit) : RecyclerView.Adapter<AddToCartAdapter.ViewHolder>() {
    inner class ViewHolder(val binding: ItemCartBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemCartBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return 3
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.apply {
            root.setOnClickListener {
                onClick.invoke()
            }
        }
    }
}