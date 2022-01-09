/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uas.project;

import java.util.Scanner;

/**
 *
 * @author Nanda D. Cahyo
 */
public class Main {
    public static void main(String[] args) {
        int kode_menu, porsi_menu, i = 0, total_semua_harga = 0;
        boolean kondisi = true;
        String[] menu_pesanan = new String[10];
        int[] porsi_pesanan = new int[10];
        int[] total_harga_menu = new int[10];
        String pesan_menu_lain;
        
        Scanner inputUser = new Scanner(System.in);
        
        System.out.println("=============================================");
        System.out.println("            Warung Makan Sederhana           ");
        System.out.println("=============================================");
        System.out.println("Daftar Makanan :");
        System.out.println("1. Nasi Goreng Rp 10.000");
        System.out.println("2. Bakso Rp 8.000");
        System.out.println("3. Mie Ayam Rp 11.000");
        System.out.println("---------------------------------------------");
        System.out.println("Daftar Minuman :");
        System.out.println("4. Aqua Rp 3.000");
        System.out.println("5. Fanta Rp 5.000");
        System.out.println("6. Sprite Rp 4.000");
        System.out.println("=============================================");
        
        
        while (kondisi) {
            System.out.print("Masukan kode menu (contoh : 1) : ");
            kode_menu = inputUser.nextInt();
            System.out.print("Masukan jumlah porsi (contoh : 1) : ");
            porsi_menu = inputUser.nextInt();
            
            switch(kode_menu) {
                case 1 : 
                    total_harga_menu[i] = 10000 * porsi_menu;
                    menu_pesanan[i] = "Nasi Goreng";
                    porsi_pesanan[i] = porsi_menu;
                    break;
                case 2 :
                    total_harga_menu[i] = 8000 * porsi_menu;
                    menu_pesanan[i] = "Bakso";
                    porsi_pesanan[i] = porsi_menu;
                    break;
                case 3 :
                    total_harga_menu[i] = 11000 * porsi_menu;
                    menu_pesanan[i] = "Mie Ayam";
                    porsi_pesanan[i] = porsi_menu;
                    break;
                case 4 :
                    total_harga_menu[i] = 3000 * porsi_menu;
                    menu_pesanan[i] = "Aqua";
                    porsi_pesanan[i] = porsi_menu;
                    break;
                case 5 :
                    total_harga_menu[i] = 5000 * porsi_menu;
                    menu_pesanan[i] = "Fanta";
                    porsi_pesanan[i] = porsi_menu;
                    break;
                case 6 :
                    total_harga_menu[i] = 4000 * porsi_menu;
                    menu_pesanan[i] = "Sprite";
                    porsi_pesanan[i] = porsi_menu;
                    break;
                default :
                    System.out.println("Silahkan pilih kode yang ada di daftar");
                    continue;
            }
            
            i++;
            
            System.out.print("Apakah ingin menambah menu lain? (y/t) : ");
            pesan_menu_lain = inputUser.next();
            
            if (pesan_menu_lain.equals("y") || pesan_menu_lain.equals("Y")) {
                continue;
            } else {
                break;
            }
            
        }
        
        System.out.println("=============================================");
        System.out.println("Pesanan anda :");
        for (int j = 0; j < 10; j++) {
            if (menu_pesanan[j] != null) {
                System.out.println(menu_pesanan[j] + " * " + porsi_pesanan[j] + " = " + total_harga_menu[j]);
            }
            total_semua_harga = total_semua_harga + total_harga_menu[j];
        }
        System.out.println("------------------------ +");
        System.out.println("Total = " + total_semua_harga);
    }
}
