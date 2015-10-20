package examples;

/**
 * Created by User on 20.10.2015.
 */
public class BinarySearch {
    public static void main(String[] args) {
    int[] array = {1, 4, 7, 10, 17, 30, 48};
        int element = 10;
    int min=0;//create minimum of array
    int max=6;//maximum of array
    int mid=(min+max)/2;//middle of array

    if(element<array[mid]){
        max=mid;
    }
    else{
        min=mid+1;
    }
    if (element==array[mid]){
        System.out.println(element);

    }
    System.out.println(element);
}
}
