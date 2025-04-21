import java.util.ArrayList;
import java.util.Arrays;

public class HeroManager
{   //Constructor initializes list of heroes
    private ArrayList<Hero> heroes = new ArrayList<>();

    //Adds hero to the list
    public void addHero (Hero hero)
    {
        heroes.add(hero);
    }

    //removes a hero by name
    public void removeHeroByName(String name)
    {
        heroes.removeIf(hero -> hero.getName().equalsIgnoreCase(name));
    }

    //sorts the list using bubble sort of power level- ascending
    public void bubbleSortByPower()
    {
        for (int i = 0; i < heroes.size() - 1; i++)
        {
            for (int j = 0; j < heroes.size() - i - 1; j++)
            {
                if (heroes.get(j).getPowerLevel() > heroes.get(j +1).getPowerLevel())
                {
                    Hero temp = heroes.get(j);
                    heroes.set(j, heroes.get(j + 1));
                    heroes.set(j + 1, temp);
                }
            }
        }
    }
    //sorts the list using insertion by power level - ascending
    public void insertionSortByPower()
    {
        for (int i = 1; i < heroes.size(); i++)
        {
            Hero key = heroes.get(i);
            int j = i - 1;
            while (j >= 0 && heroes.get(j).getPowerLevel() > key.getPowerLevel())
            {
                heroes.set(j + 1, heroes.get(j));
                j--;
            }
            heroes.set(j + 1, key);
        }
    }
    //displays all heroes using toString() method
    public void displayHeroes()
    {
        for (Hero hero : heroes)
        {
            System.out.println(hero);
        }
    }
    //displays the list of heroes ina 2D array format
    public void diasplayAs2DArray()
    {
        String[][] table = new String[heroes.size()][5];
        for (int i = 0; i < heroes.size(); i++)
        {
            table[i][0] = heroes.get(i).getName();
            table[i][1] = String.valueOf(heroes.get(i).getPowerLevel());
            table[i][2] = heroes.get(i).getAffiliation().toString();
            table[i][3] = heroes.get(i).getSuperpower();
            table[i][4] = heroes.get(i).getOriginCity();
        }
        System.out.println("\nHero List in 2D Array Format: ");
        System.out.println(Arrays.deepToString(table));
    }
    //Searchs hero by name anf displays result
    public void searchByName(String name)
    {
        System.out.println("\nSearching for hero: " + name);
        boolean found = false;
        for (Hero h : heroes)
        {
            if (h.getName().equalsIgnoreCase(name))
            {
                System.out.println("Found: " + h);
                found = true;
            }
        }
        if (!found)
        {
            System.out.println("Hero not found.");
        }
    }
    //searches for all heroes that belong to a specific team 
    public void searchByAffiliation(Affiliation affiliation)
    {
        System.out.println("\nHeroes in " + affiliation + ":");
        boolean found = false;
        for (Hero h : heroes)
        {
            if (h.getAffiliation() == affiliation)
            {
                System.out.println(h);
                found = true;
            }
        }
        if (!found)
        {
            System.out.println("No heroes found in this team.");
        }    
    }

}