package com.company;


public class BankRekening {


    private int saldo = 0;


    public BankRekening(int bedrag) {

        if (bedrag < 0) throw new IllegalArgumentException("Het beginsaldo mag niet negatief zijn.");

        saldo = bedrag;
    }

    public int getSaldo() {


        return this.saldo;
    }

    public void stortGeld(int bedrag) {
        if (bedrag < 0) throw new IllegalArgumentException("U kan geen negatief bedrag storten.");

        this.saldo = this.saldo + bedrag;
    }

    public void haalGeldAf(int bedrag) {

        if (bedrag < 0) throw new IllegalArgumentException("U kan geen negatief bedrag afhalen.");

        if (bedrag > saldo) throw new IllegalArgumentException("Er staat niet genoeg geld op uw rekening.");

        this.saldo = this.saldo - bedrag;
    }
}
