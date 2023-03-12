import {useState} from "react";

import UserName from "./UserName";
export default function ChangeName({age}) {
    const [name, setName] = useState("Mike");
    const msg = age > 19 ? "성인 입니다" : "미성년자 입니다";
    function changeName(){
        setName(name === "Mike" ? "Jane" : "Mike");
        // setAge(age+1);
    }


    return (
        <div>
            <h2 id="name">
                {name}({age}) : {msg}
            </h2>
            <UserName name={name}/>
            <button onClick={changeName}>Change</button>
        </div>
    );
}