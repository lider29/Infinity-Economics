package xin.api;

import org.json.simple.JSONStreamAware;
import xin.XinException;

import javax.servlet.http.HttpServletRequest;

public class GetATDetails extends APIServlet.APIRequestHandler {
	static final GetATDetails instance = new GetATDetails();

    private GetATDetails() {
        super(new APITag[] {APITag.AT}, "at");
    }

    @Override
    protected JSONStreamAware processRequest(HttpServletRequest req) throws XinException {
        return JSONData.at(ParameterParser.getAT(req));
    }
}
