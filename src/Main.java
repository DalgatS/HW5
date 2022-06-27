public class Main {
    public static void main(String[] args) {

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
}
