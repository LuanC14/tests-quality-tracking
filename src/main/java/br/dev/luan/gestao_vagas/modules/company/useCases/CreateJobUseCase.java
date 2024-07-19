package br.dev.luan.gestao_vagas.modules.company.useCases;

import br.dev.luan.gestao_vagas.modules.company.entities.JobEntity;
import br.dev.luan.gestao_vagas.modules.company.repositories.JobRepository;
import org.springframework.stereotype.Service;


@Service
public class CreateJobUseCase {
    private JobRepository jobRepository;

    public JobEntity execute(JobEntity jobEntity) {
        return this.jobRepository.save(jobEntity);
    }
}
