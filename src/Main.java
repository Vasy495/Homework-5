public class Main {
    public static void main(String[] args) {

        // Example-1
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        double[] doubleArr = {1.57, 7.654, 9.986};

        int[] arrNew = new int[] {1, 2, 5, 6, 8};


        // Example-2
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                System.out.print(arr[i] + ", ");
                continue;
            }
            System.out.println(arr[i]);
        }

        for (int i = 0; i < doubleArr.length; i++) {
            if (i == doubleArr.length - 1) {
                System.out.println(doubleArr[i]);
                break;
            }
            System.out.print(doubleArr[i]+ ", ");
        }

        for (int i = 0; i < arrNew.length; i++) {
            if (i == arrNew.length - 1) {
                System.out.println(arrNew[i]);
                break;
            }
            System.out.print(arrNew[i] + ", ");
        }

        // Example-3

        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arr[i]);
                break;
            }
            System.out.print(arr[i] + ", ");
        }

        for (int i = doubleArr.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(doubleArr[i]);
                break;
            }
            System.out.print(doubleArr[i] + ", ");
        }

        for (int i = arrNew.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arrNew[i]);
                break;
            }
            System.out.print(arrNew[i] + ", ");
        }

        // Example-4
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] += 1;
            }
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
                break;
            }
            System.out.print(arr[i] + ", ");

        }

    }
}