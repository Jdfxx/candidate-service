package pl.filiphagno.candidate_service;

import org.springframework.boot.SpringApplication;

public class TestCandidateServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(CandidateServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
