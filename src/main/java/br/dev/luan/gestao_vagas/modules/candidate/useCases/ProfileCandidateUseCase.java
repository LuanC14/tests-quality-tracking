package br.dev.luan.gestao_vagas.modules.candidate.useCases;


import java.util.UUID;

import br.dev.luan.gestao_vagas.exceptions.UserNotFoundException;
import br.dev.luan.gestao_vagas.modules.candidate.CandidateRepository;
import br.dev.luan.gestao_vagas.modules.candidate.dto.ProfileCandidateResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ProfileCandidateUseCase {
  @Autowired
  private CandidateRepository candidateRepository;

  public ProfileCandidateResponseDTO execute(UUID idCandidate) {
    var candidate = this.candidateRepository.findById(idCandidate)
        .orElseThrow(() -> {
          throw new UserNotFoundException();
        });

    var candidateDTO = ProfileCandidateResponseDTO.builder()
        .description(candidate.getDescription())
        .username(candidate.getUsername())
        .email(candidate.getEmail())
        .name(candidate.getName())
        .id(candidate.getId())
        .build();

    return candidateDTO;
  }
}
