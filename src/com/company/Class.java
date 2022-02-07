package com.company;

public class Class {
    private int nomer;
    private String soz;
    private int[] massiv;


    public Class(int nomer, String soz, int[] massiv) {
        this.nomer = nomer;
        this.soz = soz;
        this.massiv = massiv;
    }

    public int getNomer() {
        return nomer;
    }

    public void setNomer(int nomer) {
        this.nomer = nomer;
    }

    public String getSoz() {
        return soz;
    }

    public void setSoz(String soz) {
        this.soz = soz;
    }

    public int[] getMassiv() {
        return massiv;
    }

    public void setMassiv(int[] massiv) {
        this.massiv = massiv;
    }
    public void showInfo() {
        System.out.println("Берилген сан: " + nomer);
        System.out.println("Берилген соз: " + soz);
        System.out.print("Массивтин элементтери: ");
        for (int a: massiv) {
            System.out.print(a + " ");
        }
    }

}
