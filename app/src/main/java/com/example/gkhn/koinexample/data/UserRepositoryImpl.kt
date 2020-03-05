package com.example.gkhn.koinexample.data

class UserRepositoryImpl : UserRepository {
    override fun fetchUsers(): List<GithubUser> {
        return listOf(
            GithubUser(name = "Benerd", username = "@bernd23"),
            GithubUser(name = "Abardb Barim", username = "@barimls"),
            GithubUser(name = "Leundy Marib", username = "@maribxy"),
            GithubUser(name = "Martin ", username = "@malcomx"),
            GithubUser(name = "Brunette Rasly", username = "@raslybr")
        )
    }

}