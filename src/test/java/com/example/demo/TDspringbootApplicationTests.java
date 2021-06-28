package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TDspringbootApplicationTests {
Validator valid;
@BeforeEach
void init()
{
valid =new Validator();	
}
	@Test
	void contextLoads() {
	}
	@Test
	void verifNom()
	{
		assertTrue(valid.notNullorempty("teste"));
		
	}
@Test
void verifmail()
{
assertTrue(valid.verifmail("user@gmail.com"));	
}
@Test
void verifbudget()
{
assertTrue(valid.verifBudget(200));	
}
}
