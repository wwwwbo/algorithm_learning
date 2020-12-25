package com.wwwwbo.learning.data_structure.tree;

/**
 * @author wangb
 * @date 2020/12/25 9:54
 **/
public class BinarySearchTree {

    public TreeNode root;

    public BinarySearchTree() {
    }

    public BinarySearchTree(TreeNode root) {
        this.root = root;
    }

    public TreeNode find(int val) {
        TreeNode p = root;
        while (p != null) {
            if (p.val == val) {
                return p;
            }
            if (p.val > val) {
                p = p.left;
            } else {
                p = p.right;
            }
        }
        return null;
    }

    public void insert(int val) {
        if (root == null) {
            root = new TreeNode(val);
            return;
        }
        TreeNode p = root;
        while (true) {
            if (p.val > val) {
                if (p.left == null) {
                    p.left = new TreeNode(val);
                    return;
                }
                p = p.left;
            } else {
                if (p.right == null) {
                    p.right = new TreeNode(val);
                    return;
                }
                p = p.right;
            }
        }
    }

    public void delete(int val) {
        TreeNode p = root;
        TreeNode prev = null;
        while (true) {
            if (p == null) {
                return;
            }
            if (p.val == val) {
                break;
            }
            prev = p;
            if (p.val > val) {
                p = p.left;
            } else {
                p = p.right;
            }
        }
        if (p.left != null && p.right != null) {
            TreeNode min = p.right;
            TreeNode minPre = p;
            while (null != min.left) {
                minPre = min;
                min = min.left;
            }
            p.val = min.val;
            p = min;
            prev = minPre;
        }
        TreeNode child;
        if (p.left != null) {
            child = p.left;
        } else if (p.right != null) {
            child = p.right;
        } else {
            child = null;
        }
        if (prev == null) {
            root = child;
        } else if (prev.left == p) {
            prev.left = child;
        } else {
            prev.right = child;
        }
    }

    /*public void delete(int val) {
        TreeNode p = root;
        TreeNode prev = null;
        while (p != null) {
            if (p.val == val) {
                if (p.left == null && p.right == null) {
                    if (prev == null) {
                        root = null;
                    } else if (prev.left == p) {
                        prev.left = null;
                    } else {
                        prev.right = null;
                    }
                } else if (p.left == null) {
                    if (prev == null) {
                        root = p.right;
                    } else if (prev.left == p) {
                        prev.left = p.right;
                    } else {
                        prev.right = p.right;
                    }
                } else if (p.right == null) {
                    if (prev == null) {
                        root = p.left;
                    } else if (prev.left == p) {
                        prev.left = p.left;
                    } else {
                        prev.right = p.left;
                    }
                } else {
                    TreeNode min = p.right;
                    TreeNode minPre = null;
                    while (true) {
                        if (null == min.left) {
                            break;
                        } else {
                            minPre = min;
                            min = min.left;
                        }
                    }
                    if (prev == null) {
                        min.left = root.left;
                        min.right = minPre;
                        root = min;
                    } else {
                        prev.right = min;
                        min.right = p.right;
                        min.left = p.left;
                    }
                    if (minPre != null) {
                        minPre.left = null;
                    }
                }
                return;
            }
            prev = p;
            if (p.val > val) {
                p = p.left;
            } else {
                p = p.right;
            }
        }
    }*/


}
