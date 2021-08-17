package br.com.zup
import br.com.zup.autores.*
import io.micronaut.http.HttpStatus
import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import javax.inject.Inject

@MicronautTest
internal class BuscaAutoresControllerTest {

    @field:Inject
    lateinit var autorRepository : AutorRepository

    @field:Inject
    @field:Client("/")
    lateinit var client: HttpClient

    lateinit var autor : Autor

    @BeforeEach
    internal fun setup() {
        val enderecoResponse = EnderecoResponse("Rua das Acácias", "Leonor", "Londrina")
        val endereco = Endereco(enderecoResponse, "86071-280","12")
        autor = Autor("Bob Green", "bob.green@zup.com.br", "Teste post casa do código", endereco)

        autorRepository.save(autor)
    }

    @AfterEach
    internal fun tearDown() {
        autorRepository.deleteAll()
    }

    @Test
    fun deveRetornarOsDadosDeUmAutor() {
        //por padrão o client do Micronaut é reativo
        val response = client.toBlocking().exchange("/autores?email=${autor.email}", DetalhesDoAutorResponse::class.java)

        assertEquals(HttpStatus.OK, response.status)
        assertNotNull(response.body())
        assertEquals(autor.nome, response.body()!!.nome)
        assertEquals(autor.email, response.body()!!.email)
        assertEquals(autor.descricao, response.body()!!.descricao)

    }
}
