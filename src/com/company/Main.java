package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String userName, password, newPassword;
        int select;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adını giriniz : ");
        userName = input.nextLine();

        System.out.print("Şifrenizi giriniz : ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş yaptınız!");
        } else {
            System.out.println("Hatalı şifre girdiniz!");
            System.out.print("Şifrenizi sıfırlamak ister misiniz? :");
            System.out.println("\n1-Evet\n2-Hayır");
            select = input.nextInt();
            if (select == 1) {
                System.out.println("Yeni şifrenizi giriniz : ");
                input.nextLine();
                newPassword = input.nextLine();
                if (newPassword.equals("java123")) {
                    System.out.println("Yeni şifreniz eskisi ile aynı olamaz!");
                } else {
                    System.out.println("Şifreniz başarılı bir şekilde değiştirildi.");
                }
            }
                else if (select == 2) {
                System.out.println("Şifrenizi tekrar giriniz :");
                input.nextLine();
                password = input.nextLine();

                if (password.equals("java123")) {
                    System.out.println("Giriş yaptınız!");
                }else{
                    System.out.println("Hatalı şifre girdiniz!");
                }

                }

        }
    }
}
