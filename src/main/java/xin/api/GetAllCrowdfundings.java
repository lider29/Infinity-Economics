


package xin.api;

import xin.Account;
import xin.Currency;
import xin.db.DbIterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONStreamAware;
import xin.db.SortClause;
import xin.db.SortType;

import javax.servlet.http.HttpServletRequest;

public final class GetAllCrowdfundings extends APIServlet.APIRequestHandler {

    static final GetAllCrowdfundings instance = new GetAllCrowdfundings();

    private GetAllCrowdfundings() {
        super(new APITag[]{APITag.CF}, "firstIndex", "lastIndex", "includeCounts", "account", "includeAmounts");
    }

    @Override
    protected JSONStreamAware processRequest(HttpServletRequest req) throws ParameterException {

        int firstIndex = ParameterParser.getFirstIndex(req);
        int lastIndex = ParameterParser.getLastIndex(req);
        Account account = ParameterParser.getAccount(req, false);
        boolean includeCounts = "true".equalsIgnoreCase(req.getParameter("includeCounts"));
        boolean includeAmounts="true".equalsIgnoreCase(req.getParameter("includeAmounts"));
        String order = ParameterParser.getSortOrder(req, SortType.CURRENCY);
        String orderColumn = ParameterParser.getSortColumn(req, SortType.CURRENCY);


        JSONObject response = new JSONObject();
        JSONArray currenciesJSONArray = new JSONArray();
        response.put("currencies", currenciesJSONArray);
        try (DbIterator<Currency> currencies = Currency.getAllCrowdFundingCurrencies(account != null ? account.getId()
                : null, firstIndex, lastIndex,new SortClause(orderColumn,order))) {
            for (Currency currency : currencies) {
                currenciesJSONArray.add(JSONData.currency(currency, includeCounts, includeAmounts));
            }
        }
        return response;
    }

}
