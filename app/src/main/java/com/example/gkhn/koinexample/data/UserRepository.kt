package com.example.gkhn.koinexample.data

interface UserRepository {
    fun fetchUsers():List<GithubUser>
}