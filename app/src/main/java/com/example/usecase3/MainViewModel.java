package com.example.usecase3;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

import com.example.usecase3.models.ContentProvider;
import com.example.usecase3.models.Platform;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

public class MainViewModel implements LifecycleObserver {

    @Inject
    private ContentAdapter contentAdapter;

    private List<ContentProvider> contentProviderList = new ArrayList<>();
    private List<ContentItemViewModel> contentItemViewModelList = new ArrayList<>();

    @Inject
    MainViewModel() {}

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void init() {
        contentAdapter = new ContentAdapter(this);
        createRequiredData();
        setAdapterData();
    }

    private void createRequiredData() {
        ContentProvider content1 = new ContentProvider();
        content1.setTitle("Friends");
        content1.setCategory(0);
        content1.setLanguage("English");
        content1.setPlatFormName("Amazon");
        content1.setLogo(R.drawable.ic_launcher_background);
        content1.setLoggedIn(true);
        content1.setPrime(true);
        content1.setSubscriptionFee(295.90);

        ContentProvider content2 = new ContentProvider();
        content2.setTitle("Aladdin");
        content2.setCategory(1);
        content2.setLanguage("English");
        content2.setPlatFormName("Zee5");
        content2.setLogo(R.drawable.ic_launcher_foreground);
        content2.setLoggedIn(false);
        content2.setPrime(true);
        content2.setSubscriptionFee(175.75);

//        ContentProvider content3 = new ContentProvider();
//        content1.setTitle("Game Of Thrones");
//        content1.setCategory(0);
//        content1.setLanguage("English");

        contentProviderList.add(content1);
        contentProviderList.add(content2);
//        contentProviderList.add(content3);
    }

    private void setAdapterData() {
        for (int i = 0; i < contentProviderList.size(); i++) {
            ContentItemViewModel contentItemViewModel = new ContentItemViewModel(contentProviderList.get(i).getTitle(),
                    contentProviderList.get(i).getLanguage(), contentProviderList.get(i).getCategory(),
                    contentProviderList.get(i).getPlatFormName(), contentProviderList.get(i).getLogo(),
                    contentProviderList.get(i).isLoggedIn(), contentProviderList.get(i).isPrime(),
                    contentProviderList.get(i).getSubscriptionFee());
            contentItemViewModelList.add(contentItemViewModel);
        }
        contentAdapter.setAdapterData(contentItemViewModelList);
    }

    public ContentAdapter getContentAdapter() {
        return contentAdapter;
    }
}
