package ProbablisticCounting;

import java.util.*;

public class Solution {
    
    static public class Node{
        int data;
        Node left;
        Node right;
        public Node(int d){
            this.data=d;
            this.left=null;
            this.right=null;
                
        }
        
    }
    
     static Node root=new Node(1);
       // root.data=1;
    public static void inOrder(Node r){
        //Node current=root;
        if(r.left!=null){
            inOrder(r.left);
        } 
        System.out.println(r.data);
            
        
         if(r.right!=null){
            inOrder(r.right);
        }
        
        
    }
    
    
    
    
    public static Node inOrderTraversal(int currentNodeData,Node r){
       Node current=null;
       if(r.data==currentNodeData){
    	   current=r;
       }
    	if(current==null && r.left!=null){
    		current=inOrderTraversal(currentNodeData,r.left);
    	}
    	
    	if(current==null && r.right!=null){
    		current=inOrderTraversal(currentNodeData,r.right);
    	}
    	
    	return current;
    /*	if(r.data==currentNodeData){
    		return r;
    	}
    	else if(inOrderTraversal(currentNodeData,r.left).data==currentNodeData){
       		return (inOrderTraversal(currentNodeData,r.left));
    	}
    	
    	else {
       		return (inOrderTraversal(currentNodeData,r.right));
    	}
    	
    	
    	/*Node current=new Node(0);
        
        if(current.left!=null){
            current=inOrderTraversal(currentNodeData,r.left);
        } 
        if(current.data==0){
        if(current.data==currentNodeData){
            current=r;
            return current;
        }   
        
         if(current.right!=null){
        	 current=  inOrderTraversal(currentNodeData,r.right);
        }
        }
        return current;*/
    }
    
    public static void Insert(int currentNodeData,int l,int r){
        
       // if(l!=-1 && r!=-1){
            Node current=inOrderTraversal(currentNodeData,root);
            System.out.println(current.data+"current data after inOrderTraversal ");
            System.out.println(l+"current data after inOrderTraversal ");
            //if(left!=-1){
            Node nL=new Node(l);
            //nL.data=l;
                current.left=nL;
           // }
          //  if(right!=-1){
                Node nR=new Node(r);
                current.right=nR;
           // }
       // }
    }
    
    public static int calculateDepth(Node root){
        if(root==null){
            return 0;
        }
        else if((root.left==null) && (root.right==null)){
            return 1;
        }
        else{
            return 1+Math.max(calculateDepth(root.left),calculateDepth(root.right));
        }
        
    }
    
    
    public static void swap(int K,int depth){
         int i=1;
        while(K<depth){
            swapK(K);
            K=K*i;
            i++;
        }
        
        
    }
    
    
    public static void swapK(int K){
        
        Node nodeK[]=levelOrder(K);
        for(int i=0;i<Math.pow(2,K);i++){
            
            Node temp=nodeK[i].left;
            nodeK[i].left=nodeK[i].right;
            nodeK[i].right=temp;
        }
        
    }



    public static Node[] levelOrder(int k){
        
        Node nodeK[]=new Node[(int) Math.pow(2,k)];
        Queue<Node> q=new LinkedList<Node>();
        q.add(root);
        Node current=root;
        int iLevel=1;
        int iNode=0;
        int lower=(int) Math.pow(2,k);
        int high=(int) (Math.pow(2,k)-1);
        while(!q.isEmpty()){
            current=(Node) q.remove();
            if(iLevel>=lower && iLevel<=high){
                
                nodeK[iNode]=current;
                iNode++;
            }
            iLevel++;
            q.add(current.left);
            q.add(current.right);
            
        }
        
        
        return nodeK;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc= new Scanner(System.in);
        
       // int nodeCount=1;
        int nodeCount= sc.nextInt();
        int nc=1;
        while(nc<=nodeCount){
            int left=sc.nextInt();
            int right=sc.nextInt();
            Insert(nc,left,right);
            nc++;
            
        }
        
        
        
        int depth=calculateDepth(root);
        int nSwap=sc.nextInt();
        for(int i=0;i<nSwap;i++){
            int K= sc.nextInt();
            swap(K,depth);
            inOrder(root);
        }
        //for(int i=0;i<2*nodeCount)
    }
}