package com.trulyfuture.rozcar.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.trulyfuture.rozcar.databinding.ItemOnboardingBinding
import com.trulyfuture.rozcar.screens.onboarding.OnboardingItemModel

class OnboardingAdapter(val onboartingItemList: List<OnboardingItemModel>) :
    RecyclerView.Adapter<OnboardingAdapter.OnboardingViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OnboardingViewHolder {
        return OnboardingViewHolder(
            binding = ItemOnboardingBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: OnboardingViewHolder, position: Int) {
        holder.bind(onboartingItemList[position])
    }

    override fun getItemCount(): Int {
        return onboartingItemList.size
    }

    class OnboardingViewHolder(
        private val binding: ItemOnboardingBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: OnboardingItemModel) {

        }

    }


}