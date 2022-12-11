package program.menu.makanan;
import java.util.Scanner;
public class ProgramMenuMakanan {

    
    public static void main(String[] args) {
       
        
        Scanner input = new Scanner(System.in);
        int kodeMakanan;
        String namaMakanan;
        String adaLagi;
        int hargaMakanan;
        int banyakMakanan;
        System.out.println(" -------------------List Nama Makanan dan Harga------------------- ");
        System.out.println("1. Lalapan Bebek  Rp 30.000,00");
        System.out.println("2. Lalapan Ayam  Rp 20.000,00");
        System.out.println("3. Lalapan Lele  Rp 15.000,00");
        System.out.println("4. Lalapan Gurami  Rp 50.000,00");
        
        System.out.print("Masukkan Kode Makanan: ");
        kodeMakanan=input.nextInt();
        
        System.out.print("Jumlah Pesanan:  ");
        banyakMakanan=input.nextInt();
        
        switch (kodeMakanan){
            case 1:
                namaMakanan= "Lalapan Bebek";
                hargaMakanan= 30000;
                break;
            case 2:
                namaMakanan= "Lalapan Ayam";
                hargaMakanan= 20000;
                break;
            case 3:
                namaMakanan= "Lalapan Lele";
                hargaMakanan= 15000;
                break;
            case 4:
                namaMakanan= "Lalapan Gurami";
                hargaMakanan= 50000;
                break;
            default:
                namaMakanan= "Makanan tidak ditemukan";
                hargaMakanan= 0;
                break;
        }
            
            int totalHarga = hargaMakanan * banyakMakanan;
            System.out.println("====================================");
            System.out.println("Nama Makanan: "+ namaMakanan);
            System.out.println("Harga Makanan: "+ "Rp."+ hargaMakanan);
            System.out.println("Jumlah Pesanan: " + banyakMakanan);
            System.out.println("Total Harga: " + totalHarga);
    }
    
}
