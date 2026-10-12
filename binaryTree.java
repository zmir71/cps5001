class binaryTreeNode {
    int data;
    binaryTreeNode left, right;

    public binaryTreeNode(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}
class binaryTree {
    binaryTreeNode root;
    public binaryTree() {
        root = null;
    }
    public binaryTreeNode insert(binaryTreeNode root, int data) {
        if (root == null) {
            return new binaryTreeNode(data);
        } else if (root.left == null) {
            root.left = new binaryTreeNode(data);
            return root;
        } else if (root.right == null) {
            root.right = new binaryTreeNode(data);
            return root;
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    public binaryTreeNode delete(binaryTreeNode root, int data) {
        if (root == null) {
            return root;
        }
        if (data < root.data) {
            root.left = delete(root.left, data);
        } else if (data > root.data) {
            root.right = delete(root.right, data);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            binaryTreeNode temp = minValueNode(root.right);
            root.data = temp.data;
            root.right = delete(root.right, temp.data);
        }
        return root;
    }

    public binaryTreeNode minValueNode(binaryTreeNode node) {
        binaryTreeNode current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current;
        }
    
    public void inorder(binaryTreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + "");
            inorder(root.right);
        }
    }

    public void preorder(binaryTreeNode root) {
        if (root != null) {
            System.out.print(root.data + "");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public void postorder(binaryTreeNode root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + "");

        }
    }
}
public void main(String[] args) {
    binaryTree tree = new binaryTree();
    tree.root = tree.insert(tree.root,10 );
    tree.insert(tree.root, 17);
    tree.insert(tree.root, 20);
    tree.insert(tree.root, 30);
    System.out.println("In Order Traversal");
    tree.inorder(tree.root);
}
