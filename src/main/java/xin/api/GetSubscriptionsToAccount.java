package xin.api;

import xin.Account;
import xin.XinException;
import xin.Subscription;
import xin.db.DbIterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONStreamAware;

import javax.servlet.http.HttpServletRequest;

public final class GetSubscriptionsToAccount extends APIServlet.APIRequestHandler {
	
	static final GetSubscriptionsToAccount instance = new GetSubscriptionsToAccount();
	
	private GetSubscriptionsToAccount() {
		super(new APITag[] {APITag.ACCOUNTS}, "account");
	}
	
	@Override
    protected JSONStreamAware processRequest(HttpServletRequest req) throws XinException {
		
		Account account = ParameterParser.getAccount(req);
		
		JSONObject response = new JSONObject();
		
		JSONArray subscriptions = new JSONArray();
		
		DbIterator<Subscription> accountSubscriptions = Subscription.getSubscriptionsToId(account.getId());
		
		for(Subscription subscription : accountSubscriptions) {
			subscriptions.add(JSONData.subscription(subscription));
		}
		
		response.put("subscriptions", subscriptions);
		return response;
	}
}
