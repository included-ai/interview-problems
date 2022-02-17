import java.util.ArrayList;
import java.util.List;


public class Main
{

    public static void main( final String[] args )
    {
        new Main().run();
    }
    
    
    public void run()
    {
        final List<Employee> allEmployees = new Employees().allEmployees();
        
        final Employee employee1 = findEmployeeWithName( allEmployees, "Emily" );
        final Employee employee2 = findEmployeeWithName( allEmployees, "Bob" );
        final Employee employee3 = findEmployeeWithName( allEmployees, "Darek" );        
        final Employee employee4 = findEmployeeWithName( allEmployees, "Lee" );
        
        final List<Employee> selectedEmployees = new ArrayList<>();
        addEmployeeToList( employee1, selectedEmployees );
        addEmployeeToList( employee2, selectedEmployees );
        addEmployeeToList( employee3, selectedEmployees );
        addEmployeeToList( employee4, selectedEmployees );
        
        final Employee mostExperiencedEmployeeFromSelected = findMostExperiencedEmployee( selectedEmployees );
        
        final String expectedMostExperiencedEmployeeName = "Emily";
        final int expectedMostExperiencedEmployeeStartYear = 2016;
        
        if( ! expectedMostExperiencedEmployeeName.equals( mostExperiencedEmployeeFromSelected.name() )
            || expectedMostExperiencedEmployeeStartYear != mostExperiencedEmployeeFromSelected.startYear() )
        {

            throw new RuntimeException
            (
                String.format
                (
                    "Expected most experienced employee is '%s' with start year '%d'.",
                    expectedMostExperiencedEmployeeName,
                    expectedMostExperiencedEmployeeStartYear
                )
            );
        }
        
        System.out.println( "Task completed!" );
    }
    
    
    private void addEmployeeToList( final Employee employee, final List<Employee> list )
    {
        list.add( employee );
    }
    
    
    private Employee findEmployeeWithName( final List<Employee> employees, final String requiredName )
    {
        for( int i = 0; i <= employees.size(); i++ )
        {
            final Employee employee = employees.get( i );
            
            if( employee.name().equals( requiredName ) )
            {
                return employee;
            }
        }
        
        return null;
    }
    
    
    private Employee findMostExperiencedEmployee( final List<Employee> employees )
    {
        Employee mostExperienced = null;
        
        for( int i = 0; i <= employees.size(); i++ )
        {
            final Employee employee = employees.get( i );
            
            if( mostExperienced == null || mostExperienced.startYear() < employee.startYear() )
            {
                mostExperienced = employee;
            }
        }
        
        return mostExperienced;
    }
}
