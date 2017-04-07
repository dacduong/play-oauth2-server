package mypackage;

import jp.eisbahn.oauth2.server.data.DataHandler;
import jp.eisbahn.oauth2.server.data.DataHandlerFactory;
import jp.eisbahn.oauth2.server.models.Request;

public class MyDataHandlerFactory implements DataHandlerFactory {
    @Override
    public DataHandler create(Request request) {
        return new MyDataHandler(request);
    }
}
