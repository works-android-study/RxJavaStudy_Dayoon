package com.example.rxjavastudy.di.activity

import androidx.appcompat.app.AppCompatActivity
import dagger.Module
import dagger.Provides

@Module
class ActivityModule (private val activity: AppCompatActivity) {
    @Provides
    fun activity() = activity
}
