//U10314010 ³¯¬M¦Ð 2017/11/27 17:50
//Rewrite the bubblesort to improve the performance

public class BubbleSort {
	/** Bubble sort method */
	public static void bubbleSort(int[] list) {
		//Before sort order, the initial ordering is incorrect 
		boolean sorted = false;
		//To execute sorting
		while(!sorted){
			for (int k = 1; k < list.length; k++){
				//The ordering is correct, then stop
				sorted = true;		
				// Array may be sorted and next pass not needed
				for (int i = 0; i < list.length - k; i++) {
					if (list[i] > list[i + 1]) {
						// Swap list[i] with list[i + 1]
						int temp = list[i];
						list[i] = list[i + 1];
						list[i + 1] = temp;
						//To ordering again
						sorted = false;
					}
				}
			}
		}
	}

	/** A test method */
	public static void main(String[] args) {
		int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
		bubbleSort(list);
		for (int i = 0; i < list.length; i++)
			System.out.print(list[i] + " ");
	}
}
