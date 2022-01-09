import java.util.ArrayList;

public class Node<Integer> {
   private final Node<Integer> parent = null;
   private Integer data;
   private Node<Integer> leftChild, rightChild;

   public Node(Integer data) {
      this.data = data;
   }

   public Node(Node node) {
      this.data = null;
   }

   public Integer getData() {
      return data;
   }

   public void setData(Integer data) {
      this.data = data;
   }

   public Node<Integer> getLeftChild() {
      return leftChild;
   }

   public Node<Integer> setLeftChild(Node<Integer> leftChild) {
      this.leftChild = leftChild;
      return this.leftChild;
   }

   public Node<Integer> getRightChild() {
      return rightChild;
   }

   public Node<Integer> setRightChild(Node<Integer> rightChild) {
      this.rightChild = rightChild;
      return this.rightChild;
   }

   public static <Integer> Node ArrayListToTree(Node<Integer> node,ArrayList<Integer> Array) {
      for (int i = 0; i < Array.size(); i++) {
         node = CreateTree(node, Array.get(i));
      }
      return node;
   }

   private static <Integer> Node CreateTree(Node<Integer> root, Integer value) {
      if (root == null) {
         root = (Node<Integer>) new Node<Integer>(value);
      }
      if (java.lang.Integer.parseInt(value.toString()) < java.lang.Integer.parseInt(root.data.toString()))
         root.setLeftChild(CreateTree(root.getLeftChild(), value));
      else if (java.lang.Integer.parseInt(value.toString()) > java.lang.Integer.parseInt(root.data.toString()))
         root.setRightChild(CreateTree(root.getRightChild(), value));
      return root;
   }
}
