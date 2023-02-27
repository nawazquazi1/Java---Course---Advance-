package Annotation;
// Field Level Annotations
public class Item {
    String id;
    String name;
    int cost;

    public Item(String id, String name, int cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    public void GetItemDetails() {
        System.out.println("Item Details");
        System.out.println("----------------------");
        System.out.println("Item Id :" + id);
        System.out.println("Item Name :" + name);
        System.out.println("Item Cost :" + cost);
    }

}
