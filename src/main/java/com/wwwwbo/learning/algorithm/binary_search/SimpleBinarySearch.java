package com.wwwwbo.learning.algorithm.binary_search;

/**
 * 有序数组中不存在重复元素
 *
 * @author wangb
 * @date 2020/12/22 16:21
 **/
public class SimpleBinarySearch {

    public int search(int[] data, int value) {
        if (data == null) {
            return -1;
        }
        int low = 0;
        int high = data.length - 1;
        while (low <= high) {
            // int mid = (low + high) / 2;
            // int mid = low + (high - low) / 2;
            int mid = low + ((high - low) >> 1);
            if (value < data[mid]) {
                high = mid - 1;
            } else if (value > data[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public int search(int[] data, int low, int high, int value) {
        if (data == null) {
            return -1;
        }
        if (low > high) {
            return -1;
        }
        int mid = low + ((high - low) >> 1);
        if (value < data[mid]) {
            return search(data, low, mid - 1, value);
        } else if (value > data[mid]) {
            return search(data, mid + 1, high, value);
        } else {
            return mid;
        }
    }

}
