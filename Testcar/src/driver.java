
public class driver
{
    private String name;
    private int age;
    private String country;
    public driver(String name, int age, String country)
    {
        this.name = name;
        this.age = age;
        this.country = country;
    }
   public driver(String name, int age)
   {
       this.name = name;
       this.age = age;
   }
    public void setCountry(String country)
    {
        this.country = country;
    }
    public String getName()
    {
        return name;
    }
    public String getCountry()
    {
        return country;
    }
    public int getAge()
    {
        return age;
    }
    public void print()
    {
        System.out.println(name +" "+ "age:" +" "+ age +" "+ "countey:" +" "+ country);
    }
    public driver()
    {

    }
}
