package bukiet.physics;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;


public class PhysicsFrame extends JFrame {


    JSlider angleSlider = new JSlider(JSlider.HORIZONTAL, 0, 90, 0);
    JTextField magnitudeField = new JTextField("Magnitude");
    JTextField timeField = new JTextField("Time");
    JLabel results = new JLabel("(x, y)");
    private final PhysicsController controller;

    public PhysicsFrame() {
        setTitle("Moving Projectile");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        controller = new PhysicsController(angleSlider,magnitudeField, timeField, results);
        setLayout(new GridLayout(4, 2));
        add(angleSlider);
        add(results);
        add(magnitudeField);
        add(new Label());
        add(timeField);
        add(new Label());


        angleSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                controller.calculate();
            }
        });

        magnitudeField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                controller.calculate();

            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                controller.calculate();

            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                controller.calculate();

            }
        });
    }


    private void calculateProjectileLocation() {
        double angle = angleSlider.getValue();
        String magnitudeText = magnitudeField.getText();
        if (magnitudeText.isEmpty() || !magnitudeText.matches("\\d+")) {
            return;
        }
        double magnitude = Double.parseDouble(magnitudeText);

        Projectile p = new Projectile(new Force(new Angle(angle), magnitude), new Location(0, 0));

        String timeText = timeField.getText();
        if (timeText.isEmpty() || !timeText.matches("\\d+")) {
            return;
        }

        for (int i = 0; i < 10; i++) {

            p.move(1);
        }

        Location location = p.getLocation();
        String formatX = String.format("%2f", location.getX());
        String formatY = String.format("%2f", location.getY());

        results.setText(("(" + formatX + "," + formatY + ")"));


    }


    public static void main(String[] args) {
        PhysicsFrame frame = new PhysicsFrame();
        frame.setVisible(true);


    }
}