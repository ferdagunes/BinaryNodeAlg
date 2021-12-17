package src;

public class BinaryNode {
    private int data ;
    private BinaryNode right ;
    private BinaryNode left ;

    public BinaryNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BinaryNode getRight() {
        return right;
    }

    public void setRight(BinaryNode right) {
        this.right = right;
    }

    public BinaryNode getLeft() {
        return left;
    }

    public void setLeft(BinaryNode left) {
        this.left = left;
    }

    public void insert(int val){
        if(data==val){
            return;
        }
        else{
            if(data<val){
                if(left==null){
                    BinaryNode binaryNode = new BinaryNode(val);
                    left=binaryNode;
                }else{
                    left.insert(val);
                }
            }else {
                if(right==null){
                    BinaryNode binaryNode= new BinaryNode(val);
                    right=binaryNode ;

                }else{
                    right.insert(val);
                }

            }
        }
    }
    public void printPreOrder(BinaryNode t){
        System.out.print(t.getData()+" ,");
        if(t.left!=null){
            printPreOrder(t.left);
        }
        if(t.right!=null){
            printPreOrder(t.right);
        }

    }



}

