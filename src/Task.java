public class Task {
    public void task() {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6};

        int[] result = new int[arr1.length + arr2.length];
        int index = 0;

        for (int i = 0; i < arr1.length; i++) {
            result[index] = arr1[i];
            index++;
        }

        for (int i = 0; i < arr2.length; i++) {
            boolean var = false;

            for (int j = 0; j < index; j++) {
                if (arr2[i] == result[j]) {
                    var = true;
                    break;
                }
            }

            if (!var) {
                result[index] = arr2[i];
                index++;
            }
        }


        for (int i = 0; i < index; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
