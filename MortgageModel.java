package com.example.mcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MortgageModel{
    private double principle;
    private double interest;
    private int amortization;

    public MortgageModel(String p, String a, String i){
        principle = Double.parseDouble(p);
        interest = Double.parseDouble(i);
        amortization = Integer.parseInt(a);
    }
    public String computePayment(){
        double monthlyR = (interest/100)/12;
        int n = amortization*12;
        double total = (monthlyR*principle)/(1-Math.pow((1+monthlyR),-n));
        String formattedTotal = String.format("$%,.2f", total);
        return formattedTotal;
    }
}