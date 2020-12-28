package ng.novacore.bank.model

import ng.novacore.bank.db.entity.TransactionEntity
import java.util.*

sealed class UIModel {
    class TransactionModel(val _id : Long, val title: String, val amount : Double, val transactionDate: Date, val isOutGoing : Boolean, sender: String, receiver : String ): UIModel(){
        constructor(t : TransactionEntity): this(
            _id = t.id,title = t.transaction_title, amount = t.transaction_amount, transactionDate = t.transaction_date, isOutGoing = t.is_out_going, sender = t.sender, receiver = t.receiver
        )
    }
    class SeparatorModel(val description: String) : UIModel()
}