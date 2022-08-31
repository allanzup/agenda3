package br.com.zup.agenda.ui.detail.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import br.com.zup.agenda.data.model.UserResult
import br.com.zup.agenda.domain.usecase.GetUseCase
import br.com.zup.agenda.viewstate.ViewState
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class DetailViewModel(application: Application) : AndroidViewModel(application) {
    private val getUseCase = GetUseCase(application)
    val userAddState = MutableLiveData<ViewState<UserResult>>()

    fun deleteAllList(userResult: UserResult) {
        viewModelScope.launch {
            val response = withContext(Dispatchers.IO) {
                getUseCase.deleteAllList(userResult)
            }
        }
    }

}