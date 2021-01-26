package com.ummi.recipcefinder.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import  com.ummi.recipcefinder.models.Result
import com.ummi.recipcefinder.util.Constanst.Companion.FAVORITE_RECIPES_TABLE

@Entity(tableName = FAVORITE_RECIPES_TABLE)
class FavoriteEntity(
    //primary key dapat diartikan sebagai kolom yang berisi nilai unik,
    //berfungsi sebagai identitas untuk membedakan setiap record yang ada pada tabel.
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var result: Result
)