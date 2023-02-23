import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    ApplePieRecipe applePieRecipe = new ApplePieRecipe();

        applePieRecipe.printIngredients(applePieRecipe.ingredientList);

        applePieRecipe.heatOven();
        applePieRecipe.whiskEgg();
        applePieRecipe.mixIngredients();
        applePieRecipe.peelApples();
        applePieRecipe.greasePieDish();
        applePieRecipe.coverPieDish();
        applePieRecipe.addApples();
        applePieRecipe.cutDough();
        applePieRecipe.finishPie();
        applePieRecipe.bakePie();

        applePieRecipe.addIngredient();

        applePieRecipe.printIngredients(applePieRecipe.ingredientList);
    }
}