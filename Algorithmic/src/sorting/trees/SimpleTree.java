/**
 * 
 */
package sorting.trees;

/**
 * @author Major Sharpe
 *A simple tree will have a root node with 2 child nodes.
 *This tree then branches out with each node having at most 2 child nodes
 *nodes with no child nodes are called leaf node
 */
public class SimpleTree {
	
	
	
	SimpleTree(int a){
		int temp_comp=0;
		
		if(temp_comp>a){
			Node n = new Node(a,1);
		}
		
		
		
		
	}
	
	
	
	
	public class Node{
		private int node_data;
		Node left;
		Node right;
		
		protected Node(int node_data,boolean node_loc){
			this.node_data=node_data;			
		}
	}

}
