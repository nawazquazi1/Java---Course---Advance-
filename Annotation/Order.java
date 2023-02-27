package Annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

// Field Level Annotations
class Test2 {
    public static void main(String[] args) throws NoSuchFieldException {
        Item item = new Item("I-111", "Burger", 275);
        Order order = new Order("OR-101", item, "nawaz", "9460985441", "currentLocation");
        order.getOrderDetails();
        System.out.println();
        Class<?> cls = order.getClass();
        Field field = cls.getDeclaredField("item");
        Restaurant annotation = field.getAnnotation(Restaurant.class);
        System.out.println("Restaurant Details  ");
        System.out.println("--------------------------");
        System.out.println("Restaurant ID       : "+ annotation.id());
        System.out.println("Restaurant Name     : "+ annotation.name());
        System.out.println("Restaurant Phone    : "+ annotation.phone());
        System.out.println("Restaurant Website  : "+ annotation.website());


    }
}

public class Order {
    String id;
    @Restaurant(id = "ABC123", name = "BurgerKing", phone = "91+ 9460985441")
    Item item;
    String name;
    String phone;
    String location;

    public Order(String id, Item item, String name, String phone, String location) {
        this.id = id;
        this.item = item;
        this.name = name;
        this.phone = phone;
        this.location = location;
    }

    public void getOrderDetails() {
        System.out.println("Order Details");
        System.out.println("------------------");
        System.out.println("Order ID            : " + id);
        System.out.println("Customer Name       : " + name);
        System.out.println("Customer MobileNo   : " + phone);
        System.out.println("Customer Location   : " + location);
        System.out.println();
        item.GetItemDetails();
    }

}
