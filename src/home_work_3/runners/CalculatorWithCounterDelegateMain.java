package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAggregationInterface;
import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateMain {

    public static void main(String[] args) {
        CalculatorWithOperator withOperator = new CalculatorWithOperator();
        CalculatorWithCounterAutoComposite composite = new CalculatorWithCounterAutoComposite();
        CalculatorWithCounterAutoAggregationInterface aggregation = new CalculatorWithCounterAutoAggregationInterface(withOperator);
        double a = 4.1;
        double b = 15.0;
        double c = 7.0;
        double d = 28.0;
        double e = 5.0;
        int degree = 2;
        double result;

        System.out.println("Делегирование выполнения методав способом композиции:");

        result = composite.addition(a, composite.addition(composite.multiplication(b, c), composite.exponentiation(composite.division(d, e), 2)));
        System.out.println(result);
        System.out.println("Счетчик использования калькулятора: " + composite.getCountOperation());

        System.out.println("Делегирование выполнения методав способом агрегации:");

        result = aggregation.addition(a, aggregation.addition(aggregation.multiplication(b, c), aggregation.exponentiation(aggregation.division(d, e), 2)));
        System.out.println(result);
        System.out.println("Счетчик использования калькулятора: " + aggregation.getCountOperation());
    }
}
