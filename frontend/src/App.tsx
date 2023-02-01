import React from 'react';
// import logo from './logo.svg';
import books from './books.jpeg';
import './App.css';

function App() {
  return (

    <div className="App">
      <header className="App-header">
        <img src={books} className="App-logo" alt="logo" />
        <p>

        </p>
        <a
          className="App-link"
          href="https://docs.google.com/document/d/1iGOXsVlaHPF1I7RiFPhdDv4_K-RHXmBlmblEqcTHugI/edit"
          target="_blank"
          rel="noopener noreferrer"
        >
          Book Review App
        </a>
      </header>
    </div>
  );
}

export default App;
