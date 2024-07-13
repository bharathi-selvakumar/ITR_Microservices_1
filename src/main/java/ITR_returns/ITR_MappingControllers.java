package ITR_returns;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/ItrReturns")
public class ITR_MappingControllers {
    @Autowired
    ITR_Services services;

    @GetMapping("/get")
    public List<ITR_Returns_Entity> get(){
        return services.read();
    }

    @PostMapping("/")
    public ITR_Returns_Entity post(@RequestBody ITR_Returns_Entity data){
        return services.create(data);
    }

    @GetMapping("/getId/{id}")
    public ITR_Returns_Entity getID(@PathVariable("id") int id){
            return services.readID(id);
    }

    @PutMapping("/put")
    public ITR_Returns_Entity put(@RequestBody ITR_Returns_Entity Update_data){
        return services.create(Update_data);
    }

    @DeleteMapping("/del/{id}")
    public String del(@PathVariable("id") int id){
       try {
           services.Delete(id);
           return "The ID "+id+" is removed from table";
       }
       catch (ResponseStatusException e){
                throw e;
       }
    }


}
