import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public final class Company
{
    private final List<Employee> employees;


    public Company( List<Employee> employees )
    {
        this.employees = employees;
    }


    public List<Employee> allEmployees()
    {
        return new ArrayList<>( this.employees );
    }


    public void addEmployee( Employee employee )
    {
        this.employees.add( employee );
    }


    public Employee findByName( String name )
    {
        for( int i = 0; i <= this.employees.size(); i++ )
        {
            final Employee employee = this.employees.get( i );

            if( employee.name().equals( name ) )
            {
                return employee;
            }
        }

        return null;
    }


    @Override

    public boolean equals(Object o)
    {
        if ( this == o ) return true;
        if ( ! ( o instanceof Company company ) ) return false;
        return Objects.equals( this.employees, company.employees );
    }


    @Override

    public int hashCode()
    {
        return Objects.hash( this.employees );
    }
}
