package task17;

public enum ConversionType {

    METERS_TO_YARDS(in -> in * Ratio.M_YD_RATIO),
    YARDS_TO_METERS(in -> in / Ratio.M_YD_RATIO),
    CENTIMETERS_TO_INCHES(in -> in * Ratio.CM_IN_RATIO),
    INCHES_TO_CENTIMETERS(in -> in / Ratio.CM_IN_RATIO),
    KILOMETERS_TO_MILES(in -> in * Ratio.KM_MI_RATIO),
    MILES_TO_KILOMETERS(in -> in / Ratio.KM_MI_RATIO),
    ;

    private final Converter method;

    ConversionType(Converter method) {
        this.method = method;
    }

    public double apply(double in) {
        return method.apply(in);
    }

    private interface Converter {
        double apply(double in);
    }

    private static class Ratio {
        protected static final double M_YD_RATIO = 1.0936133;
        protected static final double CM_IN_RATIO = 0.393701;
        protected static final double KM_MI_RATIO = 0.62137119;
    }
}

