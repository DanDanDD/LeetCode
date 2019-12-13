package bin_search_tree;

import Bin_tree.bin_tree;
import jdk.nashorn.internal.objects.NativeJava;

import java.util.Queue;

/**
 * @author: Dennis
 * @date: 2019/5/30 17:47
 */
public class BinSearchTree<E extends Comparable<E>> implements bin_tree<E> {
    private class Node{
        E data;
        Node left;
        Node right;
        public Node(E data){
            this.data=data;
        }
        private Node root;
        private int size;
    }
    private Node root;
    private int size;
    @Override
    public void add(E e) {
        if (root==null){
            Node node = new Node(e);
            root = node;
            size++;
        }
        //递归寻找插入位置
        add(root,e);
    }
//    private void add(Node node,E e){
//        if (node.data.compareTo(e)==0){
//            return ;
//        }else if (e.compareTo(node.data)<0 && node.left==null){
//            Node newNode = new Node(e);
//            node.left=newNode;
//            size++;
//        }else if (e.compareTo(node.data)>0 && node.right == null){
//            Node newNode = new Node(e);
//            node.right=newNode;
//            size++;
//        }else if (e.compareTo(node.data)<0){
//            add(node.left,e);
//        }else {
//            add(node.right,e);
//        }
//    }

    /**
     *
     * @param node
     * @param e
     * @return
     */
    private Node add(Node node,E e){
        if (node==null){
            Node newNode = new Node(e);
            size++;
            return newNode;
        }
        if (e.compareTo(node.data)<0){
            node.left=add(node.right,e);
        }
        if (e.compareTo(node.data)>0){
            node.right= add(node.right,e);
        }
        return node;
    }

    @Override
    public boolean contains(E e) {
        return false;
    }

    @Override
    public void preOrder() {

    }

    /**
     * 以当前节点作为根节点进行前序遍历
     */
    private void preOrder(Node node){
        if (node==null){
            return;
        }
        preOrder(node.left);
        preOrder(node.right);
    }

    @Override
    public void inOrder() {

    }

    @Override
    public void postOeder() {

    }

    @Override
    public void levelOrder() {

    }
    private void levelOrder(Node node){
        if (node == null){
            return;
        }
    }

    @Override
    public E getMin() {
        if (root == null)
            throw new IllegalArgumentException();
        return null;
    }
    private Node getMinNode(Node node){
        if (root == null)
            throw new IllegalArgumentException("BST is empty！");
        Node maxNode = getMinNode(root);
        return maxNode;
    }

    @Override
    public E getMax() {
        if (root == null)
            throw  new IllegalArgumentException();
        return null;
    }

//    private Node getMaxNode(Node node){
//        if (root == null)
//            throw new IllegalArgumentException("BST is empty！");
//        Node maxNode = getMaxNode(root);
//        return maxNode.data;
//    }


    @Override
    public E removeMin() {
        E result = getMin();
        root =removeMinNode(root);
        return result;
    }

    private Node removeMinNode(Node node){
        if (node.left == null){
            Node rightNode = node.right;
            node.right = null;
            size--;
            return  rightNode;
        }
        node.left = removeMinNode(node.left);
        return node;
    }

    @Override
    public E removeMax() {
        return null;
    }

    @Override
    public void remove(E e) {
        root= remove(root,e);
    }

    private Node remove(Node node,E e){
        if (node == null)
            return null;
        if (e.compareTo(node.data)<0){
            node.left = remove(node.left,e);
        }
        if (e.compareTo(node.data)>0){
            node.right = remove(node.right,e);
        }
        else {
            if (node.left != null && node.right == null){
                Node leftNode = node.left;
                size--;
                node.left = null;
                return leftNode;
            }
            if (node.right != null && node.left == null){
                Node rightNode = node.right;
                size--;
                node.right = null;
                return rightNode;
            }
            if (node.left !=null && node.right != null){
                Node successor = getMinNode(node.right);
                successor.left = node.left;
                successor.right = removeMinNode(node.right);
                node.left=node.right=null;
                return  successor;
            }
        }
        return node;
    }

    @Override
    public int size() {
        return size;
    }
}
