package org.example;
import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Camera> camere;

    public Hotel(int numCamere) {
        camere = new ArrayList<>();
        for (int i = 0; i < numCamere; i++) {
            camere.add(new Camera(i + 1));
        }
    }

    public Camera prenotaCamera() {
        for (Camera camera : camere) {
            if (!camera.isPrenotata()) {
                camera.prenota(null); // Inizialmente nessun cliente prenota la camera
                return camera;
            }
        }
        return null; // Nessuna camera disponibile
    }

    // Altri metodi per gestire le prenotazioni dell'hotel
}
