package com.june15.demo.june15demo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

/**
 * Employee Controller POJO
 * @author ashish
 */
@RestController
public class EmployeeController {
    public static Map<Integer,Employee> employeeMap=new HashMap<Integer,Employee>();
    static {
        Employee ceo=new Employee();
        ceo.setId(1);
        ceo.setName("Sai");
        employeeMap.put(ceo.getId(),ceo);

        Employee cpo=new Employee();
        cpo.setId(2);
        cpo.setName("Hari");
        employeeMap.put(cpo.getId(),cpo);
    }

    @RequestMapping(value = "/show")
    public ResponseEntity getEmployees(){
        return new ResponseEntity(employeeMap.values(), HttpStatus.OK);
    }
}
