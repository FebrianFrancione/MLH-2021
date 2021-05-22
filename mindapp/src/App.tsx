import React from 'react';

import Jumbotron from 'react-bootstrap/Jumbotron';
import Container from 'react-bootstrap/Container';
import ButtonsShowcase from './showcases/Buttons';
import ToastsShowcase from './showcases/Toasts';
import 'bootstrap/dist/css/bootstrap.min.css';

const App: React.FC = () => {
  return (
    <Container className="p-3">
      <Jumbotron>
        <h1 className="header">
          Welcome To GoMommy
        </h1>
      </Jumbotron>
      <h2>Buttons</h2>
      {/* We could use these as markers add them under each "toast" like going not going or wtv */}
      <ButtonsShowcase />
      <h2>Sports</h2>
      {/* Here we add the individual sports/events etc */}
      <ToastsShowcase />
      <h2>Herbs</h2>
      {/* Here we add the herbs for different ailments etc */}
      <ToastsShowcase />
    </Container>
  );
};

export default App;
