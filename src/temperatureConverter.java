import javax.swing.*;

public class temperatureConverter {

    public static void main(String[] args) {

        String temperatureScaleFrom = JOptionPane.showInputDialog("Enter the temperature scale's first letter (make sure to capitalize).");
        String temperatureScaleTo = JOptionPane.showInputDialog("Enter the first letter of the scale you would like to convert to (make sure to capitalize).");
        String temperatureIn = JOptionPane.showInputDialog("What is the temperature? ");

        double temperature = Double.parseDouble (temperatureIn);

        final double celsiusToFahrenheitConvert = temperature * 1.8 + 32;
        final double celsiusToKelvinConvert = temperature + 273.15;

        final double kelvinToCelsiusConvert = temperature - 273.15;
        final double kelvinToFahrenheitConvert = (temperature - 273.15) * 1.8 + 32;

        final double fahrenheitToCelsiusConvert = (temperature -32) * 5 / 9;
        final double fahrenheitToKelvinConvert = (temperature - 32) * 5 / 9 + 273.15;

        if (temperatureScaleFrom.equals("F") && temperatureScaleTo.equals("C"))
        {
            JOptionPane.showMessageDialog(null, "Your temperature in Celsius is " + fahrenheitToCelsiusConvert);
        }
        else if (temperatureScaleFrom.equals("F") && temperatureScaleTo.equals("K"))
        {
            JOptionPane.showMessageDialog(null, "Your temperature in Kelvin is " + fahrenheitToKelvinConvert);
        }
        else if (temperatureScaleFrom.equals("C") && temperatureScaleTo.equals("F"))
        {
            JOptionPane.showMessageDialog(null, "Your temperature in Fahrenheit is " + celsiusToFahrenheitConvert);
        }
        else if (temperatureScaleFrom.equals("C") && temperatureScaleTo.equals("K"))
        {
            JOptionPane.showMessageDialog(null, "Your temperature in Celsius " + celsiusToKelvinConvert);
        }
        else if (temperatureScaleFrom.equals("K") && temperatureScaleTo.equals("F"))
        {
            JOptionPane.showMessageDialog(null, "Your temperature in Fahrenheit is " + kelvinToFahrenheitConvert);
        }
        else if (temperatureScaleFrom.equals("K") && temperatureScaleTo.equals("C"))
        {
            JOptionPane.showMessageDialog(null, "Your temperature in Celsius is " + kelvinToCelsiusConvert);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please enter a valid inputs.");
        }
        System.exit(0);
    }
}