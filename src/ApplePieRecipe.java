import java.util.ArrayList;

public class ApplePieRecipe {
    ArrayList<Ingredient> ingredientList = new ArrayList<>();

    Ingredient butter = new Ingredient(200, "gram", "ongezouten roomboter");
    Ingredient casterSugar = new Ingredient(200, "gram", "witte bastard suiker");
    Ingredient flour = new Ingredient(400, "gram", "zelfrijzend bakmeel");
    Ingredient egg = new Ingredient(1, "stuk(s)", "ei");
    Ingredient vanillaSugar = new Ingredient(8, "gram", "vanillesuiker");
    Ingredient salt = new Ingredient(1, "snuf", "zout");
    Ingredient apple = new Ingredient(1.5, "kilo", "zoetzure appels");
    Ingredient sugar = new Ingredient(75, "gram", "kristal suiker");
    Ingredient cinnamon = new Ingredient(3, "theelepels", "kaneel");
    Ingredient breadcrumbs = new Ingredient(15, "gram", "paneermeel");


    public void heatOven() {
        System.out.println("Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte).");
    }
    public void whiskEgg() {
        System.out.println("Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.");
    }
    public void mixIngredients() {
        System.out.println("Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
    }
    public void peelApples() {
        System.out.println("Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
    }
    public void greasePieDish() {
        System.out.println("Vet de springvorm in en bestrooi deze met bloem.");
    }
    public void coverPieDish() {
        System.out.println("Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
    }
    public void addApples() {
        System.out.println("Doe de heft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.");
    }
    public void cutDough() {
        System.out.println("Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
    }
    public void finishPie() {
        System.out.println("Leg de stroken kruislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken.");
    }
    public void bakePie() {
        System.out.println("Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.");
    }

    public void printIngredients(ArrayList<Ingredient> ingredients) {
        for (Ingredient ingredient : ingredients
             ) {
            System.out.println(ingredient.getAmount() + " " + ingredient.getUnit() + " " + ingredient.getName());
        }

    }


    public void addIngredient() {
        ingredientList.add(butter);
        ingredientList.add(casterSugar);
        ingredientList.add(flour);
        ingredientList.add(egg);
        ingredientList.add(vanillaSugar);
        ingredientList.add(salt);
        ingredientList.add(apple);
        ingredientList.add(sugar);
        ingredientList.add(cinnamon);
        ingredientList.add(breadcrumbs);
    }


}
