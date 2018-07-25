package com.yaypay.util;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public class NBUCrossRate {
    private String r030;
    private String txt;
    private String cc;
    private double rate;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
    private LocalDate exchangedate;

    public String getR030() {
        return r030;
    }

    public void setR030(String r030) {
        this.r030 = r030;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public LocalDate getExchangedate() {
        return exchangedate;
    }

    public void setExchangedate(LocalDate exchangedate) {
        this.exchangedate = exchangedate;
    }

    @Override
    public String toString() {
        return "NBUCrossRate{" +
                "r030='" + r030 + '\'' +
                ", txt='" + txt + '\'' +
                ", cc='" + cc + '\'' +
                ", rate=" + rate +
                ", exchangedate=" + exchangedate +
                '}';
    }
}
