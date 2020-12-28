package ng.novacore.bank.db.dao

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import ng.novacore.bank.db.entity.TransactionEntity

@Dao
interface TransactionDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(trans: List<TransactionEntity>)

    @Query("SELECT * FROM transaction_table ORDER BY datetime(transaction_date)")
    fun getAllTransactions(): PagingSource<Int, TransactionEntity>

    @Query("SELECT * FROM transaction_table WHERE id=:id")
    fun getTransactionById(id: Long): Flow<TransactionEntity>
}