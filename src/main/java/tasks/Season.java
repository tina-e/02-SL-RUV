package tasks;

import com.badlogic.gdx.ai.btree.LeafTask;
import com.badlogic.gdx.ai.btree.Task;
import ingredient.Ingredient;
import ingredient.Product;
import recipe.Recipe;

public class Season extends LeafTask<Recipe> {

    Ingredient ingredient;
    Product product;
    public Season(Ingredient ingredient, Product product) {
        this.ingredient = ingredient;
        this.product = product;
    }

    @Override
    public Status execute() {
        System.out.println("Seasoning "+ product.getName() + " with "+ ingredient.getName());
        return Status.SUCCEEDED;
    }

    @Override
    protected Task<Recipe> copyTo(Task<Recipe> task) {
        return null;
    }
}
