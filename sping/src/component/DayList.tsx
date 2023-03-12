import {Link} from "react-router-dom";
import useFetch from "../hooks/useFetch";

export interface IDay {
    "day": number;
    "id": number;
}
export default function DayList(){
    // const [days, setDays] = useState([]);

    // useEffect(() =>{
    //   fetch(`http://localhost:3001/days`)
    //       .then(res => {
    //           return res.json();
    //       })
    //       .then(data => {
    //           setDays(data);
    //       });
    //   },[]);
    //카운트가 변경될떄만 이함수가 실행
    //의존성 배열?
    const days : IDay[] = useFetch("http://localhost:3001/days");

    if(days.length ===0 ){
        return <span>Loading....</span>;
    }
    return (
        <ul className = "list_day">
            {days.map(day => (
                <li key={day.id}>
                    <Link to={`/day/${day.day}`}> Day {day.day}</Link>
                </li>
            ))}
        </ul>
    );
}

