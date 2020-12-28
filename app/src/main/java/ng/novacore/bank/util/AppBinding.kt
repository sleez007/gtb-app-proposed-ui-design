package ng.novacore.bank.util

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.google.android.material.textview.MaterialTextView
import java.text.SimpleDateFormat
import java.util.*

@BindingAdapter("setImage")
fun ImageView.setImage(imgRes: Int){
    setImageResource(imgRes)
}


@BindingAdapter("formatTime")
fun MaterialTextView.formatTime(date:Date){
    val dd = SimpleDateFormat("dd MMM hh:mm")
    text = dd.format(date)
}


