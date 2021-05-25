package com.example.museumbooking.handler;

public interface ViewChaineBinding<T> {
    T bindView();
    T bindData();
    T bindEvents();
}
