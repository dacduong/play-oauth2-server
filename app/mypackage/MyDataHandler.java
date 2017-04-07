package mypackage;

import jp.eisbahn.oauth2.server.data.DataHandler;
import jp.eisbahn.oauth2.server.models.AccessToken;
import jp.eisbahn.oauth2.server.models.AuthInfo;
import jp.eisbahn.oauth2.server.models.Request;

import java.util.Date;

public class MyDataHandler extends DataHandler {

    public MyDataHandler(Request request) {
        super(request);
    }

    @Override
    public boolean validateClient(String clientId, String clientSecret, String grantType) {
        return true;
    }

    @Override
    public String getUserId(String username, String password) {
        return "user";
    }

    @Override
    public AuthInfo createOrUpdateAuthInfo(String clientId, String userId, String scope) {
        AuthInfo authInfo = new AuthInfo();
        authInfo.setScope("profile");
        authInfo.setRefreshToken("aaaabbbbcccc");
        authInfo.setClientId("123456");
        authInfo.setUserId("useridvalue");
        return authInfo;
    }

    @Override
    public AccessToken createOrUpdateAccessToken(AuthInfo authInfo) {
        AccessToken accessToken = new AccessToken();
        accessToken.setAuthId("qweertyyuuii");
        accessToken.setCreatedOn(new Date());
        accessToken.setExpiresIn(3600);
        accessToken.setToken("asdfghjjkklmnbbs");
        return accessToken;
    }

    @Override
    public AuthInfo getAuthInfoByCode(String code) {
        return null;
    }

    @Override
    public AuthInfo getAuthInfoByRefreshToken(String refreshToken) {
        return null;
    }

    @Override
    public String getClientUserId(String clientId, String clientSecret) {
        return null;
    }

    @Override
    public boolean validateClientById(String clientId) {
        return false;
    }

    @Override
    public boolean validateUserById(String userId) {
        return false;
    }

    @Override
    public AccessToken getAccessToken(String token) {
        return null;
    }

    @Override
    public AuthInfo getAuthInfoById(String id) {
        return null;
    }
}
