/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algodat.Kelas.Tugas1;

/**
 *
 * @author Windows 8
 */
public class Main {
    public static void main(String[] args) {
        ArrayLinearList all = new ArrayLinearList();
        
        System.out.println("Panjang Array\t: " +all.element.length);
        
        //soal No. 4
        all.add(0, "a");
        all.add(1, "b");
        all.add(2, "c");
        all.add(3, "d");
        all.add(4, "e");
        
        System.out.print("\n");
        System.out.println("Isi Elemen Awal\t\t: " +all.toString());
        System.out.println("Elemen Index Kedua\t: " +all.get(2));
        System.out.println("Index Elemen (e)\t: "+all.indexOf("e"));
        
        all.remove(2);
        System.out.print("\n");
        System.out.println("Isi Setelah Index Kedua Dihapus\t\t: " +all.toString());
        all.add(2, "z");
        System.out.println("Isi Setelah Index Kedua Ditambah (z)\t: " +all.toString());
        
        all.add(5, "f");
        all.add(6, "g");
        
        System.out.print("\n");
        System.out.println("Jumlah Elemen Sekarang\t: " +all.size);
        System.out.println("Isi Array Sekarang\t: " +all.toString());
        
        //Soal No. 5
        all.trimToSize();
        System.out.print("\n");
        System.out.println("Jumlah Array Setelah Dipotong\t: " +all.element.length);
        
        //Soal No. 6
        all.setSize(4);
        System.out.println("Isi Array Setelah setSize 4\t: " +all.toString());
        
        //Soal no. 8
        all.clear();
        System.out.println("Isi Array Setelah clear \t: " +all.toString());
        
    }
}
