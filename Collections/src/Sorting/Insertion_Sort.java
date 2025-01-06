package Sorting;

public class Insertion_Sort {
    public static void main(String[] args) {
        int arr[] = {7, 8, 3, 1, 2};

        //Insertion Sort
        for(int i = 1; i < arr.length; i++)
        {
            int current = arr[i];
            int j = i-1; //to tract sorted parts we're using j
            while(j >= 0 && current < arr[j])
            {
                arr[j+1] = arr[j];
                j--;
            }
            //placement
            arr[j+1] = current;
        }
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
