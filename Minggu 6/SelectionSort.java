
package smt2minggu6;

public class SelectionSort {

    public static void main(String[] args) {
        int[] data = {5, 2, 4, 6, 1, 3};
        System.out.print("\n Data Sebelum di Sorting : ");
        for (int x = 0; x < data.length; x++) {
            System.out.print(data[x] + " ");
        }

        //proses selection sort
        System.out.println("\n\nProses Selection Sort");
        for (int x = 0; x < data.length - 1; x++) {
            System.out.println("Iterasi ke-" + (x + 1) + " : ");
            for (int y = 0; y < data.length; y++) {
                System.out.print(data[y] + " ");
            }

            System.out.println("Apakah data " + data[x] + " sudah benar pada urutannya?");

            boolean tukar = false;
            int index = 0;
            int min = data[x];
            String pesan = " Tidak Ada Pertukaran";
            for (int y = x + 1; y < data.length; y++) {
                if (min > data[y]) {
                    tukar = true;
                    index = y;
                    min = data[y];
                }
            }
            if (tukar == true) {
                //pertukaran data
                pesan = " Data " + data[x] + " ditukar dengan Data " + data[index];
                int temp = data[x];
                data[x] = data[index];
                data[index] = temp;
            }
            for (int y = 0; y < data.length; y++) {
                System.out.print(data[y] + " ");
            }

            System.out.println(pesan + "\n");
        }

        //tampilkan data setelah disorting
        System.out.print("\n Data setelah di sorting: ");
        for (int x = 0; x < data.length; x++) {
            System.out.print(data[x] + " ");
        }

    }

}
