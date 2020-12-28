package ng.novacore.bank.data

import ng.novacore.bank.db.dao.TransactionDao
import ng.novacore.bank.db.entity.TransactionEntity
import ng.novacore.bank.util.ioThread
import java.util.*
import kotlin.collections.ArrayList

object FakeData {

    fun transactionList() :List<TransactionEntity>{
        val myList : ArrayList<TransactionEntity> = ArrayList()
        myList.add(TransactionEntity(id = 0, transaction_title = "SMS Alert Charge",transaction_amount = 234000.00,transaction_branch = "E-channels",account_number = "1234567890",bank_name = "Sterling Bank",additional_information = "Transfer to STR/Etoka Kingsley/REF: 00754345621",transaction_date = Date(1608999288681),sender = "Faith", receiver = "Kingsley Ebube",is_out_going = true  ))
        myList.add(TransactionEntity(id = 0, transaction_title = "VAT Charge Fee",transaction_amount = 50.00,transaction_branch = "E-channels",account_number = "1234567890",bank_name = "Guarantee Trust Bank",additional_information = "GTB charge Vat on transfer",transaction_date = Date(1608998281),sender = "Kingsley Etoka", receiver = "GTB bank",is_out_going = true ))
        myList.add(TransactionEntity(id = 0, transaction_title = "Debit Alertx",transaction_amount = 7000.00,transaction_branch = "E-channels",account_number = "1234567890",bank_name = "Guarantee Trust Bank",additional_information = "Transfer to STR/Etoka Kingsley/REF: 1577833200",transaction_date = Date(1577833200),sender = "Faith", receiver = "Kingsley Ebube",is_out_going = true  ))
        myList.add(TransactionEntity(id = 0, transaction_title = "Debit Alert",transaction_amount = 7000.00,transaction_branch = "E-channels",account_number = "1234567890",bank_name = "Guarantee Trust Bank",additional_information = "Transfer to STR/Etoka Kingsley/REF: 00754345621",transaction_date = Date(1608998281),sender = "Faith", receiver = "Kingsley Ebube",is_out_going = true  ))
        myList.add(TransactionEntity(id = 0, transaction_title = "Debit Alert",transaction_amount = 7000.00,transaction_branch = "E-channels",account_number = "1234567890",bank_name = "Guarantee Trust Bank",additional_information = "Transfer to STR/Etoka Kingsley/REF: 00754345621",transaction_date = Date(2629743),sender = "Faith", receiver = "Kingsley Ebube",is_out_going = true  ))
        myList.add(TransactionEntity(id = 0, transaction_title = "Debit Alert",transaction_amount = 7000.00,transaction_branch = "E-channels",account_number = "1234567890",bank_name = "Guarantee Trust Bank",additional_information = "Transfer to STR/Etoka Kingsley/REF: 00754345621",transaction_date = Date(1590966000),sender = "Faith", receiver = "Kingsley Ebube",is_out_going = true  ))
        myList.add(TransactionEntity(id = 0, transaction_title = "Debit Alert",transaction_amount = 7000.00,transaction_branch = "E-channels",account_number = "1234567890",bank_name = "Guarantee Trust Bank",additional_information = "Transfer to STR/Etoka Kingsley/REF: 00754345621",transaction_date = Date(1608998281),sender = "Faith", receiver = "Kingsley Ebube",is_out_going = true  ))
        myList.add(TransactionEntity(id = 0, transaction_title = "Debit Alert",transaction_amount = 7000.00,transaction_branch = "E-channels",account_number = "1234567890",bank_name = "Guarantee Trust Bank",additional_information = "Transfer to STR/Etoka Kingsley/REF: 00754345621",transaction_date = Date(1608998281),sender = "Faith", receiver = "Kingsley Ebube",is_out_going = true  ))
        myList.add(TransactionEntity(id = 0, transaction_title = "Debit Alert",transaction_amount = 7000.00,transaction_branch = "E-channels",account_number = "1234567890",bank_name = "Guarantee Trust Bank",additional_information = "Transfer to STR/Etoka Kingsley/REF: 00754345621",transaction_date = Date(1608998281),sender = "Faith", receiver = "Kingsley Ebube",is_out_going = true  ))
        myList.add(TransactionEntity(id = 0, transaction_title = "Debit Alert",transaction_amount = 7000.00,transaction_branch = "E-channels",account_number = "1234567890",bank_name = "Guarantee Trust Bank",additional_information = "Transfer to STR/Etoka Kingsley/REF: 00754345621",transaction_date = Date(1608998281),sender = "Faith", receiver = "Kingsley Ebube",is_out_going = true  ))
        myList.add(TransactionEntity(id = 0, transaction_title = "Debit Alert",transaction_amount = 7000.00,transaction_branch = "E-channels",account_number = "1234567890",bank_name = "Guarantee Trust Bank",additional_information = "Transfer to STR/Etoka Kingsley/REF: 00754345621",transaction_date = Date(1608998281),sender = "Faith", receiver = "Kingsley Ebube",is_out_going = true  ))
        myList.add(TransactionEntity(id = 0, transaction_title = "Debit Alert",transaction_amount = 7000.00,transaction_branch = "E-channels",account_number = "1234567890",bank_name = "Guarantee Trust Bank",additional_information = "Transfer to STR/Etoka Kingsley/REF: 00754345621",transaction_date = Date(1608998281),sender = "Faith", receiver = "Kingsley Ebube",is_out_going = true  ))
        myList.add(TransactionEntity(id = 0, transaction_title = "Debit Alert",transaction_amount = 7000.00,transaction_branch = "E-channels",account_number = "1234567890",bank_name = "Guarantee Trust Bank",additional_information = "Transfer to STR/Etoka Kingsley/REF: 00754345621",transaction_date = Date(1608998281),sender = "Faith", receiver = "Kingsley Ebube",is_out_going = true  ))
        myList.add(TransactionEntity(id = 0, transaction_title = "Debit Alert",transaction_amount = 7000.00,transaction_branch = "E-channels",account_number = "1234567890",bank_name = "Guarantee Trust Bank",additional_information = "Transfer to STR/Etoka Kingsley/REF: 00754345621",transaction_date = Date(1608998281),sender = "Faith", receiver = "Kingsley Ebube",is_out_going = true  ))
        myList.add(TransactionEntity(id = 0, transaction_title = "Debit Alert",transaction_amount = 7000.00,transaction_branch = "E-channels",account_number = "1234567890",bank_name = "Guarantee Trust Bank",additional_information = "Transfer to STR/Etoka Kingsley/REF: 00754345621",transaction_date = Date(1608998281),sender = "Faith", receiver = "Kingsley Ebube",is_out_going = true  ))

        return myList
    }

}