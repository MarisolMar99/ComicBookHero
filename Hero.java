public class Hero
{
    //comic book hero attributes
    public String name;
    private int powerLevel;
    private Affiliation affiliation;
    private String superpower;
    private String originCity;

    //Constructor to initialize all attributes
    public Hero(String name, int powerLevel, Affiliation affiliation, String superpower, String originCity)
    {
        this.name = name; 
        this.powerLevel = powerLevel;
        this.affiliation = affiliation;
        this.superpower = superpower;
        this.originCity = originCity;
    }

    //Getter methods to access private fields
    public String getName()
    {
        return name;
    }

    public int getPowerLevel()
    {
        return powerLevel;
    }

    public Affiliation getAffiliation()
    {
        return affiliation;
    }

    public String getSuperpower()
    {
        return superpower;
    }

    public String getOriginCity()
    {
        return originCity;
    }

    //Output return the hero string
    public String toString()
    {
        return "Name: " + name + " | Power Level: " + powerLevel + " | Affiliation: " + affiliation + " | Power: " + superpower + " | Origin: " + originCity;
    }
}