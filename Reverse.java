
public class Reverse {
    static void reversed(int arr[], int n){
        int i = 0;
        int j = n-1;
        while( i < j){
            
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                }
            
            for( int element : arr){
                System.out.print("\t"+ element);
            }
        }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int n = arr.length;
        reversed(arr, n);
    }
}

