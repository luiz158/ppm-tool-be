package id.dondon.ppmt.repository;


import id.dondon.ppmt.domain.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {

    Project findByProjectIdentifier(String projectId);
    Iterable<Project> findAll();


}