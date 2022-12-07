package task17;

public class Client17 {
    public static void main(String[] args) {

        MeasurementConverter converter = new MeasurementConverter();

        System.out.println("5 CM na IN");
        System.out.println(converter.convert(5, ConversionType.CENTIMETERS_TO_INCHES));

        System.out.println("5 IN na CM");
        System.out.println(converter.convert(5, ConversionType.INCHES_TO_CENTIMETERS));

        System.out.println("5 KM na MI");
        System.out.println(converter.convert(5, ConversionType.KILOMETERS_TO_MILES));

        System.out.println("5 MI na KM");
        System.out.println(converter.convert(5, ConversionType.MILES_TO_KILOMETERS));

        System.out.println("5 YD na M");
        System.out.println(converter.convert(5, ConversionType.YARDS_TO_METERS));

        System.out.println("5 M na YD");
        System.out.println(converter.convert(5, ConversionType.METERS_TO_YARDS));
    }
}
