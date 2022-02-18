import java.util.*;


public class Main
{

    public static void main( final String[] args )
    {
        new Main().run();
    }
    
    
    public void run()
    {
        var company = new Company
        (
            List.of
            (
                new Employee( "Mary", 2015 ),
                new Employee( "Bob", null ),
                new Employee( "Emily", 2016 ),
                new Employee( "John", 2014 ),
                new Employee( "Lee", 2021 )
            )
        );
        
        final Employee employee1 = company.findByName( "Emily" );
        final Employee employee2 = company.findByName( "Bob" );
        final Employee employee3 = company.findByName( "Darek" );
        final Employee employee4 = company.findByName( "Lee" );
        
        final List<Employee> selectedEmployees = new ArrayList<>();
        addEmployeeToList( employee1, selectedEmployees );
        addEmployeeToList( employee2, selectedEmployees );
        addEmployeeToList( employee3, selectedEmployees );
        addEmployeeToList( employee4, selectedEmployees );
        
        final Employee mostExperiencedEmployeeFromSelected = findMostExperiencedEmployee( selectedEmployees );
        assertEquals( new Employee( "Emily", 2016 ), mostExperiencedEmployeeFromSelected );

        var company2 = new Company( Collections.emptyList() );
        var companiesRatings = new HashMap<Company, Integer>();
        companiesRatings.put( company, 5 );
        companiesRatings.put( company2, 4 );

        company2.addEmployee( new Employee( "Jane", 2022 ) );
        assertEquals( 1, company2.allEmployees().size() );

        assertEquals( 4, companiesRatings.get( company2 ) );
        
        System.out.println( "Task completed!" );
    }
    
    
    private void addEmployeeToList( final Employee employee, final List<Employee> list )
    {
        list.add( employee );
    }
    
    
    private Employee findMostExperiencedEmployee( final List<Employee> employees )
    {
        return employees.stream().max( Comparator.comparing( Employee::startYear ) ).orElse( null );
    }


    public static void assertEquals( Object expected, Object actual )
    {
        if( ! Objects.equals( expected, actual ) )
        {
            throw new IllegalArgumentException( "Expected: " + expected + " but got: " + actual );
        }
    }
}
