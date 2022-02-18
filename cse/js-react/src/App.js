
import React, { useState, useEffect } from 'react';

import { fetchUsers, fetchCounries, fetchGroups } from './util';
import UserList from './UserList';
import GroupList from './GroupList';
import './App.css';

const App = props =>
{
    const [ users, setUsers ] = useState( [] );
    const [ countries, setCountries ] = useState( [] );
    const [ groups, setGroups ] = useState( [] );

    useEffect
    (
        () =>
        {
            fetchUsers().then
            (
                userResponse =>
                {
                    setUsers( userResponse.users );

                    fetchCounries().then
                    (
                        countriesResponse =>
                        {
                            setCountries( countriesResponse.countries );

                            fetchGroups().then
                            (
                                groupsResponse =>
                                {
                                    setGroups( groupsResponse.groups );
                                }
                            );
                        }
                    );
                }
            );
        }, []
    );

    return (
        <div className="app">
            <div className="main">
                <UserList
                    users={ users }
                    countries={countries}
                />
                <GroupList data={ groups } />
            </div>
        </div>
    );
};

export default App;
