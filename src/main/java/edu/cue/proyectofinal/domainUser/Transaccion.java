package edu.cue.proyectofinal.domainUser;


import java.util.Date;

public class Transaccion {
    private Date date;
    private double amount;
    private String paymentMethod;

    // Constructor
    public Transaccion(Date date, double amount, String paymentMethod) {
        this.date = date;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    // Getters y Setters
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
