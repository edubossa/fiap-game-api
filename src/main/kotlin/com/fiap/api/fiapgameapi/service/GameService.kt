package com.fiap.api.fiapgameapi.service

import com.fiap.api.fiapgameapi.model.Game
import com.fiap.api.fiapgameapi.repository.GameRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class GameService {

    //lateinit indica que sera inicializado depois
    @Autowired
    lateinit var gameRepository: GameRepository

    fun buscarTodos(): List<Game> = this.gameRepository.findAll()

    fun salvar(game: Game): Unit { this.gameRepository.save(game) }

    fun buscarPorNome(nome: String) : List<Game> = this.gameRepository.findByNomeIgnoreCaseContaining(nome)

    fun deletar(id: String) {this.gameRepository.deleteById(id)}

}