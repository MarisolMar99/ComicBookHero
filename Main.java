public class Main
{
    public static void main(String[] args)
    {
        //THe instance of HeroManager to manage out list of heroes
        HeroManager manager = new HeroManager();

        //The heroes and their attributes
        manager.addHero(new Hero("Iron Man", 83, Affiliation.AVENGERS, "Flying and high-tech armor", "New York"));
        manager.addHero(new Hero("Superman", 92, Affiliation.JUSTICE_LEAGUE, "X-Ray and Heat Vision", "Krypton"));
        manager.addHero(new Hero("Storm", 90, Affiliation.X_MEN, "Controls the weather","New York"));
        manager.addHero(new Hero("Invisible Woman", 80, Affiliation.FANTASTIC_FOUR, "Invisibility", "Kosovo"));

        //Output of the original hero list
        System.out.println("Original Heroes:");
        manager.displayHeroes();

        //Output heroes using bubble sort of power level
        System.out.println("\nSorted by Power Level (Bubble Sort):");
        manager.bubbleSortByPower();
        manager.displayHeroes();

        //Output heroes sorted by using Insertion Sort
        System.out.println("\nSorted by Power Level (Insertion Sort):");
        manager.insertionSortByPower();
        manager.displayHeroes();

        //Removing hero
        manager.removeHeroByName("Storm");
        System.out.println("\nAfter Removing Storm:");
        manager.displayHeroes();

        //Adding Spiderman 
        System.out.println("\nAdding Spiderman...");
        manager.addHero(new Hero("Spiderman", 88, Affiliation.AVENGERS, "Spider-sense", "New York"));
        manager.displayHeroes();

        //Search specific hero by name
        manager.searchByName("Iron Man");

        //Search heroes belonging to a specific affiliation
        manager.searchByAffiliation(Affiliation.JUSTICE_LEAGUE);

        //Output final list of heroes in a 2D array format
        manager.diasplayAs2DArray();
    }
}