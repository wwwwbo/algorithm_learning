package com.wwwwbo.learing.algorithm.binary_search;

import com.wwwwbo.learning.algorithm.binary_search.ComplexBinarySearch;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * 有序数据集合中存在重复的数据
 *
 * @author wangb
 * @date 2020/12/22 17:11
 **/
public class ComplexBinarySearchTest {

    private ComplexBinarySearch search;
    private int[] data;

    @Before
    public void before() {
        search = new ComplexBinarySearch();
        data = new int[]{1, 3, 5, 5, 7, 9, 12, 12, 12, 14, 16, 18, 20};
    }


    @Test
    public void searchFirstTest() {
        Assert.assertEquals(search.searchFirst(data, 5), 2);
        Assert.assertEquals(search.searchFirst(data, 12), 6);
        Assert.assertEquals(search.searchFirst(data, 20), 12);
    }

    @Test
    public void searchLastTest() {
        Assert.assertEquals(search.searchLast(data, 5), 3);
        Assert.assertEquals(search.searchLast(data, 12), 8);
        Assert.assertEquals(search.searchLast(data, 1), 0);
    }

    @Test
    public void searchFirstBiggerTest() {
        Assert.assertEquals(search.searchFirstBigger(data, 5), 4);
        Assert.assertEquals(search.searchFirstBigger(data, 12), 9);
        Assert.assertEquals(search.searchFirstBigger(data, 18), 12);
        Assert.assertEquals(search.searchFirstBigger(data, 20), -1);

    }

    @Test
    public void searchLastSmallerTest() {
        Assert.assertEquals(search.searchLastSmaller(data, 5), 1);
        Assert.assertEquals(search.searchLastSmaller(data, 12), 5);
        Assert.assertEquals(search.searchLastSmaller(data, 18), 10);
        Assert.assertEquals(search.searchLastSmaller(data, 1), -1);
    }
}
