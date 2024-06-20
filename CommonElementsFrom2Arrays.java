import java.util.Scanner;

public class CommonElementsWithoutCollections {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        // Read the size of the first array
        System.out.print("Enter the size of the first array: ");
        int size1 = scanner.nextInt();
        
        // Read the elements of the first array
        int[] array1 = new int[size1];
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }
        
        // Read the size of the second array
        System.out.print("Enter the size of the second array: ");
        int size2 = scanner.nextInt();
        
        // Read the elements of the second array
        int[] array2 = new int[size2];
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }
        
        // Find the common elements
        int[] tempCommon = new int[Math.min(size1, size2)];
        int commonCount = 0;
        
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                if (array1[i] == array2[j]) {
                    // Check if the element is already in tempCommon
                    boolean alreadyExists = false;
                    for (int k = 0; k < commonCount; k++) {
                        if (tempCommon[k] == array1[i]) {
                            alreadyExists = true;
                            break;
                        }
                    }
                    if (!alreadyExists) {
                        tempCommon[commonCount++] = array1[i];
                    }
                }
            }
        }
        
        // Create the final array with the exact size
        int[] commonArray = new int[commonCount];
        for (int i = 0; i < commonCount; i++) {
            commonArray[i] = tempCommon[i];
        }
        
        // Print the common elements
        System.out.println("Common elements in both arrays are:");
        for (int i = 0; i < commonCount; i++) {
            System.out.print(commonArray[i] + " ");
        }
    }
}
