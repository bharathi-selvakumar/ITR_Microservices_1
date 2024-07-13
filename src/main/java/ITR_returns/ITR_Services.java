package ITR_returns;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ITR_Services {
    @Autowired
    ITR_JPA_Rep jpa;

    public ITR_Returns_Entity create(ITR_Returns_Entity data){
        return jpa.save(data);
    }

    public List<ITR_Returns_Entity> read(){
        return jpa.findAll();
    }

    public ITR_Returns_Entity readID(int id){
        return  jpa.findById(id).orElse(new ITR_Returns_Entity());
    }

    public void Delete(int id){
        if(!jpa.existsById(id)){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"The ID "+id +" is not in the Table");
        }
        jpa.deleteById(id);
    }

    public List<ITR_Returns_Entity> get_itr(int itr_id){
        return jpa.findAllByItrNumber(itr_id);
    }

}
