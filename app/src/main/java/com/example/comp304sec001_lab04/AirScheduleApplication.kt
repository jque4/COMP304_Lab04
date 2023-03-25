package com.example.comp304sec001_lab04

import android.app.Application
import com.example.comp304sec001_lab04.database.AppDatabase

class AirScheduleApplication : Application() {
    val database: AppDatabase by lazy { AppDatabase.getDatabase(this) }
}