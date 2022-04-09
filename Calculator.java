import java.util.function.*;

public class Calculator {

    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> y == 0 ? 0 : x / y;
//         При вычитании переменная b получилась равной 0
//         В результате при делении произошла ошибка в делении на 0
//         С помощью теренарного оператора в случае деление на 0 деление получается равным нулем
//         Так же есть второй вариант решения, с помощью обработки исключения
//         Решение проблемы ниже
//        try {
//            if (y == 0)
//                throw new ArithmeticException("Опасно: деление на ноль");
//            return x / y;
//        } catch (ArithmeticException e) {
//            System.out.println(e.getMessage());
//        }
//        return 0;
//    };

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;

    public Calculator() {
        System.out.println("Вычисления");
    }


}
