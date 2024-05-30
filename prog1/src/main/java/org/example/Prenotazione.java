package org.example;


class Prenotazione {
    private Cliente cliente;
    private Camera camera;

    public Prenotazione(Cliente cliente, Camera camera) {
        this.cliente = cliente;
        this.camera = camera;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Camera getCamera() {
        return camera;
    }
}