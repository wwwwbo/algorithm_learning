package com.wwwwbo.learning.algorithm.sort;

/**
 * @author wangb
 * @date 2020/12/17 9:30
 **/
public class SelectionSort {

    public void sort(int[] data) {
        if (null == data || data.length <= 1) {
            return;
        }
        for (int i = 0; i < data.length; i++) {
            int min = i;
            for (int j = i; j < data.length; j++) {
                if (data[min] > data[j]) {
                    min = j;
                }
            }
            if (min != i) {
                int tmp = data[min];
                data[min] = data[i];
                data[i] = tmp;
            }
        }
    }

}
