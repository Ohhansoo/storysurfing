import logo from './logo.svg';
import './App.css';
import Hello from "../src/component/Hello";
import Welcome from "../src/component/Welcome";

function App() {
    const name = "Inhyo";
    return (
        <div className="App">
            <header className="App-header">
                <img src={logo} className="App-logo" alt="logo"/>
                <p>
                    Edit <code>src/App.js</code> and save to reload.
                </p>
                <a
                    className="App-link"
                    href="https://reactjs.org"
                    target="_blank"
                    rel="noopener noreferrer"
                >
                    Learn React
                </a>
                <h1
                    style={{
                        color: "rgba(32,110,142,0.36)",
                        backgroundColor: "green"
                    }}
                >
                    Helllo,{name}.

                </h1>
                <Hello/>
                <Hello/>
                <Welcome/>
                <Welcome/>
                <Welcome/>
            </header>
        </div>
    );
}

export default App;
