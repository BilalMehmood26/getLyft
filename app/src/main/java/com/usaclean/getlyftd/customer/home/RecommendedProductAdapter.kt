package com.usaclean.getlyftd.customer.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.usaclean.getlyftd.data.ProductModel
import com.usaclean.getlyftd.databinding.ItemCategoryBinding
import com.usaclean.getlyftd.databinding.ItemRecommendedProductsBinding

class RecommendedProductAdapter (val prodList: ArrayList<ProductModel>,val onClick: () -> Unit) :
    RecyclerView.Adapter<RecommendedProductAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: ItemRecommendedProductsBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemRecommendedProductsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return prodList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = prodList[position]
        holder.binding.apply {

            prodIv.load(item.prodImg)
            prodTitle.text = item.prodName
            reviewTv.text = item.prodRating
            priceTv.text = item.prodPrice
            root.setOnClickListener {
                onClick.invoke()
            }
        }
    }

}