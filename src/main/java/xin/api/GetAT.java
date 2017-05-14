package xin.api;

import org.json.simple.JSONStreamAware;
import xin.XinException;

import javax.servlet.http.HttpServletRequest;

public final class GetAT extends APIServlet.APIRequestHandler {

    static final GetAT instance = new GetAT();

    private GetAT() {
        super(new APITag[] {APITag.AT}, "at");
    }

    @Override
    protected JSONStreamAware processRequest(HttpServletRequest req) throws XinException {
        return JSONData.at(ParameterParser.getAT(req));
    }

}
