package br.com.zup.agenda.viewstate


    sealed class ViewState<out T> {
        data class Success<T>(val data: T) : ViewState<T>()
        data class Error(val throwable: Throwable) : ViewState<Nothing>()
    }
