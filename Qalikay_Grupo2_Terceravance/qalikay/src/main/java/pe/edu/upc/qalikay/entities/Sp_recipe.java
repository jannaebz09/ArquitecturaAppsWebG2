package pe.edu.upc.qalikay.entities;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Sp_recipe")
public class Sp_recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSpecialRecipe;

    @Column(name = "description", nullable = false, length = 100)
    private String description;


    public Sp_recipe(){

    }

    public Sp_recipe(int idSpecialRecipe, String description) {
        this.idSpecialRecipe = idSpecialRecipe;
        this.description = description;
    }

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

