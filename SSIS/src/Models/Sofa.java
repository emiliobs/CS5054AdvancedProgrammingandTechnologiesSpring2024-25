package Models;


public class Sofa
{
   private String sofaID;
   private String category;
   private String sofaName;
   private String color;
   private double price;

    public Sofa()
    {
    }

    public Sofa(String sofaID, String category, String sofaName, String color, double price)
    {
        this.sofaID = sofaID;
        this.category = category;
        this.sofaName = sofaName;
        this.color = color;
        this.price = price;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public String getSofaID()
    {
        return sofaID;
    }

    public void setSofaID(String sofaID)
    {
        this.sofaID = sofaID;
    }

    public String getCategory()
    {
        return category;
    }

    public void setCategory(String category)
    {
        this.category = category;
    }

    public String getSofaName()
    {
        return sofaName;
    }

    public void setSofaName(String sofaName)
    {
        this.sofaName = sofaName;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }
   
   
   
}


