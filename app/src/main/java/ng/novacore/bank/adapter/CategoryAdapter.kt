package ng.novacore.bank.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import ng.novacore.bank.databinding.RowActionBinding
import ng.novacore.bank.model.QuickAction

class CategoryAdapter(private val fn : ()-> Unit): ListAdapter<QuickAction, QuickActionVH>(CategoryDiffUtil())  {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuickActionVH = QuickActionVH.from(parent)
    override fun onBindViewHolder(holder: QuickActionVH, position: Int) = holder.bind(getItem(position), fn)
}

class QuickActionVH(private val binding : RowActionBinding) : RecyclerView.ViewHolder( binding.root){
    companion object{
        fun from(parent: ViewGroup): QuickActionVH{
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding = RowActionBinding.inflate(layoutInflater, parent, false)
            return  QuickActionVH(binding)
        }
    }

    fun bind(item : QuickAction, fn: ()-> Unit ){
        binding.category = item
        binding.executePendingBindings()
    }
}

class CategoryDiffUtil : DiffUtil.ItemCallback<QuickAction>(){
    override fun areItemsTheSame(oldItem: QuickAction, newItem: QuickAction): Boolean = oldItem.title == newItem.title
    override fun areContentsTheSame(oldItem: QuickAction, newItem: QuickAction): Boolean = oldItem == newItem
}