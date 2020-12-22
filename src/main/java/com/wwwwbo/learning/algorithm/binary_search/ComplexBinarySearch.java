package com.wwwwbo.learning.algorithm.binary_search;

/**
 * 有序数据集合中存在重复的数据
 *
 * @author wangb
 * @date 2020/12/22 17:11
 **/
public class ComplexBinarySearch {

    public int searchFirst(int[] data, int value) {
        if (data == null) {
            return -1;
        }
        int low = 0;
        int high = data.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (value < data[mid]) {
                high = mid - 1;
            } else if (value > data[mid]) {
                low = mid + 1;
            } else {
                if (mid == 0 || data[mid - 1] != value) {
                    return mid;
                }
                high = mid - 1;
            }
        }
        return -1;
    }

    public int searchLast(int[] data, int value) {
        if (data == null) {
            return -1;
        }
        int low = 0;
        int high = data.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (value < data[mid]) {
                high = mid - 1;
            } else if (value > data[mid]) {
                low = mid + 1;
            } else {
                if (mid == data.length - 1 || data[mid + 1] != value) {
                    return mid;
                }
                low = mid + 1;
            }
        }
        return -1;
    }

    public int searchFirstBigger(int[] data, int value) {
        if (data == null) {
            return -1;
        }
        int low = 0;
        int high = data.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (value < data[mid]) {
                if (mid == 0 || data[mid - 1] <= value) {
                    return mid;
                }
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public int searchLastSmaller(int[] data, int value) {
        if (data == null) {
            return -1;
        }
        int low = 0;
        int high = data.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (value <= data[mid]) {
                high = mid - 1;
            } else {
                if (mid == data.length - 1 || data[mid + 1] >= value) {
                    return mid;
                }
                low = mid + 1;
            }
        }
        return -1;
    }
}
