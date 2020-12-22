package com.wwwwbo.learing.algorithm.binary_search;

import com.wwwwbo.learning.algorithm.binary_search.SimpleBinarySearch;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author wangb
 * @date 2020/12/22 16:35
 **/
public class SimpleBinarySearchTest {

    private SimpleBinarySearch search;

    @Before
    public void before() {
        search = new SimpleBinarySearch();
    }

    @Test
    public void testSearch1() {
        int[] data = new int[]{1, 4, 7, 8, 9, 10, 100, 130, 133};
        int correctIndex = Arrays.binarySearch(data, 11);
        Assert.assertEquals(search.search(data, 11), correctIndex < 0 ? -1 : correctIndex);
    }

    @Test
    public void testSearch2() {
        int[] data = new int[]{1, 4, 7, 8, 9, 10, 100, 130, 133};
        int correctIndex = Arrays.binarySearch(data, 3);
        Assert.assertEquals(search.search(data, 3), correctIndex < 0 ? -1 : correctIndex);
    }


    @Test
    public void testSearch3() {
        int[] data = new int[]{2, 3, 4, 7, 8, 9, 10, 100, 130, 133};
        int correctIndex = Arrays.binarySearch(data, 11);
        Assert.assertEquals(search.search(data, 11), correctIndex < 0 ? -1 : correctIndex);
    }

    @Test
    public void testSearch4() {
        int[] data = new int[]{2, 3, 4, 7, 8, 9, 10, 100, 130, 133};
        int correctIndex = Arrays.binarySearch(data, 100);
        Assert.assertEquals(search.search(data, 100), correctIndex < 0 ? -1 : correctIndex);
    }

    @Test
    public void testSearch5() {
        int[] data = new int[]{1, 4, 7, 8, 9, 10, 100, 130, 133};
        int correctIndex = Arrays.binarySearch(data, 11);
        Assert.assertEquals(search.search(data, 0, data.length - 1, 11), correctIndex < 0 ? -1 : correctIndex);
    }

    @Test
    public void testSearch6() {
        int[] data = new int[]{2, 3, 4, 7, 8, 9, 10, 100, 130, 133};
        int correctIndex = Arrays.binarySearch(data, 100);
        Assert.assertEquals(search.search(data, 0, data.length - 1, 100), correctIndex < 0 ? -1 : correctIndex);
    }

}
