/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tebakangka;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Game1 {
    
    void tampil() {
      int angka;
      int tebakan;
      angka = (int) (Math.random() * 101);
      Scanner input = new Scanner(System.in);
    
        do {
            System.out.print("Tebakan Anda : ");
            tebakan = input.nextInt();
           
            if (tebakan > angka) {
                System.out.println("Angka Terlalu Besar!");
                System.out.println("-------------------------------");
            }
            else if (tebakan < angka) {
                System.out.println("Angka Terlalu Kecil!");
                System.out.println("-------------------------------");
            } 
            else {
                System.out.println("Tebakan Anda Sudah Benar!");
                System.out.println("-------------------------------");
                break;
            }
        }
        while (tebakan != angka);
        }
    }
