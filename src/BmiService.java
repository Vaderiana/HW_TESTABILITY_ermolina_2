public class BmiService {
    public double calculate(double a, double b) {
        double index = b / ( a * a);
        return index;
        //ИМТ= вес (кг) / рост (м)2
    }

}
