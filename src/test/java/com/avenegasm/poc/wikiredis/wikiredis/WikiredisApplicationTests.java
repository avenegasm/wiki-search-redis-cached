package com.avenegasm.poc.wikiredis.wikiredis;

import com.avenegasm.poc.wikiredis.wikiredis.service.WikipediaService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

@SpringBootTest
@RunWith(SpringRunner.class)
class WikiredisApplicationTests {

	@Autowired
	WikipediaService wikipediaService;

	@Test
	void contextLoads() {
	}

	@Test
	public void testWikipedia(){
		Assert.notNull(wikipediaService.realizarBusqueda("Chile"),"No coincide");
	}

}
