package ng.novacore.bank.db.dao

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Query
import ng.novacore.bank.db.entity.TransactionEntity

@Dao
interface TransactionDao {
    @Query("SELECT * FROM transaction_table")
    fun getAllTransactions(): PagingSource<Int, TransactionEntity>
}