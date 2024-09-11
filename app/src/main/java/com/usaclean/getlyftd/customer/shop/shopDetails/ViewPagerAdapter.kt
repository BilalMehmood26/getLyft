package com.usaclean.getlyftd.customer.shop.shopDetails

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.usaclean.getlyftd.customer.shop.shopDetails.products.ProductsListFragment
import com.usaclean.getlyftd.customer.shop.shopDetails.reviews.ProductReviewFragment

class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle)  {

    override fun getItemCount(): Int {
       return 2
    }

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return ProductsListFragment()
            1 -> return ProductReviewFragment()
        }
        return ProductReviewFragment()
    }
}