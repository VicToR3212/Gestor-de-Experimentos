package com.info;

public class Experimentos  {
    private String NOmbreExperimento;
    private double minutos;
    private boolean Resultado;
//constructor
    public Experimentos( String NOmbreExperimento, double minutos, boolean resultado) {

        this.NOmbreExperimento = NOmbreExperimento;
        this.minutos = minutos;
        this.Resultado = resultado;
    }
// metods get and set
    public String getNOmbreExperimento() {
        return NOmbreExperimento;
    }

    public void setNOmbreExperimento(String NOmbreExperimento) {
        this.NOmbreExperimento = NOmbreExperimento;
    }

    public double getMinutos() {
        return minutos;
    }

    public void setMinutos(double minutos) {
        this.minutos = minutos;
    }

    public boolean getisResultado() {
        return Resultado;
    }

    public void setResultado(boolean resultado) {
        Resultado = resultado;
    }
}
