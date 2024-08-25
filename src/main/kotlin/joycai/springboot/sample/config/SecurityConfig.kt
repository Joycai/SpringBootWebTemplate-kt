package joycai.springboot.sample.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer
import org.springframework.security.web.SecurityFilterChain
import org.springframework.web.cors.CorsConfiguration
import org.springframework.web.cors.CorsConfigurationSource
import java.util.*

@Configuration
@EnableWebSecurity
class SecurityConfig {

    @Bean
    fun filterChain(http: HttpSecurity): SecurityFilterChain {

        return http.csrf { csrf -> csrf.disable() }
            .cors { cors ->
                cors.configurationSource {
                    val corsConfiguration = CorsConfiguration()
                    corsConfiguration.allowedHeaders = listOf("*")
                    corsConfiguration.allowedMethods = listOf("*")
                    corsConfiguration.allowedOrigins = listOf("*")
                    return@configurationSource corsConfiguration
                }
            }
            .authorizeHttpRequests { conf ->
                conf.requestMatchers("/**").permitAll()
                    .anyRequest().authenticated()
            }
            .build()
    }

    @Bean
    fun webSecurityCustomizer(): WebSecurityCustomizer {
        return WebSecurityCustomizer { web ->
            web.ignoring().requestMatchers("/webjars/**", "favicon.ico")
        }
    }
}
