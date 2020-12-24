package ng.novacore.bank.ui.home

import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import ng.novacore.bank.repository.AppRepository

class HomeViewModel @ViewModelInject constructor(private val appRepository: AppRepository, @Assisted private val savedStateHandle: SavedStateHandle) : ViewModel() {

}