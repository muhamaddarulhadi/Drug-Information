
package drugger;

public class Node
{
    Object obj;
    Node leftChild,rightChild;
    
    Node()
    {
        obj=null;
        leftChild=null;
        rightChild=null;
    }
    
    Node(Object obj)
    {
        this.obj=obj;
        leftChild=null;
        rightChild=null;
    }
    
    Node(Object obj,Node leftChild,Node rightChild)
    {
        this.obj=obj;
        this.leftChild=leftChild;
        this.rightChild=rightChild;
    }
    
    public int numOfChild()
    {
        int num=0;
        if(leftChild!=null)
            num++;
        if(rightChild!=null)
            num++;
        return num;
    } 
    
    public Object getObj()
    {
        return this.obj;
    }
}
