package com.company;


public class Main {

    public static void main(String[] args) {

        System.out.println("Test op negatief beginbedrag.");

        try{
            BankRekening br = new BankRekening(-5);
            System.out.printf("het saldo is %d%n", br.getSaldo());

        }catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }

        System.out.println("Test op negatief bedrag storten.");
        BankRekening br = new BankRekening(100);

        try{
            br.stortGeld(-50);
        }catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }

        System.out.printf("Het saldo bedraagt %d%n", br.getSaldo());
        System.out.println("Test op negatief bedrag afhalen");
        try{

            br.haalGeldAf(-50);
        }catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }

        System.out.printf("Het saldo bedraagt %d%n", br.getSaldo());
        System.out.println("Test op teveel geld afhalen");

        try{
            br.haalGeldAf(1000);
        }catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }

        System.out.printf("Het saldo bedraagt %d%n", br.getSaldo());
        System.out.println("Test op alles OK");
        System.out.println("50 euro afhalen");

        br.haalGeldAf(50);
        System.out.printf("Het saldo bedraagt %d%n", br.getSaldo());
        System.out.println("100 euro storten");
        br.stortGeld(100);
        System.out.printf("het saldo bedraag %d%n", br.getSaldo());
    }
}
