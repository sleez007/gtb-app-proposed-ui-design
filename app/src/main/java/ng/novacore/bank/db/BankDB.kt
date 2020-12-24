package ng.novacore.bank.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import ng.novacore.bank.db.converter.Converters
import ng.novacore.bank.db.dao.TransactionDao
import ng.novacore.bank.db.entity.TransactionEntity

@Database(entities = [TransactionEntity::class], version = 1, exportSchema = false)
@TypeConverters(Converters::class)
abstract class BankDB : RoomDatabase() {
    abstract fun getTransactionDao(): TransactionDao
}