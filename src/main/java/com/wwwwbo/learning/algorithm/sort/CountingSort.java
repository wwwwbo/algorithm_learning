package com.wwwwbo.learning.algorithm.sort;

/**
 * @author wangb
 * @date 2020/12/21 16:37
 **/
public class CountingSort {

    public void sort(int[] data) {
        if (data == null || data.length <= 1) {
            return;
        }
        int max = data[0];
        for (int i = 1; i < data.length; i++) {
            max = Math.max(max, data[i]);
        }
        int[] c = new int[max + 1];
        for (int i = 0; i < data.length; i++) {
            c[data[i]]++;
        }
        for (int i = 1; i < c.length; i++) {
            c[i] = c[i - 1] + c[i];
        }
        int[] tmp = new int[data.length];
        for (int i = data.length - 1; i >= 0; i--) {
            tmp[c[data[i]]-- - 1] = data[i];
        }
        for (int i = 0; i < data.length; i++) {
            data[i] = tmp[i];
        }
    }

}
