package ng.novacore.bank.repository.localSource

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import ng.novacore.bank.db.BankDB
import javax.inject.Inject

class LocalSourceImpl @Inject constructor(private val db: BankDB, private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO)  : LocalSource