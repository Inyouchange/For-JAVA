//U10314010 ³¯¬M¦Ð 2017/12/04 02:10
//Create a class BubbleSort to sort the data while read and write into the file

public class BubbleSort {
	/** Bubble sort method */
	//Two arrays (account,bmi) need sort
	public static void bubbleSort(Account[]list,BMI[]list1) {
		//Before sort order, the initial ordering is incorrect 
		boolean sorted = false;
		//To execute sorting
		int n = list.length;
		while(!sorted){
			for (int k = 1; k < list.length; k++){
				//The ordering is correct, then stop
				sorted = true;		
				// Array may be sorted and next pass not needed
				for (int i = 0; i < n - 1; i++) {
					if ((list[i].getName()).compareTo(list[i + 1].getName()) > 0) {
						// Swap list[i] with list[i + 1]
						Account temp = list[i];
						list[i] = list[i + 1];
						list[i + 1] = temp;
						BMI temp1 = list1[i];
						list1[i] = list1[i + 1];
						list1[i + 1] = temp1;
						//To ordering again
						sorted = false;
					}
				}
			}
		}
	}
}
