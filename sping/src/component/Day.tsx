import {useParams} from "react-router-dom";
import Word, {IWord} from "./Word";
import useFetch from "../hooks/useFetch";
export default function Day (){

    // const day = useParams().day; //아래와 같은문법
    const {day} = useParams<{day : string}>();
    // const wordList = dummy.words.filter(word => word.day == day);
    // const [words,setWords] = useState();
    //
    // useEffect(()=>{
    //     fetch(`http://localhost:3001/words?day=${day}`)
    // .then(res => {
    //         return res.json();
    //     })
    //         .then(data => {
    //             setWords(data);
    //         });
    // },[day]);
    const words : IWord[] = useFetch(`http://localhost:3001/words?day=${day}`);
    return(
        <>
            <h2>Day {day}</h2>
            {words.length === 0 && <span>Loading ...</span>}
            <table>
                <tbody>
                {words.map(word =>(
                    <Word word={word} key = {word.id}/>
                ))}
                </tbody>
            </table>
        </>
    );
}