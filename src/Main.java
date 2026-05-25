import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        PaymentProcessor processor = new PaymentProcessor();


//            Order order1 = new Order(1, 500, "USD");
//            Order order2 = new Order(2, 100, "RUB");
//            Order order3 = new Order(3, 5000, "EUR");

        List<Order> orders = Arrays.asList(
                new Order(1, 500, "USD"),
                new Order(2, 100, "RUB"),
                new Order(3, 5000, "EUR")
        );
        for(Order order: orders){
            try {
                processor.process(order);
            }
            catch(PaymentFailedException e ){
                System.out.println("Ошибка платежа заказа #" + order.getId()+" "+ e.getMessage());


            }
            catch (InvalidOrderException e){
                System.out.println("Ошибка валидации заказа #" + order.getId()+" "+ e.getMessage());


            }

        }
//        //1 заказ
//        try {
//            processor.process(order1);
//        }
//
//        catch(PaymentFailedException e ){
//            System.out.println("Ошибка платежа заказа #" + order1.getId());
//            System.out.println(e.getMessage());
//
//        }
//        catch (InvalidOrderException e){
//            System.out.println("Ошибка валидации заказа #" + order1.getId());
//            System.out.println(e.getMessage());
//
//        }
//        //2 заказ
//        try {
//            processor.process(order2);
//        }
//        catch(PaymentFailedException e ){
//            System.out.println("Ошибка валидации заказа #" + order2.getId());
//            System.out.println(e.getMessage());
//
//        }
//        catch (InvalidOrderException e){
//            System.out.println("Ошибка платежа заказа #" + order2.getId());
//            System.out.println(e.getMessage());
//
//        }
//        //3 заказ
//        try {
//            processor.process(order3);
//        }
//        catch(PaymentFailedException e ){
//            System.out.println("Ошибка валидации заказа #" + order3.getId());
//            System.out.println(e.getMessage());
//
//        }
//        catch (InvalidOrderException e){
//            System.out.println("Ошибка платежа заказа #" + order3.getId());
//            System.out.println(e.getMessage());
//
//        }

    }


//    Классы
//1. Order
//
//    Простой класс с полями(POJO):
//
//    id
//            amount
//    currency
//2. PaymentProcessor
//
//    Класс с одним основным методом:
//
//    Метод:
//
//    process(Order order)
//
//    Что он делает:
//
//    Проверяет:
//    сумма (amount) > 0
//    валюта — только "USD" или "EUR"
//    Если сумма больше 10000 → ошибка
//    В остальных случаях → "Оплата прошла успешно"
//    3. Исключения
//
//    Сделай всего 2 исключения:
//
//    InvalidOrderException (если:
//            сумма ≤ 0
//            неправильная валюта)
//    PaymentFailedException (если:
//            сумма слишком большая)
//4. Main
//
//    В main создай несколько заказов:
//
//    Успешный заказ
//    Неправильная валюта
//    Слишком большая сумма
//
//    Для каждого:
//
//    оберни в try-catch
//    выведи сообщение об ошибке
}
