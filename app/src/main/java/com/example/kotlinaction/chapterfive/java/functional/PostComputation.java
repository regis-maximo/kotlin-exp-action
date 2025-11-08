package com.example.kotlinaction.chapterfive.java.functional;

public interface PostComputation {
    void postponeComputation(int delay, Runnable runnable);
}
