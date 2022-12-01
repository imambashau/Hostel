package repository;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import model.HostelModel;
@Repository
public interface HostelRepository extends MongoRepository<HostelModel,Integer>{

}
