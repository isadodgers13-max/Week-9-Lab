<html>
<head><title>Add Answers</title></head>
<body>
    <p><a href="/">Back to Polls</a></p>
    <h2>${poll.question}</h2>

    <ul>
        @for(answer : poll.answers) {
            <li>${answer}</li>
        }
    </ul>

    <form method="post" action="/poll/${poll.id}/add">
        <input type="text" name="answer" required>
        <button type="submit">Add</button>
    </form>
</body>
</html>
