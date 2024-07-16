package dev.anto;

public class Armstrong {
    public static boolean isArmstrong(int num) {
        int temporal = num, digitos = 0, ultimoDigito = 0, suma = 0;

        digitos = (int) (Math.floor(Math.log10(num)) + 1);

        temporal = num;

        while (temporal > 0) {
            ultimoDigito = temporal % 10;
            suma += (Math.pow(ultimoDigito, digitos));
            temporal = temporal / 10;
        }

        return num == suma;
    }
}
