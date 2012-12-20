/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.budgetplanner.login;

import lv.budgetplanner.registration.RegistrationPage;
import lv.budgetplanner.db.DataBase;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.util.value.ValueMap;

/**
 *
 * @author Maxim
 */
public final class SignIn extends WebPage {

    public SignIn() {
        add(new SignInForm("signInForm"));
    }

    public final class SignInForm extends Form<Void> {

        private static final String USERNAME = "username";
        private static final String PASSWORD = "password";
        private final ValueMap properties = new ValueMap();

        public SignInForm(final String id) {
            super(id);
            add(new FeedbackPanel("feedback"));
            add(new Link("registrationPage") {
                @Override
                public void onClick() {
                    setResponsePage(RegistrationPage.class);
                }
            });
            add(new TextField<String>(USERNAME, new PropertyModel<String>(properties, USERNAME)));
            add(new PasswordTextField(PASSWORD, new PropertyModel<String>(properties, PASSWORD)));
        }

        @Override
        public final void onSubmit() {
            SignInSession session = getMySession();

            if (session.signIn(getUsername(), getPassword())) {
                DataBase.getPageReadyBeforeResponse();
                setResponsePage(getApplication().getHomePage());
            } else {
                String errmsg = getString("loginError", null, "Incorrect username or password.");

                error(errmsg);
            }
        }

        private String getPassword() {
            return properties.getString(PASSWORD);
        }

        private String getUsername() {
            return properties.getString(USERNAME);
        }

        private SignInSession getMySession() {
            return (SignInSession) getSession();
        }
    }
}
