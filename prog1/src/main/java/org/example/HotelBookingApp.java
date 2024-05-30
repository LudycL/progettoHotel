package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HotelBookingApp extends JFrame {

    private Hotel hotel;
    private JLabel statusLabel;

    public HotelBookingApp() {
        super("Gestione Prenotazioni Hotel");
        hotel = new Hotel(10);

        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.insets = new Insets(5, 5, 5, 5);

        JLabel titleLabel = new JLabel("Benvenuto!");
        panel.add(titleLabel, constraints);

        JButton prenotaButton = new JButton("Prenota Camera");
        prenotaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prenotaCamera();
            }
        });
        constraints.gridy = 1;
        panel.add(prenotaButton, constraints);

        statusLabel = new JLabel();
        constraints.gridy = 2;
        panel.add(statusLabel, constraints);

        add(panel);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void prenotaCamera() {
        Camera cameraPrenotata = hotel.prenotaCamera();
        if (cameraPrenotata != null) {
            statusLabel.setText("Camera " + cameraPrenotata.getNumero() + " prenotata con successo!");
        } else {
            statusLabel.setText("Nessuna camera disponibile per la prenotazione.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new HotelBookingApp();
            }
        });
    }
}