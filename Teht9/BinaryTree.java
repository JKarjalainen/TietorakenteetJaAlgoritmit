/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package btree;

/**
 *
 * @author kamaj
 */
public class BinaryTree {

    private Node root;
    
    public BinaryTree(String rootValue) {
        root = new Node(rootValue);
    }
    public BinaryTree(){
        root = null;
    }
    /*public BinaryTree(String rootValue, BinaryTree left, BinaryTree right){
        root = new Node(rootValue, left, right);
    } */
    
    public void insert(String aData){
        if(root == null) {
            root = new Node(aData);
        }
        else if(root.left() == null) {
            setLeft(new BinaryTree(aData));
        }
        else if(root.right() == null) {
            setRight(new BinaryTree(aData));
        } else {
            if(Math.random() < 0.5) {
                root.left().insert(aData);
            } else {
                root.right().insert(aData);
            }

        }
    }
    
    public BinaryTree find(String aData){
        if(root == null) return null;
        if(root.getData().equals(aData)) {
            return this;
        }
        if(root.left() != null) {
            BinaryTree searchLeft = root.left().find(aData);
            if(searchLeft != null) return searchLeft;
        }
        if(root.right() != null) {
            BinaryTree searchRight = root.right().find(aData);
            if(searchRight != null) return searchRight;
        }
        return null;
    }

    public boolean delete(String aData) {
        boolean deleted = false;
        if(root == null) return false;
        if(root.getData().equals(aData)) {
            if(root.left() != null) {
                Node oldRoot = root;
                root = root.left().root;
                root.setRight(oldRoot.right());
                return true;
            }
            if(root.right() != null) {
                Node oldRoot = root;
                root = root.right().root;
                root.setRight(oldRoot.left());
                return true;
            }
            root = null;
            return true;
        }

        if(root.left() != null) {
            if(root.left().delete(aData)) {
                return true;
            }
        }
        if(root.right() != null) {
            if(root.right().delete(aData)) {
                return true;
            }
        }
        return false;
    }

    public void preOrder() {
        if (root != null) {
            System.out.println(root.getData()+',');
            if (root.left() != null) // pääseeekö vasemmalle?
                root.left().preOrder();
            if (root.right() != null) // pääseekö oikealle?
                root.right().preOrder();
        }

    }
  
    public void setLeft(BinaryTree tree) {
        root.setLeft(tree);
    }

    public void setRight(BinaryTree tree) {
        root.setRight(tree);
    }
}
