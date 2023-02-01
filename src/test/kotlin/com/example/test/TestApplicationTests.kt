package com.example.test

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultHandlers.print
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.*

@SpringBootTest
@AutoConfigureMockMvc
class TestApplicationTests {
	
	@Autowired
	private lateinit var mvc:MockMvc
	
	@Test
	fun testHello() {
		mvc.perform(get("/test/hello?name=lihu"))
			.andExpect(status().isOk)
			.andExpect(content().string("hello,lihu"))
			.andDo(print())
	}
	
	@Test
	fun testHelloResponse(){
		mvc.perform(get("/test/helloResponse?name=lihu"))
			.andExpect(status().isOk)
			.andExpect(jsonPath("code").value(200))
			.andDo(print())
	}
	
	

}
