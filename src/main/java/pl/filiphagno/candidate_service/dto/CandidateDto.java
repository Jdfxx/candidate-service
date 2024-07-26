package pl.filiphagno.candidate_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CandidateDto {
    private String id;
    private String name;
    private Set<String> skills;
    private String hostName;
}
