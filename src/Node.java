public class Node<T> {
    private T data;
    private Node<T> leftChild, rightChild;
    private Node<T> parent = null;

    public Node(T data) {
        this.data = data;
    }

    public Node() {
        this.data = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getLeftChild() {
        return leftChild;
    }

    public Node<T> setLeftChild(Node<T> leftChild) {
        this.leftChild = leftChild;
        return this.leftChild;
    }

    public Node<T> getRightChild() {
        return rightChild;
    }

    public Node<T> setRightChild(Node<T> rightChild) {
        this.rightChild = rightChild;
        return this.rightChild;
    }

    public Node<T> getParent() {
        return parent;
    }

    public void setParent(Node<T> parent) {
        this.parent = parent;
    }

}
