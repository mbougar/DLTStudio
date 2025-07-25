package com.alekso.dltstudio.db.preferences

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

@Dao
interface PreferencesDao {
    /**
     * Stores search item in history
     * 1. Removes old record because we insert new one with new id to keep order
     * 2. Insert new record with new id
     * 3. Ensure MAX_SEARCH_SUGGESTIONS capacity
     */
    suspend fun addNewSearch(item: SearchEntity) {
        removeSearch(item.value)
        addSearch(item)
        ensureSearchCapacity()
    }

    @Upsert
    suspend fun addSearch(item: SearchEntity)

    @Query("SELECT * FROM SearchEntity ORDER BY id DESC LIMIT $MAX_SEARCH_SUGGESTIONS")
    fun getRecentSearchFlow(): Flow<List<SearchEntity>>

    @Query("DELETE FROM SearchEntity WHERE id NOT IN (SELECT id FROM SearchEntity ORDER BY id DESC LIMIT $MAX_SEARCH_SUGGESTIONS)")
    suspend fun ensureSearchCapacity()

    @Query("DELETE FROM SearchEntity WHERE value = :value")
    suspend fun removeSearch(value: String)


    suspend fun addNewRecentColorFilter(item: RecentColorFilterFileEntry) {
        removeRecentColorFilter(item.fileName)
        addRecentColorFilter(item)
        ensureRecentColorFilterCapacity()
    }

    @Upsert
    suspend fun addRecentColorFilter(item: RecentColorFilterFileEntry)

    @Query("SELECT * FROM RecentColorFilterFileEntry LIMIT $MAX_RECENT_COLOR_FILTERS")
    fun getRecentColorFilterFlow(): Flow<List<RecentColorFilterFileEntry>>

    @Query("DELETE FROM RecentColorFilterFileEntry WHERE id NOT IN (SELECT id FROM RecentColorFilterFileEntry ORDER BY id DESC LIMIT $MAX_RECENT_COLOR_FILTERS)")
    suspend fun ensureRecentColorFilterCapacity()

    @Query("DELETE FROM RecentColorFilterFileEntry WHERE fileName = :value")
    suspend fun removeRecentColorFilter(value: String)

    @Upsert
    suspend fun updateColumnParams(item: ColumnParamsEntity)

    @Query("SELECT * FROM ColumnParamsEntity")
    fun getColumnsParamsFlow(): Flow<List<ColumnParamsEntity>>

    @Query("DELETE FROM ColumnParamsEntity")
    suspend fun removeColumnsParams()

    companion object {
        const val MAX_SEARCH_SUGGESTIONS = 100
        const val MAX_RECENT_COLOR_FILTERS = 10
    }
}