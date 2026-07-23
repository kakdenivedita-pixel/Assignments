package WeeklyAssignments;

public class FindCommonElements {

    public static void main(String[] args) {

        int arr1[] = {2, 5, 7, 9, 11, 5};
        int arr2[] = {1, 5, 7, 15, 20, 5};

        for (int i = 0; i < arr1.length; i++) {

            
            boolean alreadyPrinted = false;
            for (int k = 0; k < i; k++) {
                if (arr1[i] == arr1[k]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted) {
                continue;
            }

            
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    break;
                }
            }
        }
    }
}