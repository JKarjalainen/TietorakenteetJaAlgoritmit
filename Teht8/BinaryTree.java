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
            root.setLeft(new BinaryTree(aData));
        }
        else if(root.right() == null) {
            root.setRight(new BinaryTree(aData));
        } else {
            root.left().insert(aData);
        }
    }
    
    public BinaryTree find(String aData){
        if(root.equals(aData)) {
            return this;
        } else if(root.left().root.getData().equals(aData)) {
            return root.left();
        }
        else if(root.right().root.getData().equals(aData)) {
            return root.right();
        } else {
            BinaryTree searchLeft = root.left().find(aData);
            if(searchLeft != null) return searchLeft;

            return root.right().find(aData);
        }
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
