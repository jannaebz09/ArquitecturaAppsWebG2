package pe.edu.upc.qalikay.dtos;

public class Sp_recipeDTO {
    private int idSpecialRecipe;

    private String description;

    public int getIdSpecialRecipe() {
        return idSpecialRecipe;
    }

    public void setIdSpecialRecipe(int idSpecialRecipe) {
        this.idSpecialRecipe = idSpecialRecipe;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
