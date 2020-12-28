package ng.novacore.bank.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import ng.novacore.bank.databinding.RowSeperatorBinding
import ng.novacore.bank.databinding.RowTransactionBinding
import ng.novacore.bank.model.UIModel

class TransactionAdapter: PagingDataAdapter<UIModel, RecyclerView.ViewHolder>(UiModelComparator()) {
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder) {
            is TransactionVh -> holder.bind( getItem(position) as UIModel.TransactionModel )
            is SeparatorHolder -> holder.bind(getItem(position) as UIModel.SeparatorModel)
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = when(viewType) {
        1 ->TransactionVh.from(parent)
        2->SeparatorHolder.from(parent)
        else -> throw IllegalStateException("Unknown view")
    }
    override fun getItemViewType(position: Int) = when (getItem(position)) {
        is UIModel.TransactionModel -> 1
        is UIModel.SeparatorModel -> 2
        null -> throw IllegalStateException("Unknown view")
    }
}

class TransactionVh(val binding : RowTransactionBinding) :RecyclerView.ViewHolder(binding.root){
    companion object{
        fun from(parent : ViewGroup): TransactionVh{
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding =RowTransactionBinding.inflate(layoutInflater, parent, false)
            return TransactionVh(binding)
        }
    }

    fun bind(trans: UIModel.TransactionModel?){
        trans?.let {
            binding.trans = trans
        }
        binding.executePendingBindings()
    }
}

class SeparatorHolder(val binding: RowSeperatorBinding):RecyclerView.ViewHolder(binding.root){
    companion object{
        fun from(parent : ViewGroup): SeparatorHolder{
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding =RowSeperatorBinding.inflate(layoutInflater, parent, false)
            return SeparatorHolder(binding)
        }
    }


    fun bind(separator : UIModel.SeparatorModel?){
        separator?.let {
            binding.str = it.description
        }
        binding.executePendingBindings()
    }
}

class UiModelComparator : DiffUtil.ItemCallback<UIModel>() {
    override fun areItemsTheSame(
        oldItem: UIModel,
        newItem: UIModel
    ): Boolean {
        val isSameRepoItem = oldItem is UIModel.TransactionModel
                && newItem is UIModel.TransactionModel
                && oldItem._id == newItem._id

        val isSameSeparatorItem = oldItem is UIModel.SeparatorModel
                && newItem is UIModel.SeparatorModel
                && oldItem.description == newItem.description

        return isSameRepoItem || isSameSeparatorItem
    }

    override fun areContentsTheSame(oldItem: UIModel,newItem: UIModel) = oldItem == newItem
}