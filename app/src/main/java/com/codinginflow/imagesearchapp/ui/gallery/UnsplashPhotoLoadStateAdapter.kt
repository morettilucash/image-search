package com.codinginflow.imagesearchapp.ui.gallery

import android.view.ViewGroup
import androidx.paging.LoadState
import androidx.paging.LoadStateAdapter
import androidx.recyclerview.widget.RecyclerView
import com.codinginflow.imagesearchapp.databinding.UnsplashPhotoLoadStateFooterBinding

class UnsplashPhotoLoadStateAdapter : LoadStateAdapter<UnsplashPhotoLoadStateAdapter.LoadStateViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, loadState: LoadState): LoadStateViewHolder {
       val binding: UnsplashPhotoLoadStateFooterBinding
    }

    override fun onBindViewHolder(holder: LoadStateViewHolder, loadState: LoadState) {
        TODO("Not yet implemented")
    }

    class LoadStateViewHolder(private val binding: UnsplashPhotoLoadStateFooterBinding) : RecyclerView.ViewHolder(binding.root) {

    }
}