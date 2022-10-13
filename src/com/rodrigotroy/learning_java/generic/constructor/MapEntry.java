package com.rodrigotroy.learning_java.generic.constructor;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning_java_generics
 * User: rodrigotroy
 * Date: 2019-04-24
 * Time: 11:05
 */
public class MapEntry<K, V> {
    private K key;
    private V value;

    public MapEntry(K key,
                    V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
