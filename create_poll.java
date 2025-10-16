<html>
<head><title>Create Poll</title></head>
<body>
    <h2>Create Poll</h2>
    <form method="post" action="/create">
        Question: <input type="text" name="question" required><br><br>
        <label>
            <input type="checkbox" name="singleChoice"> Single-Choice
        </label><br><br>
        <button type="submit">Create</button>
    </form>
    <p><a href="/">Back to Polls</a></p>
</body>
</html>
