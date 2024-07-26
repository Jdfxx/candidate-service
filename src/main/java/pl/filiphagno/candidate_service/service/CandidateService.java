package pl.filiphagno.candidate_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.filiphagno.candidate_service.dto.CandidateDto;
import pl.filiphagno.candidate_service.repository.CandidateRepository;
import pl.filiphagno.candidate_service.util.CandidateDtoUtil;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Set;

@Service
public class CandidateService {
    @Autowired
    private CandidateRepository repository;

    public Flux<CandidateDto> allCandidates() {
        return this.repository.findAll().map(CandidateDtoUtil::toDto);
    }

    public Flux<CandidateDto> candidateBySkillsIn(Set<String> skills) {
        return this.repository.findBySkillsIn(skills).map(CandidateDtoUtil::toDto);
    }

    public Mono<CandidateDto> save(Mono<CandidateDto> mono) {
        return mono
                .map(CandidateDtoUtil::toEntity)
                .flatMap(this.repository::save)
                .map(CandidateDtoUtil::toDto);
    }
}
