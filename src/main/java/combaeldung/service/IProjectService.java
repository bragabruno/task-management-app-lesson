package combaeldung.service;

import combaeldung.persistence.model.Project;
import combaeldung.persistence.repository.IProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public interface IProjectService {

    Optional<Project> findById(Long id);

    Project save(Project project);
}
