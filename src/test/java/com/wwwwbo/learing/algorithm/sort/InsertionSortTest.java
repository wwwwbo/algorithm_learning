package com.wwwwbo.learing.algorithm.sort;

import com.wwwwbo.learning.algorithm.sort.InsertionSort;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.wwwwbo.learing.algorithm.sort.TestDataUtils.copySortedIntArray;
import static com.wwwwbo.learing.algorithm.sort.TestDataUtils.getRandomIntArray;

/**
 * @author wangb
 * @date 2020/12/16 10:27
 **/
public class InsertionSortTest {

    private InsertionSort sort;

    @Before
    public void before() {
        sort = new InsertionSort();
    }

    @Test
    public void testSort1() {
        int[] randomIntArray = getRandomIntArray(1);
        int[] correctIntArray = copySortedIntArray(randomIntArray);
        sort.sort(randomIntArray);
        Assert.assertArrayEquals(randomIntArray, correctIntArray);
    }

    @Test
    public void testSort2() {
        int[] randomIntArray = getRandomIntArray(10);
        int[] correctIntArray = copySortedIntArray(randomIntArray);
        sort.sort(randomIntArray);
        Assert.assertArrayEquals(randomIntArray, correctIntArray);
    }

    @Test
    public void testSort3() {
        int[] randomIntArray = getRandomIntArray(100);
        int[] correctIntArray = copySortedIntArray(randomIntArray);
        sort.sort(randomIntArray);
        Assert.assertArrayEquals(randomIntArray, correctIntArray);
    }

    @Test
    public void testSort4() {
        int[] randomIntArray = getRandomIntArray(1000);
        int[] correctIntArray = copySortedIntArray(randomIntArray);
        sort.sort(randomIntArray);
        Assert.assertArrayEquals(randomIntArray, correctIntArray);
    }

}
