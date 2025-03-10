package Models; // Declares the package where this class resides.

public class Sofa // Declares a public class named Sofa.
{

    private String sofaID; // Declares a private String variable to store the sofa ID.
    private String category; // Declares a private String variable to store the sofa category.
    private String sofaName; // Declares a private String variable to store the sofa name.
    private String color; // Declares a private String variable to store the sofa color.
    private double price; // Declares a private double variable to store the sofa price.

    public Sofa() // Declares a public default constructor for the Sofa class.
    {
    }

    public Sofa(String sofaID, String category, String sofaName, String color, double price) // Declares a public parameterized constructor.
    {
        this.sofaID = sofaID; // Initializes the sofaID instance variable with the provided value.
        this.category = category; // Initializes the category instance variable with the provided value.
        this.sofaName = sofaName; // Initializes the sofaName instance variable with the provided value.
        this.color = color; // Initializes the color instance variable with the provided value.
        this.price = price; // Initializes the price instance variable with the provided value.
    }

    public double getPrice() // Declares a public getter method for the price instance variable.
    {
        return price; // Returns the value of the price instance variable.
    }

    public void setPrice(double price) // Declares a public setter method for the price instance variable.
    {
        this.price = price; // Sets the value of the price instance variable to the provided value.
    }

    public String getSofaID() // Declares a public getter method for the sofaID instance variable.
    {
        return sofaID; // Returns the value of the sofaID instance variable.
    }

    public void setSofaID(String sofaID) // Declares a public setter method for the sofaID instance variable.
    {
        this.sofaID = sofaID; // Sets the value of the sofaID instance variable to the provided value.
    }

    public String getCategory() // Declares a public getter method for the category instance variable.
    {
        return category; // Returns the value of the category instance variable.
    }

    public void setCategory(String category) // Declares a public setter method for the category instance variable.
    {
        this.category = category; // Sets the value of the category instance variable to the provided value.
    }

    public String getSofaName() // Declares a public getter method for the sofaName instance variable.
    {
        return sofaName; // Returns the value of the sofaName instance variable.
    }

    public void setSofaName(String sofaName) // Declares a public setter method for the sofaName instance variable.
    {
        this.sofaName = sofaName; // Sets the value of the sofaName instance variable to the provided value.
    }

    public String getColor() // Declares a public getter method for the color instance variable.
    {
        return color; // Returns the value of the color instance variable.
    }

    public void setColor(String color) // Declares a public setter method for the color instance variable.
    {
        this.color = color; // Sets the value of the color instance variable to the provided value.
    }
}
