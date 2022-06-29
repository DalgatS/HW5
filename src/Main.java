public class Main {
    public static void main(String[] args) {
        //hw5();
        hw6();

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }


    public static void hw5() {
        int[] ott = new int[]{1, 2, 3};
        double[] osn = {1.57, 7.654, 9.986};
        int[] ott2 = {1, 2, 3, 4, 5, 6};

        for (int i = 0; i < ott.length; i++)
            System.out.print(ott[i]);
        System.out.println();

        for (int k = 0; k < osn.length; k++)
            System.out.print(osn[k] + " ");
        System.out.println();

        for (int l = 0; l < ott2.length; l++)
            System.out.print(ott2[l]);

        System.out.println();


        for (int z = (ott.length - 1); z >= 0; z--)
            System.out.print(ott[z]);
        System.out.println();

        for (int d = (osn.length - 1); d >= 0; d--)
            System.out.print(osn[d] + " ");
        System.out.println();

        for (int r = (ott2.length - 1); r >= 0; r--)
            System.out.print(ott2[r]);


        System.out.println();

        for (int x = 0; x < ott2.length; x++)
            if (ott2[x] % 2 != 0) {
                System.out.print(ott2[x] + 1);
            } else System.out.print(ott2[x]);

    }

    public static void hw6() {

        int[] arr = generateRandomArray();

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();


        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.print("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println();


        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < max) ;
            {
                max = arr[i];
            }
        }
        System.out.print("Максимальная сумма трат за день составила " + max + " рублей");
        System.out.println();

        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > min) ;
            {
                min = arr[i];
            }
        }
        System.out.print("Минимальная сумма трат за день составила " + min + " рублей");
        System.out.println();


        double average = (sum / arr.length);
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");



        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = (reverseFullName.length - 1); i >= 0; i--)
            System.out.print(reverseFullName[i]);
        System.out.println();
    }
}

