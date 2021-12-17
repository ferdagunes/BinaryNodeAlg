package src;

public class Main {
    public static void main(String[] args) {

        BST tree = new BST();
        tree.insert(7);
        tree.insert(8);
        tree.insert(3);
        tree.insert(1);
        tree.insert(4);
        tree.insert(5);
        tree.insert(6);
        tree.printPreOrder();
        System.out.println();
        System.out.println(tree.findDepth());



    }
}