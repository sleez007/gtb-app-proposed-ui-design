package ng.novacore.bank.di

import android.content.Context
import androidx.room.Room
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import ng.novacore.bank.db.BankDB
import ng.novacore.bank.repository.AppRepository
import ng.novacore.bank.repository.AppRepositoryImpl
import ng.novacore.bank.repository.localSource.LocalSource
import ng.novacore.bank.repository.localSource.LocalSourceImpl
import javax.inject.Singleton

@InstallIn(ApplicationComponent::class)
@Module
object AppModule {
    @Singleton
    @Provides
    fun provideIoDispatcher() = Dispatchers.IO

    @Singleton
    @Provides
    fun provideDataBase(@ApplicationContext context: Context): BankDB {
        return Room.databaseBuilder(context.applicationContext, BankDB::class.java,"bank_db.db").build()
    }
}

@InstallIn(ApplicationComponent::class)
@Module
abstract class AppModuleBinds{
    @Singleton
    @Binds
    abstract fun bindRepository(appRepositoryImpl: AppRepositoryImpl): AppRepository

    @Binds
    abstract fun bindLocalDataSource(localDsImpl : LocalSourceImpl): LocalSource

}