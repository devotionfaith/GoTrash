package com.adinda.gotrash.presentation.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.adinda.gotrash.data.repository.auth.AuthRepository
import kotlinx.coroutines.Dispatchers

class LoginViewModel(private val repository: AuthRepository) : ViewModel() {
    fun doLogin(
        email: String,
        password: String,
    ) = repository.doLogin(
        email = email,
        password = password,
    ).asLiveData(Dispatchers.IO)
}