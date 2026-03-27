/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loopdowhilee;

import java.util.Scanner;


public class LoopDoWhilee {
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         int pilihan = 0;
         
         do  {
             System.out.println("/n===MENU APLIKASI ===");
             System.out.println("1. Tambah Data");
             System.out.println("2. Lihat Data");
             System.out.println("3. Keluar");
             pilihan = scan.nextInt();
             
             switch(pilihan) {
                 case 1: System.out.println("Data Ditambahkan...");break;
                 case 2: System.out.println("Menampilkan Data...");break;
                 case 3: System.out.println("Terima kasih...");break;
                 default: System.out.println("Pilihan tidak ada");break;       
             }
         } while (pilihan != 3); // Ulangi selama pilihan bukan 3 (keluar)
         
         scan.close();
             
             
         }    
        
    }

