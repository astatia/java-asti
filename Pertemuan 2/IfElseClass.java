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
public class IfElseClass {
    public String nama,ket;
    public int nilaiAkhir;
    Scanner input = new Scanner(System.in);

    public void setInputData(){
        System.out.print("Masukkan Nama Siswa : ");
        nama = input.nextLine();
        System.out.print("Masukkan Nilai Akhir : ");
        nilaiAkhir = input.nextInt();
    }

    public String getKeterangan(){
        if (nilaiAkhir > 70){
            //Perintah jika kondisi true
            ket ="lulus";
            //Perintah jika kondisi false
        }else {
            ket="Gagal";
        }
        return ket;
    }
}

