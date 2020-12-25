package com.wwwwbo.learing.data_structure.tree;

import com.wwwwbo.learning.data_structure.tree.TreeNode;
import com.wwwwbo.learning.data_structure.tree.TreeTraversal;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangb
 * @date 2020/12/23 11:20
 **/
public class TreeTraversalTest {

    private TreeNode root;

    @Before
    public void before() {
        root = new TreeNode(1);

        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(3);
        root.left = treeNode1;
        root.right = treeNode2;

        TreeNode treeNode3 = new TreeNode(4);
        TreeNode treeNode4 = new TreeNode(5);
        treeNode1.left = treeNode3;
        treeNode1.right = treeNode4;

        TreeNode treeNode5 = new TreeNode(6);
        TreeNode treeNode6 = new TreeNode(7);
        treeNode2.left = treeNode5;
        treeNode2.right = treeNode6;

        TreeNode treeNode7 = new TreeNode(8);
        TreeNode treeNode8 = new TreeNode(9);
        treeNode3.left = treeNode7;
        treeNode3.right = treeNode8;

        treeNode4.left = new TreeNode(10);
    }

    @Test
    public void preTest() {
        List<Integer> list1 = new ArrayList<>();
        TreeTraversal.preOrder(root, list1);
        List<Integer> list2 = TreeTraversal.preOrderUseStack(root);
        Assert.assertArrayEquals(list1.toArray(), list2.toArray());
    }

    @Test
    public void inTest() {
        List<Integer> list1 = new ArrayList<>();
        TreeTraversal.inOrder(root, list1);
        List<Integer> list2 = TreeTraversal.inOrderUseStack(root);
        Assert.assertArrayEquals(list1.toArray(), list2.toArray());
    }

    @Test
    public void postTest() {
        List<Integer> list1 = new ArrayList<>();
        TreeTraversal.postOrder(root, list1);
        List<Integer> list2 = TreeTraversal.postOrderUseStack(root);
        Assert.assertArrayEquals(list1.toArray(), list2.toArray());
    }

}
