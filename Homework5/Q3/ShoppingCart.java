import java.util.ArrayList;
import java.util.List;

public class ShoppingCart{
    private List<Item> items;
    private int sum;
    public ShoppingCart(){
        this.items = new ArrayList<Item>();
    }

    public void addItem(Item item){
        sum = sum + item.getPrice();
        items.add(item);
    }

    public void removeItem(Item item){
        sum = sum - item.getPrice();
        items.remove(item);
    }

    public int calculateTotal(){
        return sum;
    }

    public void pay(PaymentStrategy paybythis){
        sum = calculateTotal();
        paybythis.pay(sum);
    }
}
