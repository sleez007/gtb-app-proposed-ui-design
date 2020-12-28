package ng.novacore.bank.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import androidx.sqlite.db.SupportSQLiteDatabase
import ng.novacore.bank.data.FakeData
import ng.novacore.bank.db.converter.Converters
import ng.novacore.bank.db.dao.TransactionDao
import ng.novacore.bank.db.entity.TransactionEntity
import ng.novacore.bank.util.ioThread

@Database(entities = [TransactionEntity::class], version = 1, exportSchema = false)
@TypeConverters(Converters::class)
abstract class BankDB : RoomDatabase() {
    abstract fun getTransactionDao(): TransactionDao

    companion object{
        fun provideDB(context: Context): BankDB{
          return  Room.databaseBuilder(context.applicationContext, BankDB::class.java,"bank_db.db")
                .addCallback(object : RoomDatabase.Callback(){
                    override fun onCreate(db: SupportSQLiteDatabase) {
                        fillInDb(context)
                    }
                }).build()
        }

        private fun fillInDb(context: Context) {
            // inserts in Room are executed on the current thread, so we insert in the background
            ioThread {
                provideDB(context).getTransactionDao().insert(FakeData.transactionList())
            }
        }
    }
}