import World from "./World";
import Welcome from "./Welcome";
import styles from "../Hello.module.css";
// const Hello = function   () {<p>Hello</p>}

// const Hello = () => {<p>Hello</p>}


export default function Hello(){
    function showName(){
        console.log("Mike");
    }
    function showAge(){
        console.log("getAge");
    }
    function showText(txt){
        console.log(txt);
    }
    return (
    <div>
        <h1>state</h1>
        <h2>컴포넌트의 속성값</h2>
        <div>
            <button onClick ={showName()}>Show name</button>
            <button onClick ={showAge()}>Show Age </button>
        </div>
            <input type="text" onChange={e =>{
                const txt = e.target.value;
                showText(txt);
            }}
            />
    </div>
    );
}


