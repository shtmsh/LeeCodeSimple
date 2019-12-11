package sample.Leecode;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: liutianxin
 * @Description
 * @Date: Created in 15:00 2019/10/16
 * @MOdified By:
 */
public class MergeTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public TreeNode mergetTrees2() {
        return null;
    }

    public TreeNode mergeTrees1(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return null;
        }
        TreeNode root = new TreeNode((t1 == null ? 0 : t1.val) + (t2 == null ? 0 : t2.val));
        root.left = mergeTrees1(t1 == null ? null : t1.left, t2 == null ? null : t2.left);
        root.right = mergeTrees1(t1 == null ? null : t1.right, t2 == null ? null : t2.right);
        return root;
    }

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        List<Integer> l1 = TreeToList(t1);
        List<Integer> l2 = TreeToList(t2);
        System.out.println(Arrays.toString(l1.toArray()));
        System.out.println(Arrays.toString(l2.toArray()));
        LinkedList<Integer> l3 = new LinkedList<>();
        int max = l1.size() > l2.size() ? l1.size() : l2.size();
        int min = l1.size() > l2.size() ? l2.size() : l1.size();

        for (int i = 0; i < min; i++) {
            l3.add((l1.get(i) == null ? 0 : l1.get(i)) + (l2.get(i) == null ? 0 : l2.get(i)));
        }
        l3.addAll(min, l1.size() >= l2.size() ? l1.subList(min, max) : l2.subList(min, max));
        System.out.println(Arrays.toString(l3.toArray()));
        return createTree(l3);
    }

    public TreeNode createTree(LinkedList<Integer> list) {
        TreeNode node = null;
        if (list == null || list.isEmpty()) {
            return null;
        }

        Integer data = list.removeFirst();
        if (data != null) {
            node = new TreeNode(data);
            node.left = createTree(list);
            node.right = createTree(list);
        }
        return node;
    }

    public List<Integer> TreeToList(TreeNode tree) {
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<TreeNode> work_queue = new LinkedList<>();
        work_queue.add(tree);

        while (!work_queue.isEmpty()) {
            TreeNode node = work_queue.removeFirst();
            if (node != null) {
                list.add(node.val);
            } else {
                list.add(null);
                continue;
            }
            if (node.left != null || node.right != null) {
                work_queue.add(node.left);
                work_queue.add(node.right);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(2);
        t1.left = new TreeNode(1);
        t1.right = new TreeNode(3);
        t1.left.right = new TreeNode(4);
        t1.right.right = new TreeNode(7);

        TreeNode t2 = new TreeNode(1);
        t2.left = new TreeNode(3);
        t2.right = new TreeNode(2);
        t2.left.left = new TreeNode(5);

//        TreeNode mergeNode = new MergeTree().mergeTrees(t1, t2);
        TreeNode mergeNode1 = new MergeTree().mergeTrees1(t1, t2);
//        MergeTree.PreOrderTraversal(mergeNode1);
//        MergeTree.InOrderTravel(mergeNode1);
        MergeTree.PostTravel(mergeNode1);

//        LinkedList<TreeNode> workQueue = new LinkedList<>();
//        List<Integer> list = new ArrayList<>();
//        workQueue.add(mergeNode1);
//        while (!workQueue.isEmpty()) {
//            TreeNode node = workQueue.removeFirst();
//            if (node == null){
//                list.add(null);
//                continue;
//            }else {
//                list.add(node.val);
//            }
//            if (node.left != null || node.right != null){
//                workQueue.add(node.left);
//                workQueue.add(node.left);
//            }
//
//
////            if (node.left != null) {
////                workQueue.add(node.left);
////            }else {
////                workQueue.add(null);
////            }
////
////            if (node.right != null) {
////                workQueue.add(node.left);
////            }else {
////                workQueue.add(null);
////            }
//        }
//
//        System.out.println(Arrays.toString(list.toArray()));

    }
    public static TreeNode createBinartTree(LinkedList<Integer> list){
        if (list == null || list.isEmpty()){
            return null;
        }

        Integer val = list.removeFirst();
        if (val == null){
            return null;
        }
        TreeNode treeNode = new TreeNode(val);
        treeNode.left = createBinartTree(list);
        treeNode.right = createBinartTree(list);
        return treeNode;
    }

    /**
     * 前序遍历
     * @param node
     */
    public static void PreOrderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }

        System.out.print(node.val);
        if (node.left == null && node.right == null) {
            return;
        }
        PreOrderTraversal(node.left);
        PreOrderTraversal(node.right);
    }

    /**
     * 中序遍历
     * @param node
     */
    public static void InOrderTravel(TreeNode node) {
        if (node == null) {
            return;
        }
        if (node.left != null){
            InOrderTravel(node.left);
        }
        System.out.print(node.val);
        if (node.right != null){
            InOrderTravel(node.right);
        }
    }

    /**
     * 后续遍历
     * @param node
     */
    public static void PostTravel(TreeNode node){
        if (node == null){
            return;
        }
        PostTravel(node.left);
        PostTravel(node.right);
        System.out.print(node.val);
    }
}
