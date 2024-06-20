import java.util.Scanner;

    public class LinearSearch{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of the array : ");
            int n = sc.nextInt();
            int[] arr = new int[n];
           
            // input an array
            System.out.println("Enter the array elements : ");
            for(int i =0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter the key element");
            int key = sc.nextInt();
            int result = -1;

            for(int num:arr){
                if(num==key){
                    result = num ;
                    break;
                }
               
            }
            if(result!= -1){
            System.out.println("The key element is found nd is "+ result);
            }
            else{
                 System.out.println("The key element isnt found");
            }

        }
    }
