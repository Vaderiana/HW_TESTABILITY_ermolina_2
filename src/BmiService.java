public class BmiService {
    public double calculate(double inputHeight, double inputWeight) {
        double index = inputWeight / ( inputHeight * inputHeight);
        return index;
        //ИМТ= вес (кг) / рост (м)2
    }

}
