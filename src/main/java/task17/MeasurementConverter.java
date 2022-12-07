package task17;

public class MeasurementConverter {

    public double convert(double in, ConversionType conversionType) {
        return conversionType.apply(in);
    }
}
