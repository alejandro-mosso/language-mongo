#Environment set up
<ul>
    <li>If Docker service is not started, run below commands:
        <br/><code><b>$</b> sudo service docker start</code>
        <br/><code><b>$</b> sudo service docker status</code>
    </li>
    <li>Run following commands under language-mongo:
        <br/><code><b>$</b> docker-compose build</code>
        <br/><code><b>$</b> docker-compose up</code>
        <br/><code><b>$</b> docker-compose rm</code>
        <br/><code><b>$</b> docker run -t -i language-mongo_app /bin/bash <a style="color: #00FF00"> # Log in to a running image </a></code>
        <br/><code><b>$</b> docker ps <a style="color: #00FF00"> # List running container's ids</a></code>
        <br/><code><b>$</b> docker commit &lt;CONTAINER ID> mysnapshot <a style="color: #00FF00"> # Creates an image from a container </a></code>
    </li>
</ul>

