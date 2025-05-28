package ibu.edu.ba.labexampreparation.di

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    /**
     * Provide missing annotations for database instance...
     *
     * You should uncomment the below code and start working on it...
     */
//    fun provideAppDatabase(@ApplicationContext context: Context): AppDatabase {
//        return Room.databaseBuilder(
//            context.applicationContext,
//            AppDatabase::class.java,
//            "lab_exam.db",
//        ).fallbackToDestructiveMigration(true).build()
//    }

    /**
     * Provide other functions that are gonna be used for dependency injection...
     */
}