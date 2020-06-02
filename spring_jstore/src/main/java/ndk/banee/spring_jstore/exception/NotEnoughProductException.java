//package ndk.banee.spring_jstore.exception;
//
//import ndk.banee.spring_jstore.domain.product;
//
//public class NotEnoughProductException extends Throwable {
//    private static final String DEFAULT_MESSAGE = "Not enough products in stock";
//
//    public NotEnoughProductException() {
//        super(DEFAULT_MESSAGE);
//    }
//
//    public NotEnoughProductException(product product) {
//        super(String.format("Not enough %s products in stock. Only %d left", product.getName(), product.getQuantity()));
//    }
//
//}
