import javax.swing.*;

public class Lab205 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Input minute: ");
        int minute = Integer.parseInt(input);
        int hour = minute / 60;
        int min = minute % 60;

        JOptionPane.showMessageDialog(null,minute + " minute is " + hour + " hour " + min + " minute ");
    }
}
