package com.fiap.api.fiapgameapi.controller

import com.fiap.api.fiapgameapi.model.Game
import com.fiap.api.fiapgameapi.service.GameService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.concurrent.atomic.AtomicLong

@RestController
@CrossOrigin //Habilita requisicao via javascript
@RequestMapping (value = "/games") //Adiciona como prefixo game em todas as requisicoes
class GameController {

    @Autowired
    lateinit var gameService: GameService;

    //val counter = AtomicLong();

    /*@GetMapping("/hello")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String): Game {
        return  Game(counter.incrementAndGet().toString(), "Eduardo Wallace", "http://localhost/img;90923", 2018);
    }*/

    @GetMapping
    fun buscarTodos(): List<Game> = this.gameService.buscarTodos()

    @PostMapping
    fun salvar(@RequestBody game: Game) {
        this.gameService.salvar(game)
    }

    @GetMapping(value = "/titulo/{titulo}")
    fun buscarPorNome(@PathVariable(value = "titulo") titulo: String) = this.gameService.buscarPorNome(titulo);

    @DeleteMapping(value = "/{id}")
    fun deletarGame(@PathVariable(value = "id") id: String) : Unit {
        this.gameService.deletar(id)
    }

}