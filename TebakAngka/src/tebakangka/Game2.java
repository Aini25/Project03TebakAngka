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
public class Game2 {
    
    void tampil2() {
      int angka;
      int tebakan;
      int score = 100;
      int jumlah = 0;
      int bonus = 50;
      angka = (int) (Math.random() * 101);
      Scanner input = new Scanner(System.in);
    
        do {
            jumlah++;
            System.out.print("Tebakan Anda : ");
            tebakan = input.nextInt();
           
            if (tebakan > angka) {
                score -= 2;
                System.out.println("Angka Terlalu Besar!");
                System.out.println("Score = " + score);
                System.out.println("-------------------------------");
            }
            else if (tebakan < angka) {
                score -= 2;
                System.out.println("Angka Terlalu Kecil!");
                System.out.println("Score = " + score);
                System.out.println("-------------------------------");
            } 
            else if (tebakan == angka) {
                System.out.println("Tebakan Anda Sudah Benar!");
                if (jumlah <= 5) {
                    System.out.println("Score = " + score);
                    System.out.println("Bonus = " + bonus);
                    System.out.println("Total Score = " + (score + bonus));
                    System.out.println("-------------------------------");
                    break;
                }
                else {
                    System.out.println("Score = " + score);
                }
            }
            if (score == 0) {
                System.out.println("Anda Kalah Dalam Permainan Ini!");
                break;
            }
        }
        while (tebakan != angka);
        }
    }
