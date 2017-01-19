/**
 * 
 */
package sorting.impl;

/**
 * @author Major Sharpe
 *This is the implementation of the simplest sorting algo
 *The worst time complexity of the algo is O(n^2)
 *Which is due to the two for loops that iterate through all elements present in the
 *input array
 *
 *
 */
public class BubbleSort {
	private final int[] arr_unsort;
	
	public BubbleSort(int[] arr_input){
		this.arr_unsort=arr_input;	
		sort_Bubble();
	}
	
	public void sort_Bubble(){
		
		for(int i=0;i< arr_unsort.length;i++){				/// 1+2+3+....+n
			int temp=0;
			for(int j=i;j<arr_unsort.length;j++){			    /// 1+2+3+....+n
				
				if(arr_unsort[i] > arr_unsort[j]){
					  temp=arr_unsort[i];
					  arr_unsort[i]=arr_unsort[j];
					  arr_unsort[j]=temp;
				}
			}			
		}
		for(int O:arr_unsort){
			System.out.println(O);
			
		}
		System.out.println("Complexity is O(n^2)");
		
	}

}
