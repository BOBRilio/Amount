public class InvalidOrderException extends RuntimeException {
    public InvalidOrderException(String message) {
        super(message);
    }


    //    InvalidOrderException (если:
//            сумма ≤ 0
//            неправильная валюта)
}
