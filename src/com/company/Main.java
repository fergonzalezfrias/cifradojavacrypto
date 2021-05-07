package com.company;

public class Main {

    public static void main(String[] args) {

        Cifrado c = new Cifrado();
        byte[] datoCifrado;
        try{
            datoCifrado = c.cifra("password", "palabraclave");
            System.out.print("Dato cifrado: ");
            for(byte a: datoCifrado)
                System.out.print(a);
            System.out.println("\nDato descifrado: " + c.descifra(datoCifrado, "palabraclave"));
        } catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }

}
