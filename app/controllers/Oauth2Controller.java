package controllers;

import jp.eisbahn.oauth2.server.endpoint.Token;
import jp.eisbahn.oauth2.server.fetcher.clientcredential.ClientCredentialFetcherImpl;
import jp.eisbahn.oauth2.server.granttype.impl.DefaultGrantHandlerProvider;
import jp.eisbahn.oauth2.server.play.PlayRequestAdapter;
import mypackage.MyDataHandlerFactory;
import play.Logger.ALogger;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

public class Oauth2Controller extends Controller {

    private static final ALogger logger = play.Logger.of(Oauth2Controller.class);

    public Result accessToken() {
        logger.info("accessToken start");
        Http.Request request = request();
        PlayRequestAdapter adapter = new PlayRequestAdapter(request);

        Token token = new Token();
        token.setDataHandlerFactory(new MyDataHandlerFactory());
        token.setClientCredentialFetcher(new ClientCredentialFetcherImpl());
        token.setGrantHandlerProvider(new DefaultGrantHandlerProvider());

        Token.Response response = token.handleRequest(adapter);
        int code = response.getCode();
        String body = response.getBody();

        logger.info("accessToken end {}, {}", code, body);
        return ok("Got request " + request() + "!");
    }
}
