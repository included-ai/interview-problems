import React from 'react';

const UserList = props =>
{
    const { users = [], countries = [] } = props;

    const getCountry = countryId =>
    {
        const country = countries.filter( country => country.id === countryId )[0];
        return country || { name: '', office_count: '' };
    }

    return (
        <div className="users-container">
            <span className="title">
                Users:
            </span>

            <ul className="user-list">
            {
                users.map(
                    (item, index) =>
                    {
                        const country = getCountry( item.country_id );
                        return (
                            <li id={ index }>
                                <span className="label">name:</span>
                                { item.name }
                                <span className="label">country:</span>
                                { country.name }
                                <span className="label">number of offices:</span>
                                { country.office_count }
                            </li>
                        )
                    }
                )
            }
            </ul>
        </div>
    );
};

export default UserList;
