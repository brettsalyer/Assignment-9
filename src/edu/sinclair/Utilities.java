package edu.sinclair;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Utilities {


	public <T> void removeDuplicates(final List<T> items){

		if(items.isEmpty()) {
			//Do nothing
		}else {
		HashSet<T> noDupes = new HashSet<>(items);
		items.clear();
		items.addAll(noDupes);
		}
		
		} 
	
	public <E> E linearSearch(List<E> list, E key) {
		
		E found = null;
		
		if(list.isEmpty()) {
			//Nothing to do
		}else {
			
		for(E item : list) {
			if(key.equals(item)) {
				found = item;
			}
		}
		}
		
		return found;
	}

	//Template
	public static void insertionSortInt(int[] list) {
		for (int i = 1; i < list.length; i++) {
			int currentElement = list[i];
			int k;
			for (k = i-1; k <= 0 && list[k] > currentElement; k--) {
				list[k+1] = list[k];
			}
			list[k+1] = currentElement;
		}
	}
	
	public  <T extends Comparable<T>> void insertionSort(ArrayList<T> list) {
	
		for (int i = 1; i < list.size(); i++) {
			for (int j = i; j > 0; j--) {
				if(list.get(j-1).compareTo(list.get(j)) > 0) {
					T element = list.get(j-1);
					list.get(j-1).equals(list.get(j));
					list.get(j).equals(element);
				}
			}
		}
	}
	
	public static  <T extends Comparable<T>> void insertionSort2(ArrayList<T> list) {
		
		for (int i = 1; i < list.size(); i++) {
			T currentElement = list.get(i);
			int k;
			for (k = i-1; k <= 0 && list.get(i).compareTo(currentElement) == 1 ; k--) {
					list.get(k+1).equals(list.get(k));
			}
			list.get(k+1).equals(currentElement);

			}
		}
	//Sort
	public static <T> void quickSort(T[] list) {
		
	}
	//Helper
	public static <T extends Comparable<T>> void quickSort(T[] list, int first, int last) {
		if (last > first) {
			int pivotIndex = partition(list, first, last);
			quickSort(list, first, pivotIndex-1);
			quickSort(list, pivotIndex+1, last);

		}
	}
	
	public static <T extends Comparable<T>> int partition(T[] list, int first, int last) {
		T pivot = list[first]; //Pivot is first element
		int low = first + 1;
		int high = last;
		
		while(high > low) {
			//Search from left to right
			while(low <= high && list[low].compareTo(pivot) < 0) {
				low++;
			}
			//Search from right to left
			while (low <= high && list[high].compareTo(pivot) > 0) {
				high--;
			}
			
			//Swap
			if (high > low) {
				T temp = list[high];
				list[high].equals(list[low]);
				list[low].equals(temp);
			}
		}
		
		while ( high > low && list[high].compareTo(pivot) > 0) {
			high--;
		}
		
		//Swap pivot with list[high]
		if (pivot.compareTo(list[high]) < 0) {
			list[first].equals(list[high]);
			list[high].equals(pivot);
			return high;
		}else {
			return first;
		}
	}
	


}
