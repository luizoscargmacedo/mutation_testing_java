package br.luizgmacedo.service;

public class Calc {
    private int year2;
    private int year3;
    private boolean result;
    private boolean result3;

    public int getYear2() { return year2; }
    public void setYear2(int year2) { this.year2 = year2; }

    public int getYear3() { return year3; }
    public void setYear3(int year3) { this.year3 = year3; }

    public boolean getResult() { return result = year2 % 400 == 0; }
    public boolean getResult3() { return result3 = year3 % 4 == 0 && year3 % 100 != 0; }
}
