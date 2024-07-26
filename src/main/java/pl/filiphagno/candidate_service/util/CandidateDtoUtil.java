package pl.filiphagno.candidate_service.util;

import org.springframework.beans.BeanUtils;
import pl.filiphagno.candidate_service.dto.CandidateDto;
import pl.filiphagno.candidate_service.entity.Candidate;

public class CandidateDtoUtil {
    public static CandidateDto toDto(Candidate candidate) {
        CandidateDto dto = new CandidateDto();
        BeanUtils.copyProperties(candidate, dto);
        dto.setHostName(AppUtil.getHostname());
        return dto;
    }

    public static Candidate toEntity(CandidateDto dto) {
        Candidate candidate = new Candidate();
        BeanUtils.copyProperties(dto, candidate);
        return candidate;
    }
}
