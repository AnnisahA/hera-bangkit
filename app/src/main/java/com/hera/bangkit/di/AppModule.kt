package com.hera.bangkit.di

import android.content.Context
import androidx.viewbinding.BuildConfig
import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.DocumentReference
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.hera.bangkit.BaseApplication
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideApplication(@ApplicationContext app: Context): BaseApplication {
        return app as BaseApplication
    }

    @Singleton
    @Provides
    @Named("stories")
    fun provideStoryCollection(): CollectionReference =
        Firebase.firestore.collection("stories")

    @Singleton
    @Provides
    @Named("report")
    fun provideReportCollection(): CollectionReference =
        Firebase.firestore.collection("report")

    @Singleton
    @Provides
    @Named("users")
    fun provideUserCollection(): CollectionReference =
        Firebase.firestore.collection("users")
}