package com.example.spring_ai_tutorial.config

import io.github.oshai.kotlinlogging.KotlinLogging
import org.springframework.ai.openai.api.OpenAiApi
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
  * OpenAI API와의 연동을 위한 설정 클래스입니다.
  * 이 클래스에서는 OpenAI API를 사용하기 위한 API 키를 주입받고,
  * OpenAI API 클라이언트 빈을 생성하여 스프링 컨테이너에 등록합니다.
  * 이를 통해 애플리케이션 내에서 OpenAI API를 손쉽게 사용할 수 있습니다.
  */
@Configuration
class OpenAiConfig {
    private val logger = KotlinLogging.logger {}

    @Value("\${spring.ai.openai.api-key}")
    private lateinit var apiKey: String

    /**
     * OpenAI API 클라이언트 빈 등록
     */
    @Bean
    fun openAiApi(): OpenAiApi {
        logger.debug { "OpenAI API 클라이언트 초기화" }
        return OpenAiApi.builder()
            .apiKey(apiKey)
            .build()
    }
}