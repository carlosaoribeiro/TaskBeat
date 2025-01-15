package com.devspace.taskbeats

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface CategoryDao {
        @Insert(onConflict = OnConflictStrategy.REPLACE)
        suspend fun insertAll(categories: List<CategoryEntity>)

        @Query("SELECT * FROM CategoryEntity")
        suspend fun getAll(): List<CategoryEntity>
}