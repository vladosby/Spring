package com.borisov.listeners;

import com.borisov.annotations.PostInitialized;
import org.springframework.stereotype.Component;

/**
 * Created by vlados on 8/1/2016.
 */

@Component
public class CacheProviderImpl implements CacheProvider {
    @Override
    @PostInitialized
    public void warm() {
        System.out.println("Warming cache!!!");
    }
}
