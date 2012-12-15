/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.budgetplanner.app;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.request.mapper.parameter.PageParameters;

/**
 *
 * @author Maxim
 */
public final class SuccessPage extends WebPage {

    public SuccessPage(final PageParameters parameters) {
        String username = "";
        String password = "";

        if (parameters.get("username") != null) {
            username = parameters.get("username").toString();
        }
        if (parameters.get("password") != null) {
            password = parameters.get("password").toString();
        }
        final Label resultUsername = new Label("resultUsername", "Your username is " + username);
        final Label resultPassword = new Label("resultPassword"," and your password is " + password + ".");
        add(resultUsername);
        add(resultPassword);
        add(new Link("toHomePage") {
            @Override
            public void onClick() {
            setResponsePage(BasePage.class);
            }
        });
    }
}
