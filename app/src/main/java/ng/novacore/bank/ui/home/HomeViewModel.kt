package ng.novacore.bank.ui.home

import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.*
import androidx.paging.*
import kotlinx.coroutines.flow.map
import ng.novacore.bank.db.entity.TransactionEntity
import ng.novacore.bank.model.UIModel
import ng.novacore.bank.repository.AppRepository
import java.text.SimpleDateFormat
import java.util.*

class HomeViewModel @ViewModelInject constructor(private val appRepository: AppRepository, @Assisted private val savedStateHandle: SavedStateHandle) : ViewModel() {
    val transactions = Pager(
        PagingConfig(pageSize = 20, enablePlaceholders = false)
    ){
        appRepository.getAllTransactions()
    }.flow.map {pagingData: PagingData<TransactionEntity> ->
        pagingData.map {trans->
            UIModel.TransactionModel(trans)
        }.insertSeparators<UIModel.TransactionModel, UIModel> { before, after ->
            val simpForm = SimpleDateFormat("yyyy-MMM-dd")

            when {
                before == null ->if(after?.transactionDate != null) UIModel.SeparatorModel(simpForm.format(after.transactionDate)) else null
                after == null -> null
                shouldSeparate(before, after) -> UIModel.SeparatorModel(  simpForm.format(after.transactionDate) )
                // Return null to avoid adding a separator between two items.
                else -> null
            }
        }
    }.cachedIn(viewModelScope)

    private fun shouldSeparate(before: UIModel.TransactionModel, after: UIModel.TransactionModel): Boolean {
        return  before.transactionDate!=after.transactionDate
    }
}