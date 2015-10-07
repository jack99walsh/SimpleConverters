import javax.swing.*;
//Must import javax.swing.* in order to use the JOptions
public class distanceConverters {

    public static void main (String[] args){

        //JComboBoxes and an JOptionPane for gathering data from user
        String measurementScaleFrom = JOptionPane.showInputDialog("What are you converting from?");
        String measurementIn = JOptionPane.showInputDialog("What is the distance?");
        String measurementScaleTo = JOptionPane.showInputDialog("What are you converting to?");

        double measurement = Double.parseDouble(measurementIn); //Parsed the measurement to be used in future variables as a double

        final double inchToCentimeter = measurement * 2.54;
        final double inchToFoot = measurement / 12;				//From inches conversions
        final double inchToYard = measurement / 36;

        final double footToInch = measurement * 12;
        final double footToYard = measurement / 3;
        final double footToMile = measurement / 5280;				//From feet conversions
        final double footToMeter = measurement / 0.3048;
        final double footToKilometer = measurement / 0.0003048;

        final double yardToFoot = measurement / 3;
        final double yardToInch = measurement / 36;				//From yards conversions
        final double yardToMeter = measurement * .9144;

        final double millimeterToInch = measurement * 0.03937;	//From millimeters conversions

        final double centimeterToMillimeter = measurement * 10;
        final double centimeterToInch = measurement * 0.3937;		//From centimeters conversions
        final double centimeterToMeter = measurement / 100;
        final double centimeterToKilometer = measurement / 100000;

        final double meterToMillimeter = measurement * 1000;
        final double meterToCentimeter = measurement * 100;
        final double meterToKilometer = measurement / 1000;		//From meter Conversions
        final double meterToFoot = measurement * 3.28084;
        final double meterToYard = measurement * 1.0936;
        final double kilometerToCentimeter = measurement * 100000;
        final double kilometerToMeter = measurement * 1000;
        final double kilometerToMile = measurement * .6214;		//From kilometers conversions
        final double kilometerToFoot = measurement * 3280.84;

        final double mileToKilometer = measurement * 1.60934;
        final double mileToYard = measurement * 1760;				//From Miles Conversions
        final double mileToFoot = measurement * 5280;

		/*Everything below is used for the output. It takes the Input Data and allows it to be output as the correct conversion.
		This all hinges on the converting variables above, as well as the inputs from the JOptionPanes. Do not alter unless needed.*/
        if (measurementScaleFrom.equals("in") && measurementScaleTo.equals("cm"))
        {
            JOptionPane.showMessageDialog(null, "Your measurement in centimeters is " + inchToCentimeter);
        }
        else if (measurementScaleFrom.equals("in") && measurementScaleTo.equals("ft"))
        {
            JOptionPane.showMessageDialog(null, "Your measurement in feet is " + inchToFoot);
        }
        else if (measurementScaleFrom.equals("in") && measurementScaleTo.equals("yd"))
        {
            JOptionPane.showMessageDialog(null, "Your measurement in yards is " + inchToYard);
        }
        else if (measurementScaleFrom.equals("ft") && measurementScaleTo.equals("in"))
        {
            JOptionPane.showMessageDialog(null, "Your measurement in inches is " + footToInch);
        }
        else if (measurementScaleFrom.equals("ft") && measurementScaleTo.equals("m"))
        {
            JOptionPane.showMessageDialog(null, "Your measurement in meters is " + footToMeter);
        }
        else if (measurementScaleFrom.equals("ft") && measurementScaleTo.equals("yd"))
        {
            JOptionPane.showMessageDialog(null, "Your measurement in yards is " + footToYard);
        }
        else if (measurementScaleFrom.equals("ft") && measurementScaleTo.equals("mi"))
        {
            JOptionPane.showMessageDialog(null, "Your measurement in miles is " + footToMile);
        }
        else if (measurementScaleFrom.equals("ft") && measurementScaleTo.equals("km"))
        {
            JOptionPane.showMessageDialog(null, "Your measurement in kilometers is " + footToKilometer);
        }
        else if (measurementScaleFrom.equals("yd") && measurementScaleTo.equals("in"))
        {
            JOptionPane.showMessageDialog(null, "Your measurement in inches is " + yardToInch);
        }
        else if (measurementScaleFrom.equals("yd") && measurementScaleTo.equals("ft"))
        {
            JOptionPane.showMessageDialog(null, "Your measurement in feet is " + yardToFoot);
        }
        else if (measurementScaleFrom.equals("yd") && measurementScaleTo.equals("m"))
        {
            JOptionPane.showMessageDialog(null, "Your measurement in meters is " + yardToMeter);
        }
        else if (measurementScaleFrom.equals("mm") && measurementScaleTo.equals("in"))
        {
            JOptionPane.showMessageDialog(null, "Your measurement in inches is " + millimeterToInch);
        }
        else if (measurementScaleFrom.equals("cm") && measurementScaleTo.equals("mm"))
        {
            JOptionPane.showMessageDialog(null, "Your measurement in millimeters is " + centimeterToMillimeter);
        }
        else if (measurementScaleFrom.equals("cm") && measurementScaleTo.equals("in"))
        {
            JOptionPane.showMessageDialog(null, "Your measurement in inches is " + centimeterToInch);
        }
        else if (measurementScaleFrom.equals("cm") && measurementScaleTo.equals("m"))
        {
            JOptionPane.showMessageDialog(null, "Your measurement in meters is " + centimeterToMeter);
        }
        else if (measurementScaleFrom.equals("cm") && measurementScaleTo.equals("km"))
        {
            JOptionPane.showMessageDialog(null, "Your measurement in kilometers is " + centimeterToKilometer);
        }
        else if (measurementScaleFrom.equals("m") && measurementScaleTo.equals("mm"))
        {
            JOptionPane.showMessageDialog(null, "Your measurement in millimeters is " + meterToMillimeter);
        }
        else if (measurementScaleFrom.equals("m") && measurementScaleTo.equals("cm"))
        {
            JOptionPane.showMessageDialog(null, "Your measurement in centimeters is " + meterToCentimeter);
        }
        else if (measurementScaleFrom.equals("m") && measurementScaleTo.equals("km"))
        {
            JOptionPane.showMessageDialog(null, "Your measurement in kilometers is " + meterToKilometer);
        }
        else if (measurementScaleFrom.equals("m") && measurementScaleTo.equals("ft"))
        {
            JOptionPane.showMessageDialog(null, "Your measurement in feet is " + meterToFoot);
        }
        else if (measurementScaleFrom.equals("m") && measurementScaleTo.equals("yd"))
        {
            JOptionPane.showMessageDialog(null, "Your measurement in yards is " + meterToYard);
        }
        else if (measurementScaleFrom.equals("km") && measurementScaleTo.equals("cm"))
        {
            JOptionPane.showMessageDialog(null, "Your measurement in centimeters is " + kilometerToCentimeter);
        }
        else if (measurementScaleFrom.equals("km") && measurementScaleTo.equals("m"))
        {
            JOptionPane.showMessageDialog(null, "Your measurement in meters is " + kilometerToMeter);
        }
        else if (measurementScaleFrom.equals("km") && measurementScaleTo.equals("mi"))
        {
            JOptionPane.showMessageDialog(null, "Your measurement in miles is " + kilometerToMile);
        }
        else if (measurementScaleFrom.equals("km") && measurementScaleTo.equals("ft"))
        {
            JOptionPane.showMessageDialog(null, "Your measurement in feet is " + kilometerToFoot);
        }
        else if (measurementScaleFrom.equals("mi") && measurementScaleTo.equals("ft"))
        {
            JOptionPane.showMessageDialog(null, "Your measurement in feet is " + mileToFoot);
        }
        else if (measurementScaleFrom.equals("mi") && measurementScaleTo.equals("km"))
        {
            JOptionPane.showMessageDialog(null, "Your measurement in kilometers is " + mileToKilometer);
        }
        else if (measurementScaleFrom.equals("mi") && measurementScaleTo.equals("yd"))
        {
            JOptionPane.showMessageDialog(null, "Your measurement in yards is " + mileToYard);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Sorry. Either you input invalid data, or we do not support that conversion at this time.");
        }
        //This is the end of the if Statement. After this, do not put anymore conversions.
    }
}

