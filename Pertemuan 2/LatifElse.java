/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package astibelajar;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class LatifElse {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String keterangan,nama;
        int nilai;

        System.out.print("Masukkan Nama Siswa : ");
        nama = input.nextLine();
        System.out.print("Masukkan Nilai Akhir : ");
        nilai = input.nextInt();
        if(nilai > 70) {
            //perintah jika kondisi true
            keterangan ="Lulus"; 
        }else{
            //perintah jika kondisi false
            keterangan = "Gagal";
        }
        System.out.println("Hasil Akhir");
        System.out.println("===========================================");
        System.out.println("Nama Siswa                : "+nama);
        System.out.println("Nilai Akhir yang di dapat : "+nilai);
        System.out.println("Keterangan                : "+keterangan);
        System.out.println("===========================================");
    }

}
