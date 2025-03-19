package bukiet.physics;

import javax.swing.*;

public class PhysicsController {
    private final JSlider angleSlider;
    private final  JTextField magnitudeField;
    private final JTextField timeField;
    private final JLabel resultLabel;

    public PhysicsController(JSlider angleSlider, JTextField magnitudeField, JTextField timeField, JLabel resultLabel) {
        this.angleSlider = angleSlider;
        this.magnitudeField = magnitudeField;
        this.timeField = timeField;
        this.resultLabel = resultLabel;
    }

public void calculate(){
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

    resultLabel.setText(("(" + formatX + "," + formatY + ")"));
}

}
