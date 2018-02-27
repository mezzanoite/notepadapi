package br.com.mezzanotte.notepadapi.repository

import br.com.mezzanotte.notepadapi.model.Nota
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.mongodb.repository.Query
import org.springframework.stereotype.Repository
import java.util.stream.Stream

@Repository
interface NotaRepository : MongoRepository<Nota, String> {

    @Query("{}")
    fun all(): Stream<Nota>

    fun findByTitulo(titulo: String): Nota

    // Nome do método define a query que será rodada automaticamente.
    // No caso procura por título ou descrição, se descrição fosse um parâmetro de Nota
    //fun findByTituloOrDescricao(titulo: String, descricao: String): Nota

}