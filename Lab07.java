package com.mycompany.lab07;

public class Lab07
{
    class BinarySearchExample
    {
        // Initializing the new method, binary search and the 
        // new array and variables used
        public static void binarySearch(int arr[], int first, int last, int key)
        {
            // setting the variable "mid" to be equal to the 
            // first and last instance of the array divided by 2
            int mid = (first + last)/2;
            // Write the while loop to loop through while the 
            // first instance is less than or equal to the last
            // to go through the entire array
            while( first <= last )
    {
        // Write an if statement to check if the middlemost array is less than the key variable to
        // continue searching and move on if it is not found
        if ( arr[mid] < key )
        {
            first = mid + 1;   
        }
        // Else if the middlemost array element is the number we are
        // searching for, then print the found element out and break the if statement
        else if ( arr[mid] == key )
        {
            System.out.println("Element is found at index: " + mid);
            break;
        }
        // If it is not the middlemost element, then search backwards through the array
        else
        {
            last = mid - 1;
        }
        //
        mid = (first + last)/2;
    }
    if ( first > last )
    {
      System.out.println("Element is not found!");
    }
 }
        public static void main(String args[])
        {
        int arr[] = {10,20,30,40,50};
        int key = 30;
        int last=arr.length-1;
        binarySearch(arr,0,last,key);	
        }
    }
}

