
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
}
