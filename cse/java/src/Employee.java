public final class Employee
{

    private final String name;
    private final int startYear;


    public Employee( final String name, final int startYear )
    {
        this.name = name;
        this.startYear = startYear;
    }


    public String name()
    {
        return this.name;
    }


    public int startYear()
    {
        return this.startYear;
    }

}
