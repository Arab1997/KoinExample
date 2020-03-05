package com.example.gkhn.koinexample.data

class GithubUserPresenter(val repo: UserRepository)
{
    fun getGithubUsers():List<GithubUser> = repo.fetchUsers()
}
