package com.ummi.recipcefinder.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.ummi.recipcefinder.models.FoodRecipe
import com.ummi.recipcefinder.util.Constanst.Companion.RECIPES_TABLE


@Entity(tableName = RECIPES_TABLE)
class RecipesEntity(
    var foodRecipe: FoodRecipe
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0
}