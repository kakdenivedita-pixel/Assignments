package Assignments;

public class FrequencyOfElements {

    public static void main(String[] args) {

        int arr[] = {4, 2, 4, 6, 2, 2, 7};

        for (int i = 0; i < arr.length; i++) {

            
            boolean alreadyCounted = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (alreadyCounted) {
                continue;
            }

            
            int count = 0;

            for (int k = 0; k < arr.length; k++) {
                if (arr[i] == arr[k]) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println(arr[i] + " occurs " + count + " time");
            } else {
                System.out.println(arr[i] + " occurs " + count + " times");
            }
        }
    }
}