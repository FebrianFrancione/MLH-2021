import React, { useState } from 'react';

import Toast from 'react-bootstrap/Toast';
import Button from 'react-bootstrap/Button';

const ToastsShowcase: React.FC = () => {
    const [show, toggleShow] = useState(true);

    return (
        <>
            {!show && <Button onClick={() => toggleShow(true)}>Show Toast</Button>}
            {/*
    // @ts-ignore */}
            <Toast show={show} onClose={() => toggleShow(false)}>
                <Toast.Header>
                    <img src="holder.js/20x20?text=%20" className="rounded mr-2" alt="" />
                    <strong className="mr-auto">sportname </strong>
                    {/* Sportname = passed parameters for when an event is created for the type of sport as well as the body msg below / can also be herbs*/}

                    <small>11 mins ago</small>
                </Toast.Header>
                <Toast.Body>Hello, world! This is a toast message.</Toast.Body>
            </Toast>
        </>
    );
};

export default ToastsShowcase;