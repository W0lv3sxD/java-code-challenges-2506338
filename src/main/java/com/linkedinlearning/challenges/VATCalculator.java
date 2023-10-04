package com.linkedinlearning.challenges;

import java.text.DecimalFormat;
import java.util.Scanner;

public class VATCalculator {
    private double vat;
    private String currencySymbol;
    private DecimalFormat df = new DecimalFormat("0.00");

    public VATCalculator(double vat, String currencySymbol) {
        this.vat = vat;
        this.currencySymbol = currencySymbol;
    }

    private double calcVat(double price) {
        return price * vat;
    }

    public String outputTotal(double price) {
        return "Netto: " + df.format(price) + "" + currencySymbol + "\nVAT (" + df.format(vat) + "): " + df.format(calcVat(price)) + ""
                + currencySymbol
                + "\nTotal: " + df.format(calcVat(price) + price)
                + "" + currencySymbol;
    }

    public static void main(String[] args) {
        VATCalculator vC;
        Scanner sc;
        double price;
        double vat;
        String currencySymbol;

        sc = new Scanner(System.in);

        System.out.println("Bitte geben Sie einen Nettopreis ein:");

        price = sc.nextDouble();

        System.out.println("Bitte geben Sie die Mehrwertsteuer als Kommazahl an: ");

        vat = sc.nextDouble();

        System.out.println("Bitte geben Sie ein Währungssymbol an");

        currencySymbol = sc.next();

        sc.close();

        vC = new VATCalculator(vat, currencySymbol);

        vC.outputTotal(price);
    }
}