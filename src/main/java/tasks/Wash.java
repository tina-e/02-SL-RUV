package tasks;

import com.badlogic.gdx.ai.btree.LeafTask;
import com.badlogic.gdx.ai.btree.Task;
import ingredient.Ingredient;

public class Wash <Recipe> extends LeafTask<Recipe> {
    private Ingredient ingredient;
    public Wash(Ingredient ingredient){
        this.ingredient = ingredient;
    }

    @Override
    public Status execute() {
        ingredient.transform("washed", true);
        System.out.println(ingredient.getName() + " got washed");
        return Status.SUCCEEDED;
    }

    @Override
    protected Task<Recipe> copyTo(Task<Recipe> task) {
        return null;
    }
}
