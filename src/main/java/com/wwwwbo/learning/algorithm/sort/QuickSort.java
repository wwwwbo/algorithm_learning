package com.wwwwbo.learning.algorithm.sort;

/**
 * @author wangb
 * @date 2020/12/18 15:41
 **/
public class QuickSort {

    public void sort(int[] data) {
        if (data == null || data.length <= 1) {
            return;
        }
        quickSort(data, 0, data.length - 1);
    }

    private void quickSort(int[] data, int start, int end) {
        if (start >= end) {
            return;
        }
        int pivot = partition(data, start, end);
        quickSort(data, start, pivot - 1);
        quickSort(data, pivot + 1, end);

    }

    private int partition(int[] data, int start, int end) {
        int i = start;
        int j = end;
        int pivot = data[end];
        while (i < j) {
            while (i < j && data[i] <= pivot) {
                i++;
            }
            if (i < j) {
                data[j--] = data[i];
            }
            while (i < j && data[j] >= pivot) {
                j--;
            }
            if (i < j) {
                data[i++] = data[j];
            }
        }
        data[i] = pivot;
        return i;
    }


}
