import React, { useState } from 'react';

function WritePost() {
    const [title, setTitle] = useState('');
    const [content, setContent] = useState('');

    const handleSubmit = (event) => {
        event.preventDefault();
        // submit form data here
    };

    return (
        // <form onSubmit={handleSubmit}>
        //     <label>
        //         Title:
        //         <input
        //             type="text"
        //             value={title}
        //             onChange={(event) => setTitle(event.target.value)}
        //         />
        //     </label>
        //     <label>
        //         Content:
        //         <textarea
        //             value={content}
        //             onChange={(event) => setContent(event.target.value)}
        //         />
        //     </label>
        //     <button type="submit">Submit</button>
        // </form>
        <div>
            <h1>Write a post</h1>
            <WritePost />
        </div>
    );
}

export default WritePost;