package application;


public class Program {
	public static void main(String[] args) {
		
		int[] list1 = { 8, 4, 6, 2, 3 };
		int[] list2 = { 2, 3, 1, 9, 6 };
		int[] list3 = { 6, 4, 3, 7, 2 };
		
		System.out.print("Antes: ");
		printList(list1);
		System.out.print("Depois: ");
		bubbleSort(list1);
		System.out.println("");
		
		System.out.print("Antes: ");
		printList(list2);
		System.out.print("Depois: ");
		selectionSort(list2);
		System.out.println("");
		
		System.out.print("Antes: ");
		printList(list3);
		System.out.print("Depois: ");
		insertionSort(list3);
		System.out.println("");
		
	}
	
	public static void printList(int[] list) {
		for(int x = 0; x < list.length; x++) {
			if(x == 0) {
				System.out.print(list[x]);
			}
			else {
				System.out.print(", " + list[x]);
			}
		}
		System.out.println();
	}

	public static void bubbleSort(int[] list) {
		for(int i = 0; i < list.length; i++) {
			for(int j = 0 ;j < list.length - i - 1; j++) {
				if(list[j] > list[j+1]) {
					int aux = list[j];
					list[j] = list[j+1];
					list[j+1] = aux;
				}
			}
		}
		printList(list);
	}

	public static void selectionSort(int[] list) {
		for(int i = 0; i < list.length - 1; i++) {
			int aux_idx = i;
			for(int j = i + 1; j < list.length; j++) {
				if(list[j] < list[aux_idx]) {
					aux_idx = j;
				}
			}
			int aux_value = list[aux_idx];
			list[aux_idx] = list[i];
			list[i] = aux_value;
		}
		printList(list);
	}

	public static void insertionSort(int[] list) {
		for(int i = 1; i < list.length; i++) {
			int key = list[i];
			int j = i - 1;
			while(j >= 0 && list[j] > key) {
				list[j + 1] = list[j];
				j--;
			}
			list[j + 1] = key;
		}
		printList(list);
	}
}
