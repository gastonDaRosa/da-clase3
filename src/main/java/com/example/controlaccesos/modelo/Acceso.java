package com.example.controlaccesos.modelo;

import java.util.Date;


public class Acceso {
    private Date entrada;
    private Date salida;
    
    public Acceso() {
    }

    

    public Acceso(Date entrada, Date salida) {
        this.entrada = entrada;
        this.salida = salida;
    }



    public Date getEntrada() {
        return entrada;
    }

    public void setEntrada(Date entrada) {
        this.entrada = entrada;
    }

    public Date getSalida() {
        return salida;
    }

    public void setSalida(Date salida) {
        this.salida = salida;
    }

    public int diffTiempoAcceso(){
        if(this.entrada == null || this.salida == null || salida.before(entrada)){
            return 0;
        }

        int difTiempoMiliseg = (int)(salida.getTime() - entrada.getTime()) ;

        return difTiempoMiliseg / (60*1000);
    }
    

}
