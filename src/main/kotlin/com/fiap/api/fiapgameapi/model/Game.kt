package com.fiap.api.fiapgameapi.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

//data class Greeting(val id: Long, val content: String)

@Document
data class Game(@Id val id: String? = null, var nome: String, var urlImagem: String, var anoLancamento: Int)