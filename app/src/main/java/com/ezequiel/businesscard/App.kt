package com.ezequiel.businesscard

import android.app.Application
import com.ezequiel.businesscard.data.AppDatabase
import com.ezequiel.businesscard.data.BusinessCardRepository

class App : Application() {
    val database by lazy {AppDatabase.getDatabase(this)}
    val repository by lazy {BusinessCardRepository(database.businessDao())}
}