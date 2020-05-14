package com.example.cache;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCacheV2<K, V> extends LinkedHashMap<K, V> {

    private int size;

    /*
     * super class constructor arguments are
     * cache size = MAX_ENTRIES
     * load factor = 0.75F
     * access order = true
     */

    public LRUCacheV2(int size) {
        super(size, 0.75F, true);
        this.size = size;
    }

    public static <K, V> LRUCacheV2<K, V> newInstance(int size) {
        return new LRUCacheV2<>(size);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > size;
    }

    public static void main(String[] args) {
        LRUCacheV2<String, Integer> cache = LRUCacheV2.newInstance(3);
        cache.put("abc", 1);
        cache.put("def", 2);
        cache.put("ghi", 3);
        cache.put("jkl", 4);
        cache.put("mno", 5);
        cache.put("abc", 1);
        System.out.println(cache);
    }
}

