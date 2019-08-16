package com.example.usecase3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.usecase3.databinding.ItemPlatformBinding;

import java.util.ArrayList;
import java.util.List;

class PlatformAdapter extends RecyclerView.Adapter<PlatformAdapter.ViewHolder> {

    List<PlatformItemViewModel> platformItemViewModelList = new ArrayList<>();

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ItemPlatformBinding itemPlatformBinding = ItemPlatformBinding.inflate(layoutInflater, parent, false);
        return new ViewHolder(itemPlatformBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        PlatformItemViewModel platformItemViewModel = platformItemViewModelList.get(position);
        holder.bind(platformItemViewModel);
    }

    @Override
    public int getItemCount() {
        return platformItemViewModelList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private ItemPlatformBinding itemPlatformBinding;

        public ViewHolder(ItemPlatformBinding itemPlatformBinding) {
            super(itemPlatformBinding.getRoot());
            this.itemPlatformBinding = itemPlatformBinding;
        }

        public void bind(PlatformItemViewModel platformItemViewModel) {
            itemPlatformBinding.setPlatformItemViewModel(platformItemViewModel);
        }
    }
}
