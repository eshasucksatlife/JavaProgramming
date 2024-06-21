import java.util.Scanner;
class maxminArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array");
        for(int i = 0; i< size; i++){
            arr[i] = sc.nextInt();
        }
        
        // initialize first element as max and min
        
        int max = arr[0];
        int min = arr[0];
        
        for(int i =1; i<size;i++){
            
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
