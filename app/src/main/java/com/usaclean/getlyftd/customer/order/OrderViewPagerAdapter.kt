package com.usaclean.getlyftd.customer.order

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.usaclean.getlyftd.customer.order.completedOrder.CompletedOrderFragment
import com.usaclean.getlyftd.customer.order.currentOrder.CurrentOrderFragment
import com.usaclean.getlyftd.customer.shop.shopDetails.reviews.ProductReviewFragment

class OrderViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return CurrentOrderFragment()
            1 -> return CompletedOrderFragment()
        }
        return CurrentOrderFragment()
    }
}