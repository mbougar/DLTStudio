package com.alekso.dltstudio.db.settings

import com.alekso.dltstudio.db.AppDatabase
import com.alekso.logger.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.Flow

interface SettingsRepository {
    suspend fun updateSettingsUI(item: SettingsUIEntity)
    fun getSettingsUIFlow(): Flow<SettingsUIEntity?>

    suspend fun updateSettingsLogs(item: SettingsLogsEntity)
    fun getSettingsLogsFlow(): Flow<SettingsLogsEntity?>

    suspend fun updatePluginState(item: PluginStateEntity)
    fun getPluginsStatesFlow(): Flow<List<PluginStateEntity>>
}

class SettingsRepositoryImpl(
    private val database: AppDatabase,
    private val scope: CoroutineScope
) : SettingsRepository {

    override suspend fun updateSettingsUI(item: SettingsUIEntity) {
        Log.d("updateSettingUI($item)")
        database.getSettingsDao().updateSettingsUI(item)
    }

    override fun getSettingsUIFlow(): Flow<SettingsUIEntity?> {
        return database.getSettingsDao().getSettingsUIFlow()
    }

    override suspend fun updateSettingsLogs(item: SettingsLogsEntity) {
        Log.d("updateSettingsLogs($item)")
        database.getSettingsDao().updateSettingsLogs(item)
    }

    override fun getSettingsLogsFlow(): Flow<SettingsLogsEntity?> {
        return database.getSettingsDao().getSettingsLogsFlow()
    }

    override suspend fun updatePluginState(item: PluginStateEntity) {
        Log.d("updatePluginState($item)")
        database.getSettingsDao().updateSettingsPlugins(item)
    }

    override fun getPluginsStatesFlow(): Flow<List<PluginStateEntity>> {
        return database.getSettingsDao().getPluginsStatesFlow()
    }
}