public class conversionsForDistance {

    public void conversions(double measurement)
    {
        double inchToCentimeter = measurement * 2.54;
        double inchToFoot = measurement * 12;				//From inches conversions
        double inchToYard = measurement * 36;

        double footToInch = measurement * 12;
        double footToYard = measurement / 3;
        double footToMile = measurement / 5280;				//From feet conversions
        double footToMeter = measurement / 0.3048;
        double footToKilometer = measurement / 0.0003048;

        double yardToFoot = measurement / 3;
        double yardToInch = measurement / 36;				//From yards conversions
        double yardToMeter = measurement * .9144;

        double millimeterToInch = measurement * 0.03937;	//From millimeters conversions

        double centimeterToMillimeter = measurement * 10;
        double centimeterToInch = measurement * 0.3937;		//From centimeters conversions
        double centimeterToMeter = measurement / 100;
        double centimeterToKilometer = measurement / 100000;

        double meterToMillimeter = measurement * 1000;
        double meterToCentimeter = measurement * 100;
        double meterToKilometer = measurement / 1000;		//From meter Conversions
        double meterToFoot = measurement * 3.28084;
        double meterToYard = measurement * 1.0936;

        double kilometerToCentimeter = measurement * 100000;
        double kilometerToMeter = measurement * 1000;
        double kilometerToMile = measurement * .6214;		//From kilometers conversions
        double kilometerToFoot = measurement * 3280.84;

        double mileToKilometer = measurement * 1.60934;
        double mileToYard = measurement * 1760;				//From Miles Conversions
        double mileToFoot = measurement * 5280;
    }
}
