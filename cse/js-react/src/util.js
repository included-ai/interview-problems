const timeout = ms =>
    new Promise( resolve => setTimeout( resolve, ms ) );


export const fetchUsers = async () =>
{
    await timeout( 700 );

    const response =
    {
        users: [
            { id: 1, name: 'Fedor', country_id: 100 },
            { id: 2, name: 'Adam', country_id: 101 },
            { id: 3, name: 'Scarlet', country_id: 102 }
        ]
    };

    console.log('fetchUsers:', response);
    return response;
};

export const fetchCounries = async () =>
{
    await timeout( 1000 );

    const response =
    {
        countries: [
            { id: 103, name: 'France', office_count: 2 },
            { id: 101, name: 'UK', office_count: 5 },
            { id: 100, name: 'USA', office_count: 10 },
            { id: 102, name: 'Spain', office_count: 1 }
        ]
    };

    console.log('fetchCounries:', response);
    return response;
};

export const fetchGroups = async () =>
{
    await timeout( 500 );

    const response =
    {
        groups: [ 'Main', 'Admins', 'Development', 'Sales' ]
    };

    console.log('fetchGroups:', response);
    return response;
};
