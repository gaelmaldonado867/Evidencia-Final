package com.evidencia.evidencia;

import java.util.Date;

public class RegistroIMC {
    private Date fehca;
    public Date getFehca() {
        return fehca;
    }
    public void setFehca(Date fehca) {
        this.fehca = fehca;
    }
    private double peso;
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    private double estatura;
    public double getEstatura() {
        return estatura;
    }
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    private double imc;
    public void setImc(double imc) {
        this.imc = imc;
    }
    public double getimc(){
        return imc;
    }
    public double calcularIMC(){
        if(estatura>0){
            return peso / (estatura * estatura);
        }else{
            return 0.0;
        }
    }
}
