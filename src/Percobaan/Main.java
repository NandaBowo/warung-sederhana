/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Percobaan;

import java.util.Scanner;

/**
 *
 * @author Nanda D. Cahyo
 */
public class Main {
    public static void main(String[] args) {
        String data_input;
        int in = 0;
        String[] data = new String[10];
        String lagi;
        Scanner input = new Scanner(System.in);
        
        do {
            System.out.print("Masukan data : ");
            data_input = input.next();
        
            data[in] = data_input;
            in++;
        
            System.out.print("Lagi? : ");
            lagi = input.next();
        } while (lagi.equals("y"));
        
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                System.out.print(data[i] + " ");
            }
        }
    }
}
