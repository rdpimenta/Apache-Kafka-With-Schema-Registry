package br.com.fullstackoverflow.kafkaschemaregistryexample

import br.com.fullstackoverflow.kafkaschemaregistryexample.entity.Pessoa
import br.com.fullstackoverflow.kafkaschemaregistryexample.producer.PessoaProducerImpl
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KafkaSchemaRegistryExampleApplication(
	val pessoaProducerImpl: PessoaProducerImpl
): ApplicationRunner {
	override fun run(args: ApplicationArguments?) {
		val pessoa = Pessoa("José", "Antunes")
		pessoaProducerImpl.persist("12345", pessoa)
	}
}

fun main(args: Array<String>) {
	runApplication<KafkaSchemaRegistryExampleApplication>(*args)
}
