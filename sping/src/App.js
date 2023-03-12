import './App.css';
// import Hello from "../src/component/Hello";
// import Welcome from "../src/component/Welcome";
// import styles from "./App.module.css";
// import ChangeName from "./component/ChangeName";
import DayList from "./component/DayList";
import Day from "./component/Day";
import Header from "./component/Header";
import EmptyPage from "./component/EmptyPage";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import CreateWord from "./component/CreateWord";
import CreateDay from "./component/CreateDay";
function App() {
    return (
        <BrowserRouter>
            <div className="App">
                <Header/>
                <Routes>
                    <Route path="/" element={<DayList/>} />
                    <Route path="/day/:day" element={<Day/>} />
                    <Route path="/create_word" element={<CreateWord/>} />
                    <Route path="/create_day" element={<CreateDay/>} />
                    <Route path="*"  element={<EmptyPage/>} /> //이건 제일밑에 적을것
                </Routes>
                {/*//Footerwㅏ리*/}
            </div>
        </BrowserRouter>
    );
}

// <a
//     className="App-link"
//     href="https://reactjs.org"
//     target="_blank"
//     rel="noopener noreferrer"
// >Node Home
// </a>
// <h1
//     style={{
//         color: "rgba(#f2f2f2",K
//         borderRight : '2px solid #000',
//         marginBottom : '50px',
//         backgroundColor: "Blue"
//     }}
// >
//     Helllo,{naver.name}
// </h1>
// <a href={naver.url}>{naver.name}</a>
export default App;
