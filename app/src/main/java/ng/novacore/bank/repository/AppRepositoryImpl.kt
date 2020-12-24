package ng.novacore.bank.repository

import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import ng.novacore.bank.repository.localSource.LocalSource
import javax.inject.Inject

class AppRepositoryImpl @Inject constructor(private val localSource: LocalSource, @ApplicationContext val context : Context) : AppRepository