package javastudy.yf.ch11;

import java.util.Arrays;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Feb 8, 2020 2:06:46 PM
 * 
 */
public class MergeSort {


	public static void mergeSort(int[] elements)
	   {
	      int n = elements.length;
	      int[] temp = new int[n];
	      mergeSort(elements, 0, n - 1, temp);
	   }

	   private static void mergeSort(int[] elements,
	                                       int left, int right, int[] temp)
	   {
	       if (left < right)
	       {
	          int middle = (left + right) / 2;
	          mergeSort(elements, left, middle, temp);
	          mergeSort(elements, middle + 1, right, temp);
	          merge(elements, left, middle, right, temp);
	       }
	   }

	   private static void merge(int[] elements, int from,
	                             int mid, int to, int[] temp)
	   {
	      int i = from;
	      int j = mid + 1;
	      int k = from;

	      while (i <= mid && j <= to)
	      {
	         if (elements[i] < elements[j])
	         {
	            temp[k] = elements[i];
	            i++;
	         }
	         else
	         {
	            temp[k] = elements[j];
	            j++;
	         }
	         k++;
	      }

	      while (i <= mid)
	      {
	         temp[k] = elements[i];
	         i++;
	         k++;
	      }

	      while (j <= to)
	      {
	         temp[k] = elements[j];
	         j++;
	         k++;
	      }

	      for (k = from; k <= to; k++)
	      {
	         elements[k] = temp[k];
	      }
	   }

	public static void main(String[] args) {
		  int[] arr1 = {86, 47, 89, 109, 90, 3, 43};
	      System.out.println(Arrays.toString(arr1));
	      mergeSort(arr1);
	      System.out.println(Arrays.toString(arr1));

	}

}
