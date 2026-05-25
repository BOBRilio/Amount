public class PaymentProcessor {


   public void process(Order order) throws InvalidOrderException, PaymentFailedException{
      if(order.getAmount() >1000){
            throw new PaymentFailedException("Сумма заказа не может превышать 1000 USD/EUR");

      }
      if(!order.getCurrency().equals("USD")&&!order.getCurrency().equals("EUR")){
            throw new InvalidOrderException("Валюта должна быть USD или EUR.");

      }
      if(order.getAmount() <=0){
         throw new InvalidOrderException("Сумма заказа должна быть больше нуля");

      }
      else{
         System.out.println("Оплата прошла успешно");
      }
   }





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
}
