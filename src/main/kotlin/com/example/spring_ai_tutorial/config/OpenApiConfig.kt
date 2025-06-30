package com.example.spring_ai_tutorial.config

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * 스웨거 문서 설정을 담당하는 클래스입니다.
 * 이 클래스에서는 스웨거 문서의 제목, 버전, 설명 등을 설정합니다.
 */
@Configuration
class OpenApiConfig {

    @Bean
    fun springOpenAPI(): OpenAPI {
        return OpenAPI()
            .info(
                Info()
                    .title("Spring AI Tutorial API")
                    .version("1.0")
                    .description("Spring AI를 활용한 챗봇 API")
            )
    }
}
