package ibu.edu.ba.labexampreparation

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@HiltAndroidApp
class LabExam: Application() {
//    @Inject
//    lateinit var database: AppDatabase

    override fun onCreate() {
        super.onCreate()

        CoroutineScope(Dispatchers.IO).launch {
            /**
             * You can test with some dummy query if you database is working properly
             */
        }
    }
}