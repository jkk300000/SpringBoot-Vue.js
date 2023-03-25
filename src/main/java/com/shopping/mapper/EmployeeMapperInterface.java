package com.shopping.mapper;

import com.shopping.entity.Employee;
import org.apache.ibatis.annotations.*;


import java.util.List;


// @MapperScan 공부 요망
@Mapper // 스프링이 자동으로 객체를 생성하고, sql 구문을 분석해 줍니다.
public interface EmployeeMapperInterface {
    @Select("select * from employees")
    List<Employee> SelectAll() ;

    String sql = " insert into employees(first_name, last_name, email, phone, hire_date, manager_id, job_title) values(#{employee.first_name}, #{employee.last_name}, #{employee.email},  #{employee.phone},  #{employee.hire_date},  #{employee.manager_id},  #{employee.job_title})";
    @Insert(sql)
    int Insert(@Param("employee") final Employee employee);

    @Select("select * from employees where employee_id = #{employeeId}")
    Employee SelectOne(@Param("employeeId") final Integer employeeId);

    String sql2 = " update employees set first_name=#{employee.first_name}, last_name=#{employee.last_name}, email=#{employee.email}, phone=#{employee.phone}, hire_date=#{employee.hire_date}, manager_id=#{employee.manager_id}, job_title=#{employee.job_title} where employee_id=#{employee.employee_id}";
    @Update(sql2)
    int Update(@Param("employee") final Employee employee);

    @Delete("delete from employees where employee_id = #{employeeId}")
    int Delete(@Param("employeeId") final Integer employeeId);
}





