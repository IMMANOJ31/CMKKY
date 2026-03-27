package practice;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int key = 3;
        int l=0,r=arr.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==key) break;
            else if(arr[mid]<key) l=mid+1;
            else r=mid-1;
        }
    }
}
