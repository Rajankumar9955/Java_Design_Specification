package design.specification4;

public class car {
    private String make;
    private String model;
    private String color;
    private int year;

    public car ()
    {

    }
    public car(String make, String model,String color,int year)
    {
        this.make=make;
        this.model=model;
        this.color=color;
        this.year=year;
    }
    public String getMake()
    {
        return make;
    }
    public void setMake(String make)
    {
        this.make=make;
    }
    public String getModel()
    {
        return model;
    }
    public void setModel(String model)
    {
        this.model=model;
    }
    public String getColor()
    {
        return color;
    }
    public void setColor(String color)
    {
        this.color=color;
    }
    public int getYear()
    {
        return year;
    }
    public void setYear(int year)
    {
        this.year=year;
    }
    public String displayInfo()
    {
        return "make- "+make
                +" , model- "+
                model+" , color- "
                +color+" ,year "+year;
    }
}

