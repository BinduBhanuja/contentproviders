package com.example.usecase3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.usecase3.databinding.ItemContentBinding;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

class ContentAdapter extends RecyclerView.Adapter<ContentAdapter.ViewHolder> {

    private List<ContentItemViewModel> contentItemViewModelList = new ArrayList<>();
    private MainViewModel mainViewModel;

    @Inject
    public ContentAdapter(MainViewModel mainViewModel) {
        this.mainViewModel = mainViewModel;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ItemContentBinding itemContentBinding = ItemContentBinding.inflate(layoutInflater, parent, false);
        return new ViewHolder(itemContentBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ContentItemViewModel contentItemViewModel = contentItemViewModelList.get(position);
        holder.bind(contentItemViewModel, mainViewModel);
    }

    @Override
    public int getItemCount() {
        return contentItemViewModelList.size();
    }

    public void setAdapterData(List<ContentItemViewModel> contentItemViewModelList) {
        this.contentItemViewModelList = contentItemViewModelList;
        notifyDataSetChanged();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private ItemContentBinding itemContentBinding;

        public ViewHolder(ItemContentBinding itemContentBinding) {
            super(itemContentBinding.getRoot());
            this.itemContentBinding = itemContentBinding;
        }

        public void bind(ContentItemViewModel contentItemViewModel, MainViewModel mainViewModel) {
            itemContentBinding.setContentItemViewModel(contentItemViewModel);
            itemContentBinding.setMainViewModel(mainViewModel);
        }
    }
}
