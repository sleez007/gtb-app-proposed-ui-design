package ng.novacore.bank.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import ng.novacore.bank.R

data class QuickAction(@StringRes val title : Int, @DrawableRes val icon : Int){
    companion object{
        fun allActions(): List<QuickAction>{
            val actionList = ArrayList<QuickAction>()
            actionList.add(QuickAction(R.string.transfer, R.drawable.ic_outline_ac_unit))
            actionList.add(QuickAction(R.string.top_up, R.drawable.ic_outline_phone_iphone))
            actionList.add(QuickAction(R.string.paybill, R.drawable.ic_outline_credit_card))
            actionList.add(QuickAction(R.string.sports, R.drawable.ic_outline_sports_volleyball))
            return  actionList
        }
    }
}