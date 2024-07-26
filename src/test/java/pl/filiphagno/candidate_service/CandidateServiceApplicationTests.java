package pl.filiphagno.candidate_service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.autoconfigure.webservices.client.WebServiceClientTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest
@AutoConfigureWebTestClient
class CandidateServiceApplicationTests extends BaseTest {

	@Autowired
	private WebTestClient client;

	@Test
	void allJobsTest() {
		this.client.get()
				.uri("/candidate/all")
				.exchange()
				.expectStatus().is2xxSuccessful()
				.expectBody().jsonPath("$").isNotEmpty();
	}

}
