package ng.novacore.bank.repository

import android.content.Context
import androidx.paging.PagingSource
import dagger.hilt.android.qualifiers.ApplicationContext
import ng.novacore.bank.db.entity.TransactionEntity
import ng.novacore.bank.repository.localSource.LocalSource
import javax.inject.Inject

class AppRepositoryImpl @Inject constructor(private val localSource: LocalSource, @ApplicationContext val context : Context) : AppRepository {
    override fun getAllTransactions(): PagingSource<Int, TransactionEntity> = localSource.getAllTransactions()
}