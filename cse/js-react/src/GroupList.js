import React from 'react';

const GroupList = props =>
{
    const { data } = props;

    return (
        <div className="groups-container">
            <span className="title">Groups:</span>

            {
                data.map(
                    (item, index) => (
                        <div id={ index }>
                            <span className="label">group:</span>
                            { item.name }
                        </div>
                    )
                )
            }
        </div>
    );
};

export default GroupList;
