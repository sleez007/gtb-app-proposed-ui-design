package ng.novacore.bank.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "transaction_table")
data class TransactionEntity(
  @PrimaryKey(autoGenerate = true)
  val id : Long = 0,
  val transaction_title : String,
  val transaction_amount : Double,
  val transaction_branch : String,
  val account_number : String,
  val bank_name: String,
  val additional_information : String,
  val transaction_date : Date,
  val sender : String,
  val receiver : String,
  val is_out_going : Boolean= false
)