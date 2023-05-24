import {Link, useParams} from "react-router-dom";

export function WelcomeComponent() {
    const {username} = useParams();
    return (
        <div className={"WelcomeComponent"}>
            <h1>Welcome {username}</h1>
            <div>
                Manage your todos - <Link to={"/todos"}>Go here</Link>
            </div>
        </div>
    )
}