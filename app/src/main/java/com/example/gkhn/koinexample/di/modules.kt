package com.example.gkhn.koinexample.di

import com.example.gkhn.koinexample.data.GithubUserPresenter
import com.example.gkhn.koinexample.data.UserRepository
import com.example.gkhn.koinexample.data.UserRepositoryImpl
import org.koin.dsl.module

val appModule = module {
    single<UserRepository> { UserRepositoryImpl() }
    factory { GithubUserPresenter(get()) }
}