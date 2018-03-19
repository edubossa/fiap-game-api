package com.fiap.api.fiapgameapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/*
    https://dashboard.heroku.com/apps/fiap-game-api/settings
    https://fiap-game-api.herokuapp.com/games
    https://mlab.com/databases/fiap-game/collections/game
 */
@SpringBootApplication
class FiapGameApiApplication

fun main(args: Array<String>) {
    runApplication<FiapGameApiApplication>(*args)
}
