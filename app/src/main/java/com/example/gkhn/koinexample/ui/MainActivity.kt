package com.example.gkhn.koinexample.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.gkhn.koinexample.R
import com.example.gkhn.koinexample.data.GithubUserPresenter
import com.example.gkhn.koinexample.di.appModule
import org.koin.android.ext.android.inject
import org.koin.core.context.startKoin
import org.koin.dsl.module

class MainActivity : AppCompatActivity() {

    val githubUserPresenter : GithubUserPresenter by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       startKoin {
           modules(appModule)
       }

Log.e("githubUsers",githubUserPresenter.getGithubUsers().toString())
    }
}
