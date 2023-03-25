package com.shopping.entity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

import lombok.Data
;

// import javax.validation.constraints.NotBlank;
@Data
@Setter
@Getter
@ToString
public class Employee  implements Serializable{
    
    private Integer employee_id;

    private String first_name;

    private String last_name;
    
    private String email;

    private String phone;

    
    
    private String hire_date;
    
    private Integer manager_id;
    
    private String job_title;



    
}
