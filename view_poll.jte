<html>
<head><title>View Poll</title></head>
<body>
    <h2>${poll.question}</h2>
    <form>
        @if(poll.singleChoice) {
            @for(answer : poll.answers) {
                <label><input type="radio" name="choice">${answer}</label><br>
            }
        } else {
            @for(answer : poll.answers) {
                <label><input type="checkbox" name="choice">${answer}</label><br>
            }
        }
    </form>
    <p><a href="/">Back to Polls</a></p>
</body>
</html>
