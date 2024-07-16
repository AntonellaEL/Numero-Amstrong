package dev.anto;

public class App {
    public static void main(String[] args) {
        int numero = 371;
        System.out.println(numero + " es un número Armstrong? " + Armstrong.isArmstrong(numero));

        // Puedes probar con otros números
        int numero2 = 173;
        System.out.println(numero2 + " es un número Armstrong? " + Armstrong.isArmstrong(numero2));

        int numero3 = 731;
        System.out.println(numero3 + " es un número Armstrong? " + Armstrong.isArmstrong(numero3));
    }
}
