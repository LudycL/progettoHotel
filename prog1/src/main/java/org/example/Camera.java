package org.example;
import java.util.ArrayList;
import java.util.List;

class Camera {
    private int numero;
    private boolean prenotata;
    private Cliente cliente;

    public Camera(int numero) {
        this.numero = numero;
        this.prenotata = false;
        this.cliente = null;
    }

    public int getNumero() {
        return numero;
    }

    public boolean isPrenotata() {
        return prenotata;
    }

    public void prenota(Cliente cliente) {
        this.cliente = cliente;
        this.prenotata = true;
    }

    public void libera() {
        this.cliente = null;
        this.prenotata = false;
    }

    public Cliente getCliente() {
        return cliente;
    }
}