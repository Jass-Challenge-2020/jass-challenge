package ch.zuehlke.jasschallenge

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JassServerApplication

fun main(args: Array<String>) {
    runApplication<JassServerApplication>(*args)
}
