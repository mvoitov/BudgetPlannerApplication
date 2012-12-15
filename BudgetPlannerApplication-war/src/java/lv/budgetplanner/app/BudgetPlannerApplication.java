/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.budgetplanner.app;

import org.apache.wicket.Component;
import org.apache.wicket.Page;
import org.apache.wicket.RestartResponseAtInterceptPageException;
import org.apache.wicket.Session;
import org.apache.wicket.authorization.Action;
import org.apache.wicket.authorization.IAuthorizationStrategy;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.request.Request;
import org.apache.wicket.request.Response;
import org.apache.wicket.request.component.IRequestableComponent;

/**
 *
 * @author Maxim
 */
public final class BudgetPlannerApplication extends WebApplication {

    @Override
    public Class<? extends Page> getHomePage() {
        return BasePage.class;
    }

    @Override
    public Session newSession(Request request, Response response) {
        return new SignInSession(request);
    }

    @Override
    protected void init() {
        super.init();
        mountPage("/error404", ErrorPage404.class);
        getSecuritySettings().setAuthorizationStrategy(new IAuthorizationStrategy() {
            public boolean isActionAuthorized(Component component, Action action) {
                return true;
            }

            public <T extends IRequestableComponent> boolean isInstantiationAuthorized(
                    Class<T> componentClass) {
                if (AuthenticatedWebPage.class.isAssignableFrom(componentClass)) {
                    if (((SignInSession) Session.get()).isSignedIn()) {
                        return true;
                    }

                    throw new RestartResponseAtInterceptPageException(SignIn.class);
                }

                return true;
            }
        });

    }
}
