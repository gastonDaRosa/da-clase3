package com.example.controlaccesos.modelo;

import java.util.ArrayList;


public class Usuario {
    private String userName;
    private String nombre;
    private String apellido;
    private boolean habilitado;
    private ArrayList<Acceso> accesos;
    
    public Usuario(String userName, String nombre, String apellido, boolean habilitado) {
        this.userName = userName;
        this.nombre = nombre;
        this.apellido = apellido;
        this.habilitado = habilitado;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public ArrayList<Acceso> getAccesos() {
        return accesos;
    }

    public void setAccesos(ArrayList<Acceso> accesos) {
        this.accesos = accesos;
    }

    public int totalTiempoAccesos(){
        int tiempoTotal = 0;
        for (Acceso acceso : accesos) {
            tiempoTotal += acceso.diffTiempoAcceso();
        }
        return tiempoTotal;
    }

    
    
}
