import java.util.Scanner;
class arraySum{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int size = sc.nextInt();
        int arr[] = new int arr[size];

        for(int i = 0; i<arr.length; i++){
            arr[i]= sc.nextInt();

        }
        sum(arr);
        
    }
    public static int sum(int arr[]) {

        int sum = 0;
        for(int i =0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        return sum;
        
    }
}