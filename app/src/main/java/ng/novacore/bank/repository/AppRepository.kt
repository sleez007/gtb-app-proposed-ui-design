package ng.novacore.bank.repository

import androidx.paging.PagingSource
import ng.novacore.bank.db.entity.TransactionEntity

interface AppRepository {
    fun getAllTransactions(): PagingSource<Int, TransactionEntity>
}