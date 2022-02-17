import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public final class Employees
{
    
    public List<Employee> allEmployees()
    {
        final List<Employee> employeeList = new ArrayList<>();
        
        employeeList.add( new Employee( "Mary", 2015 ) );
        employeeList.add( new Employee( "Bob", 2020 ) );
        employeeList.add( new Employee( "Emily", 2016 ) );
        employeeList.add( new Employee( "John", 2014 ) );
        employeeList.add( new Employee( "Lee", 2021 ) );
        
        return Collections.unmodifiableList( employeeList );
    }
    
}
