# API Fever
Simple api that lets a user login using facebook and once authenticated returns a list of movies

----------

Endpoints available
-------------
    - GET token from facebook:
    curl -X POST https://graph.facebook.com/oauth/access_token -d "client_id=233668646673605&client_secret=33b17e044ee6a4fa383f46ec6e28ea1d&grant_type=client_credentials&redirect_uri=http://localhost:8080/login
    - Once you have the token you should be able to make a call to you app using the token. I was not able to do
    that using the command line. This is what I tried
    curl -H "X-Auth-Token: 233668646673605|tVKq25C4ckTu6FM-xBATGbDCsCQ" http://localhost:8080/login/

Build
-------------
    ./gradlew clean build

Run
-------------
     Execute ./gradlew bootRun
