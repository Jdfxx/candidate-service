package pl.filiphagno.candidate_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.filiphagno.candidate_service.dto.CandidateDto;
import pl.filiphagno.candidate_service.service.CandidateService;
import reactor.core.publisher.Flux;

import java.util.Set;

@RestController
@RequestMapping("candidate")
public class CandidateController {
    @Autowired
    private CandidateService service;

    @GetMapping("all")
    public Flux<CandidateDto> all() {
        return this.service.allCandidates();
    }

    @GetMapping("search")
    public Flux<CandidateDto> search(@RequestParam Set<String> skills) {
        return this.service.candidateBySkillsIn(skills);
    }

}
