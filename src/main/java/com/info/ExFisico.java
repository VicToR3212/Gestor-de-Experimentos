package com.info;

public class ExFisico extends Experimentos{
    private  String meDior;
//cinstructor
    public ExFisico(
                    String NOmbreExperimento,
                    double minutos,
                    boolean resultado,
                    String meDior) {
        super(NOmbreExperimento, minutos, resultado);
        this.meDior = meDior;
    }
//metodos get and set

    public String getMeDior() {
        return meDior;
    }

    public void setMeDior(String meDior) {
        this.meDior = meDior;
    }
}
