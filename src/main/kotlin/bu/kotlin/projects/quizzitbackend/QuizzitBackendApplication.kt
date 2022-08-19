package bu.kotlin.projects.quizzitbackend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class QuizzitBackendApplication

fun main(args: Array<String>) {
    runApplication<QuizzitBackendApplication>(*args)
}
