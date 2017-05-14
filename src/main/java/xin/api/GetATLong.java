package xin.api;

import org.json.simple.JSONStreamAware;
import xin.XinException;

import javax.servlet.http.HttpServletRequest;

public final class GetATLong extends APIServlet.APIRequestHandler {

    static final GetATLong instance = new GetATLong();

    private GetATLong() {
        super(new APITag[] {APITag.AT}, "hexString");
    }

    @Override
    protected JSONStreamAware processRequest(HttpServletRequest req) throws XinException {
        return JSONData.hex2long(ParameterParser.getATLong(req));
    }
    
    

}
