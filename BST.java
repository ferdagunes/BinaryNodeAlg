package src;

public class BST {

    private BinaryNode root;

    public void insert(int val){
        if(root==null){
            BinaryNode binaryNode = new BinaryNode(val);
            root= binaryNode;
        }else
            root.insert(val);
    }
    public void printPreOrder(){
        System.out.print(root.getData()+" ,");
        if(root.getLeft()!=null){
            root.printPreOrder(root.getLeft());
        }
        if(root.getRight()!=null){
            root.printPreOrder(root.getRight());
        }
    }
    public int findDepth(){
        return findDepth(root,0);

    }

    private int findDepth(BinaryNode node, int depth){
        int leftDepth,rightDepth;
        if(node==null || (node.getLeft()==null && node.getRight()==null)){
            return depth;
        }else{
            leftDepth=findDepth(node.getLeft(),depth+1);
            rightDepth=findDepth(node.getRight(),depth+1);
        }
        if(leftDepth>rightDepth)
            return leftDepth;
        else return rightDepth;
    }
}

