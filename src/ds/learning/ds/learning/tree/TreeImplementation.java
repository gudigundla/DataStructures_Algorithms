package ds.learning.ds.learning.tree;

import ds.learning.ds.learning.tree.Node;

/**
 * Created by hari.gudigundla on 16-09-16.
 */
public class TreeImplementation {

    public static void main(String[] args){

        Node myTree = Node.createBinaryTree();
        //Node.LevelTraversal(myTree);
        //Node.PreOrderTraversal(myTree);
        //Node.InorderTraversal(myTree);
        Node.PostOrderTraversal(myTree);


    }
}