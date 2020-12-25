package com.wwwwbo.learing.data_structure.tree;

import com.wwwwbo.learning.data_structure.tree.BinarySearchTree;
import com.wwwwbo.learning.data_structure.tree.TreeNode;
import com.wwwwbo.learning.data_structure.tree.TreeTraversal;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author wangb
 * @date 2020/12/25 9:54
 **/
public class BinarySearchTreeTest {

    @Test
    public void findTest() {
        BinarySearchTree tree = getTree();
        TreeNode treeNode1 = tree.find(33);
        Assert.assertEquals(treeNode1.val, 33);
        TreeNode treeNode2 = tree.find(34);
        Assert.assertEquals(treeNode2.val, 34);
        TreeNode treeNode3 = tree.find(66);
        Assert.assertEquals(treeNode3.val, 66);
    }

    @Test
    public void insertTest() {
        BinarySearchTree tree = getTree();
        tree.insert(54);
        List<Integer> list = Arrays.asList(33, 16, 13, 15, 18, 17, 25, 19, 27, 50, 34, 58, 51, 55, 54, 66);
        Assert.assertArrayEquals(TreeTraversal.preOrderUseStack(tree.root).toArray(), list.toArray());
    }

    @Test
    public void deleteTest() {
        BinarySearchTree tree = getTree();
        tree.delete(55);
        tree.delete(13);
        tree.delete(18);
        tree.delete(33);
        List<Integer> list = Arrays.asList(34, 16, 15, 19, 17, 25, 27, 50, 58, 51, 66);
        Assert.assertArrayEquals(TreeTraversal.preOrderUseStack(tree.root).toArray(), list.toArray());
    }

    private BinarySearchTree getTree() {
        TreeNode root = new TreeNode(33);
        TreeNode treeNode1 = new TreeNode(16);
        TreeNode treeNode2 = new TreeNode(50);
        root.left = treeNode1;
        root.right = treeNode2;
        TreeNode treeNode3 = new TreeNode(13);
        TreeNode treeNode4 = new TreeNode(18);
        treeNode1.left = treeNode3;
        treeNode1.right = treeNode4;
        TreeNode treeNode5 = new TreeNode(34);
        TreeNode treeNode6 = new TreeNode(58);
        treeNode2.left = treeNode5;
        treeNode2.right = treeNode6;
        treeNode3.right = new TreeNode(15);
        treeNode4.left = new TreeNode(17);
        TreeNode treeNode9 = new TreeNode(25);
        treeNode4.right = treeNode9;
        treeNode9.left = new TreeNode(19);
        treeNode9.right = new TreeNode(27);
        TreeNode treeNode10 = new TreeNode(51);
        treeNode6.left = treeNode10;
        treeNode10.right = new TreeNode(55);
        treeNode6.right = new TreeNode(66);
        return new BinarySearchTree(root);
    }
}
