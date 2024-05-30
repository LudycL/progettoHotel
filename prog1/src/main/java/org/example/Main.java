package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Esempio di utilizzo delle classi
        Hotel hotel = new Hotel(10); // Creiamo un hotel con 10 camere

        Cliente cliente1 = new Cliente("Mario", "Rossi", "mario@email.com");
        Cliente cliente2 = new Cliente("Luigi", "Verdi", "luigi@email.com");

        Camera cameraPrenotata = hotel.prenotaCamera();
        if (cameraPrenotata != null) {
            cameraPrenotata.prenota(cliente1);
            System.out.println("Camera " + cameraPrenotata.getNumero() + " prenotata da " + cliente1.getNome() + " " + cliente1.getCognome());
        } else {
            System.out.println("Nessuna camera disponibile per la prenotazione.");
        }

        Camera altraCameraPrenotata = hotel.prenotaCamera();
        if (altraCameraPrenotata != null) {
            altraCameraPrenotata.prenota(cliente2);
            System.out.println("Camera " + altraCameraPrenotata.getNumero() + " prenotata da " + cliente2.getNome() + " " + cliente2.getCognome());
        } else {
            System.out.println("Nessuna camera disponibile per la prenotazione.");
        }
    }
}