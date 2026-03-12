package sorting;


public class BubbleSort {

            public static void bubbleSort(int arr[]) {
                int n = arr.length;

                for(int i = 0; i < n - 1; i++) {
                    boolean isSwap = false;

                    for(int j = 0; j < n - i - 1; j++) {

                        if(arr[j] > arr[j + 1]) { //change the arthimetic for descreasing order
                            int temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;

                            isSwap = true;
                        }
                    }

                    if(!isSwap) {
                        return; // array already sorted
                    }
                }
            }

    public static void main(String[] args) {
        int arr[] = {2,5,7,8,0,1,5};

        bubbleSort(arr);

        for(int sort : arr){
            System.out.println(sort);
        }
    }
}


