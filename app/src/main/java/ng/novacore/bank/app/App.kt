package ng.novacore.bank.app

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class App : Application(){

    override fun onCreate() {
        super.onCreate()
        initTimber()
        initTheme()
    }

    private fun initTimber(){
        Timber.plant(Timber.DebugTree())
    }

    private fun initTheme(){

    }
}