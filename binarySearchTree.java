class binarySearchTreeNode {
    int data;
    binarySearchTreeNode left;
    binarySearchTreeNode right;
    public binarySearchTreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public binarySearchTreeNode insert(int value) {
        if (value < data) {
            if (left == null) {
                return new binarySearchTreeNode(data);
            } else {
                left = left.insert(value);
            }
        } else if (value > data) {
            if (right == null) {
                return new binarySearchTreeNode(data);
            } else {
                right = right.insert(value);
            }
        }
        return this;
    }

    public binarySearchTreeNode search(int value) {
        if (value == data) {
            return this;
        } else if (value < data) {
            return (left != null) ? left.search(value) : null;
        } else {
            return (right != null) ? right.search(value) : null;
        }
    }

    public binarySearchTreeNode delete(int value) {
        if (value < data) {
            if (left == null) {
                return right;
            } else {
                left = delete(value);
            }
        } else if (value > data) {
            if (right == null) {
                return left;
            } else {
                right = delete(value);

            }
            binarySearchTreeNode successor = right.findMin();
            data = successor.data;
            right = right.delete(successor.data);
        }
        return this;
    }
    public binarySearchTreeNode findMin() {
        return (left != null) ? left.findMin() : this;
    }

    public void inorder() {
        if (left != null) {
            left.inorder();
        }
        System.out.print(left + "");
        if (right != null) {
           right.inorder();
        }
    }

}
public void main(String[] args) {
    binarySearchTreeNode SearchTree = new binarySearchTreeNode(10);
    SearchTree.insert(17);
    SearchTree.insert(20);
    SearchTree.insert(30);
    System.out.print("In Order Traversal");
    SearchTree.inorder();
}