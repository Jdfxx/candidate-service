package pl.filiphagno.candidate_service.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import pl.filiphagno.candidate_service.entity.Candidate;
import reactor.core.publisher.Flux;

import java.util.Set;

@Repository
public interface CandidateRepository extends ReactiveCrudRepository<Candidate, String> {
    Flux<Candidate> findBySkillsIn(Set<String> skills);
}
