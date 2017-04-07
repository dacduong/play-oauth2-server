# play-oauth2-server
Sample code OAuth2 Server for Playframework
[OAuth2 Server](https://github.com/dacduong/oauth2-server)

## Usage
```
sbt run

Password type:
http://localhost:9000/oauth2/access-token?client_id=123456&grant_type=password&client_secret=112233&redirect_uri=http://abc.com&username=user&password=pass

Authorization Code type:
http://localhost:9000/oauth2/access-token?client_id=123456&grant_type=authorization_code&client_secret=112233&redirect_uri=http://abc.com&code=1234abcde
```