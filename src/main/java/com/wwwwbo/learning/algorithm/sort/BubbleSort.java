package com.wwwwbo.learning.algorithm.sort;

/**
 * @author wangb
 * @date 2020/12/16 10:11
 **/
public class BubbleSort {

    public void sort(int[] data) {
        if (data == null || data.length <= 1) {
            return;
        }
        for (int i = 0; i < data.length; i++) {
            boolean breakFlag = true;
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int tmp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = tmp;
                    breakFlag = false;
                }
            }
            if (breakFlag) {
                break;
            }
        }
    }
}
