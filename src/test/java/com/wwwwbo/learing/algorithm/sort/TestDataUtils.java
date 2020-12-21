package com.wwwwbo.learing.algorithm.sort;

import java.util.Arrays;
import java.util.Random;

/**
 * @author wangb
 * @date 2020/12/18 13:53
 **/
public class TestDataUtils {

    public static int[] getRandomIntArray(int arrayLength) {
        Random random = new Random();
        int[] data = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            data[i] = random.nextInt(arrayLength);
        }
        return data;
    }

    public static int[] getRandomIntArray(int arrayLength, int maxInt) {
        Random random = new Random();
        int[] data = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            data[i] = random.nextInt(maxInt);
        }
        return data;
    }

    public static int[] copySortedIntArray(int[] data) {
        int[] copyData = Arrays.copyOf(data, data.length);
        Arrays.sort(copyData);
        return copyData;
    }

}
