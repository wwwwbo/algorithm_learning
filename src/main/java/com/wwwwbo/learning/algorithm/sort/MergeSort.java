package com.wwwwbo.learning.algorithm.sort;

/**
 * @author wangb
 * @date 2020/12/18 10:14
 **/
public class MergeSort {

    public void sort(int[] data) {
        if (data == null || data.length <= 1) {
            return;
        }
        mergeSort(data, 0, data.length - 1);
    }

    private void mergeSort(int[] data, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2;
        mergeSort(data, start, mid);
        mergeSort(data, mid + 1, end);
        merge(data, start, mid, end);
    }

    private void merge(int[] data, int start, int mid, int end) {
        int[] tmp = new int[end - start + 1];
        int n = 0;
        int i = start;
        int j = mid + 1;
        while (i <= mid || j <= end) {
            if (i > mid) {
                tmp[n++] = data[j++];
            } else if (j > end) {
                tmp[n++] = data[i++];
            } else if (data[i] <= data[j]) {
                tmp[n++] = data[i++];
            } else {
                tmp[n++] = data[j++];
            }
        }
        for (int t = 0; t < tmp.length; t++) {
            data[start++] = tmp[t];
        }
    }
}
