/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algodat_No1;

/**
 *
 * @author Windows 8
 */
public class Main {
    public static void main(String[] args) {
        Object [][] data =
        {
            {"Hilman"   ,"1998" ,"Laki"     }, 
            {"Nadira"   ,"2004" ,"Perempuan"}, 
            {"Randi"    ,"2003" ,"Laki"     }, 
            {"Dewi"     ,"2002" ,"Perempuan"}, 
            {"Hindami"  ,"2002" ,"Laki"     }  
        };
        
        Object[][] ganti = ChangeArrayLength.changeLength2D(data, 9, 3);
        
        System.out.println("Length   : "+ganti.length);
        System.out.println("Length 2 : "+ganti[0].length);
        System.out.println("");
        
        for(Object[] ganti2 : ganti){
            for(int i = 0; i<ganti[0].length; i++){
                System.out.println(ganti2[i]);
            }
            System.out.println();
        }
    }
}
