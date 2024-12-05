public class UKL3 {
    public static void main(String[] args) {
        int[] array = {3, 7, 3, 1, 7, 7, 5};
        
        int elemenPalingSering = array[0];
        int jumlahMuncul = 0;

        for (int i = 0; i < array.length; i++) {
            int hitung = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    hitung++;
                }
            }
            if (hitung > jumlahMuncul) {
                elemenPalingSering = array[i];
                jumlahMuncul = hitung;
            }
        }
        System.out.println("Elemen yang paling sering muncul adalah " + elemenPalingSering +
                           " sebanyak " + jumlahMuncul + " kali.");
    }
}