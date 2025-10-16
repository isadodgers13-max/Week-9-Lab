<html>
<head><title>Polls</title></head>
<body>
    <h2><a href="/create">Create Poll</a></h2>
    <table border="1" cellpadding="8">
        <tr><th>Question</th><th>Action</th></tr>
        @for(poll : polls) {
            <tr>
                <td><a href="/poll/${poll.id}">${poll.question}</a></td>
                <td><a href="/poll/${poll.id}/add">Add Answers</a></td>
            </tr>
        }
    </table>
</body>
</html>
