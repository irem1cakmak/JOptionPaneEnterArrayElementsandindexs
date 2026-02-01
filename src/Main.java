import javax.swing.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String index = JOptionPane.showInputDialog("Please enter the array index: ");
        int i = Integer.valueOf(index);
        int array[] = new int[i];


        for (int j = 0; j < array.length; j++) {
            String elements = JOptionPane.showInputDialog("Please enter the array elements : ");
            int e = Integer.valueOf(elements);
            array[j] = e;


        }
        for (int j = 0; j < array.length; j++) {
            String message = "array[ " + j + " ]= " + array[j];
            JOptionPane.showMessageDialog(null, message, "RESULT: ", JOptionPane.INFORMATION_MESSAGE);

        }

    }
}