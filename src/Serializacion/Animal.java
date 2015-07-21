package Serializacion;

import java.io.*;

public class Animal implements Serializable{
    
    private String nombre;
    private boolean carnivoro;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isCarnivoro() {
        return carnivoro;
    }

    public void setCarnivoro(boolean carnivoro) {
        this.carnivoro = carnivoro;
    }
    
}
