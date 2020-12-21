package com.wwwwbo.learning.algorithm.sort;

/**
 * @author wangb
 * @date 2020/12/16 10:27
 **/
public class InsertionSort {

    public void sort(int[] data) {
        if (data == null || data.length <= 1) {
            return;
        }
        for (int i = 1; i < data.length; ++i) {
            int value = data[i];
            int j = i - 1;
            for (; j >= 0; --j) {
                if (data[j] > value) {
                    data[j + 1] = data[j];
                } else {
                    break;
                }
            }
            data[j + 1] = value;
        }
    }
}
