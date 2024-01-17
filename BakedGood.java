
/**
 * Represents a single baked good in our bakery's inventory
 *
 * @author Jessica
 * @version Jan 16 2024
 */
public class BakedGood
{
    private String name;
    private String recipe;
    private double price;
    private int quantity;

    /**
     * Constructor for objects of class BakedGood
     */
    public BakedGood(String name, String recipe, double price, int quantity)
    {
        this.name = name;
        this.recipe = recipe;
        this.price = price;
        this.quantity = quantity;
    }
    
    public void increaseQuantity(int count) {
        this.quantity += count;
    }
    
    //instance method to buy some baked goods
    // takes in an argument, count, for how many of the baked good we are purchasing
    public double purchase(int count){
        if (count > this.quantity){
            throw new IllegalArgumentException("you cannot buy more than our current inventory");
        }
        this.quantity -= count;
        return this.price*count;
    }
    
    public String toString(){
        return "baked good: " + this.name + " (" + this.quantity + " @ $" + this.price + " )";
    }
    
    public static void main(String[] args) {
        BakedGood croissant = new BakedGood("croissant", "butter, flour, laminate, yum", 20.0, 0);
        // bake a dozen croissants
        croissant.increaseQuantity(12);
        System.out.println(croissant);
        //bake 3 more croissants
        /*
        croissant.increaseQuantity(3);
        System.out.println(croissant);
        */
        //purchasing
        System.out.println(croissant.purchase(3));
        System.out.println(croissant);
        croissant.purchase(10);
        System.out.println(croissant);
    }
}
