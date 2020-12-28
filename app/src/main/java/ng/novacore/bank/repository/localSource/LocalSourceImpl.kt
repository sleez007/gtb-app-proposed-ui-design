package ng.novacore.bank.repository.localSource

import androidx.paging.PagingSource
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import ng.novacore.bank.db.BankDB
import ng.novacore.bank.db.entity.TransactionEntity
import javax.inject.Inject

class LocalSourceImpl @Inject constructor(private val db: BankDB, private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO)  : LocalSource {
    override fun getAllTransactions(): PagingSource<Int, TransactionEntity>  = db.getTransactionDao().getAllTransactions()
}