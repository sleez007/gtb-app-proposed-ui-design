package ng.novacore.bank.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "transaction_table")
data class TransactionEntity(
  @PrimaryKey(autoGenerate = true)
  val id : Long = 0,
  val transaction_title : String
)