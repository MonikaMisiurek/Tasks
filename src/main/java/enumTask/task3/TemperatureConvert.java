package enumTask.task3;

public enum TemperatureConvert {
    C_F ('C', 'F', new Converter(){

        @Override
        public float convert(float tempIn) {
            return (tempIn * 9/5 )+ 32;
        }
    }),
    C_K('C', 'K', new Converter() {
        @Override
        public float convert(float tempIn) {
            return (float) (tempIn + 273.15);
        }
    }),
    K_C('K', 'C', new Converter() {
        @Override
        public float convert(float tempIn) {
            return (float) (tempIn-273.15);
        }
    }),
    F_C('F', 'C', new Converter() {
        @Override
        public float convert(float tempIn) {
            return ((tempIn-32) * 5/9);
        }
    }),
    F_K('F', 'K', new Converter() {
        @Override
        public float convert(float tempIn) {
            return (float) ((tempIn +459.67)*(5/9));
        }
    }),
    K_F('K', 'F', new Converter() {
        @Override
        public float convert(float tempIn) {
            return (float) (tempIn * (5/9) -459.67);
        }
    });

    private char input;
    private char output;
    private Converter converter;

    TemperatureConvert(char input, char output, Converter converter) {
        this.input = input;
        this.output = output;
        this.converter = converter;
    }
    public static float convertTemperature(char input, char output, float temp){
        for (TemperatureConvert temperatureConvert : values()){
            if (temperatureConvert.input ==input &&
                    temperatureConvert.output == output){
                return temperatureConvert.converter.convert(temp);
            }
        }
        return Integer.MIN_VALUE;
    }



}
