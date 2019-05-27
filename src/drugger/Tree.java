
package drugger;

import javax.swing.table.DefaultTableModel;

public class Tree
{
    Node root;
    
    Tree()
    {
        this.root=null;
    }
            
    public Node insert(drug Drug){
    Node node = new Node(Drug);

    if ( root == null ) {
      root = node;
      return root;
    }

    insertRec(root, node);
    return root;
  }

    private void insertRec(Node latestRoot, Node node)
    {
        drug latestDrug=(drug)latestRoot.getObj();
        drug nodeDrug=(drug)node.getObj();
        if (latestDrug.getCode()> nodeDrug.getCode())
        {
            if(latestRoot.leftChild==null)
            {
                latestRoot.leftChild=node;
                return;
            }
        else
        {
            insertRec(latestRoot.leftChild, node);
        }
        }
        else
        {
            if(latestRoot.rightChild==null)
            {
                latestRoot.rightChild = node;
                return;
            }
        else
        {
            insertRec(latestRoot.rightChild, node);
        }
        }
  }
    
    public void inorder(Node node,DefaultTableModel inorder) 
    {
        if (node!= null) 
        {
            drug test=(drug)node.getObj();
            inorder(node.leftChild,inorder);
            inorder.addRow(new Object[]{test.getCode(),test.getName(),test.getType(),test.getEffect()});
            inorder(node.rightChild,inorder);
        }
    }

    public void descending(Node node,DefaultTableModel descendingorder) 
    {
        if (node != null) 
        {
            drug test=(drug)node.getObj();
            descending(node.rightChild,descendingorder);
            descendingorder.addRow(new Object[]{test.getCode(),test.getName(),test.getType(),test.getEffect()});
            descending(node.leftChild,descendingorder);
        }
    }

    public void preorder(Node returnNode,DefaultTableModel preorder)
    {
        printPreOrderNode(returnNode,preorder);
        System.out.println("");
    }
    private void printPreOrderNode(Node currRoot,DefaultTableModel preorder) 
    {
        if(currRoot==null) 
        {
            return;
        }
        drug test=(drug)currRoot.getObj();
        preorder.addRow(new Object[]{test.getCode(),test.getName(),test.getType(),test.getEffect()});
        printPreOrderNode(currRoot.leftChild,preorder);
        printPreOrderNode(currRoot.rightChild,preorder);
    }
  
    public void postorder(Node returnNode,DefaultTableModel postorder)
    {
        postorderNode(returnNode,postorder);
    }
     private void postorderNode(Node currRoot1,DefaultTableModel postorder)
     {
        if (currRoot1 == null)
        {
             return;
        }
        drug test=(drug)currRoot1.getObj();
        postorder(currRoot1.leftChild,postorder);             
        postorder(currRoot1.rightChild,postorder);
        postorder.addRow(new Object[]{test.getCode(),test.getName(),test.getType(),test.getEffect()});  
     }     
  
    public void removeRow(DefaultTableModel model)
    {
        for(int remove=model.getRowCount()-1; remove>=0; remove--)
        model.removeRow(remove);
    }
    
    public Node find(int code)
    {
        Node current = root;
        while(current!=null)
        {
            drug findDrug=(drug)current.getObj();
            if(findDrug.getCode()==code)
            {
                return current;
            }
            else if(findDrug.getCode()>code)
            {
                current = current.leftChild;
            }
            else
            {
            current = current.rightChild;
            }
        }
        return root;
    }
  
    public void update(int code,String name,String type,String effect)
    {
        Node current = root;
        boolean updated=false;
        while(current!=null && updated!=true)
        {
            drug findDrug=(drug)current.getObj();
            if(findDrug.getCode()==code)
            {
                findDrug.setName(name);
                findDrug.setType(type);
                findDrug.setEffect(effect);
                updated=true;
            }
            else if(findDrug.getCode()>code)
            {
                current = current.leftChild;
            }
            else
            {
            current = current.rightChild;
            }
        }
    }
    
    public void deletecode(int code,Node rootNode)
    {
        rootNode = deleteRec(rootNode, code);
    }
 
    Node deleteRec(Node root, int code)
    {
        if (root==null)  
            return root;
 
        drug moveNode=(drug)root.getObj();
        if (code < moveNode.getCode())
            root.leftChild = deleteRec(root.leftChild, code);
        else if (code>moveNode.getCode())
            root.rightChild = deleteRec(root.rightChild, code);
 
        else
        {
            if (root.leftChild==null)
                return root.rightChild;
            else if (root.rightChild == null)
                return root.leftChild;
 
                    int abc= minValue(root.rightChild);
                    moveNode.setCode(abc);
            root.rightChild = deleteRec(root.rightChild, moveNode.getCode());
        }
 
        return root;
    }
    
    int minValue(Node root)
    {
        drug this1=(drug)root.getObj();
        int minv = this1.getCode();
        while (root.leftChild != null)
        {
            drug this2=(drug)root.leftChild.getObj();
            minv = this2.getCode();
            root = root.leftChild;
        }
        return minv;
    }
}





  

