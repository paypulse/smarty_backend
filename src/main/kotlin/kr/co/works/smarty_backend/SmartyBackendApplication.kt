package kr.co.works.smarty_backend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.runApplication
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer

@SpringBootApplication
class SmartyBackendApplication : SpringBootServletInitializer() {
    override fun configure(application: SpringApplicationBuilder): SpringApplicationBuilder {
        return application.sources(SmartyBackendApplication::class.java)
    }
}

fun main(args: Array<String>) {
    runApplication<SmartyBackendApplication>(*args)
}
