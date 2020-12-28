package ng.novacore.bank.repository.localSource

import androidx.paging.PagingSource
import ng.novacore.bank.db.entity.TransactionEntity

interface LocalSource {
    fun getAllTransactions(): PagingSource<Int, TransactionEntity>
}