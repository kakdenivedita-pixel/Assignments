package Assignments;

public class RemoveDuplicatePrints {

    public static void main(String[] args) {

        int arr[] = {5, 3, 8, 5, 2, 3, 9, 8};

        for (int i = 0; i < arr.length; i++) {

            boolean isDuplicate = false;

            
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}