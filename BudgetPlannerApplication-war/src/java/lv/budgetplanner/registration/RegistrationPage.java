/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.budgetplanner.app;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.form.validation.EqualPasswordInputValidator;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;

/**
 *
 * @author Maxim
 */
public final class RegistrationPage extends WebPage {
    
    public RegistrationPage(final PageParameters parameters) {
        
        
        
        final TextField<String> username = new TextField<String>("username", Model.of(""));
        final PasswordTextField password = new PasswordTextField("password", Model.of(""));
        final PasswordTextField cpassword = new PasswordTextField("cpassword", Model.of(""));
        username.setRequired(true);
        password.setRequired(true);
        username.add(new UsernameValidator());
        password.add(new PasswordValidator());
        cpassword.add(new PasswordValidator());
        Form<?> form = new Form<Void>("registrationForm") {
            @Override
            protected void onSubmit() {
                final String usernameValue = username.getModelObject();
                final String passwordValue = password.getModelObject();
                
                PageParameters pp = new PageParameters();
                pp.add("username", usernameValue);
                pp.add("password", passwordValue);
                if (DataBase.usernameIsNotAlreadyTaken(usernameValue)) {
                    DataBase.insertRecordIntoDbUserTable(usernameValue, passwordValue);
                    setResponsePage(SuccessPage.class, pp);
                } else {
                    String erromsg = "Username you entered is already used. Plase choose another one.";
                    error(erromsg);
                }
                
            }
        };
        add(form);
        form.add(new FeedbackPanel("feedback"));
        form.add(username);
        form.add(password);
        form.add(cpassword);
        form.add(new EqualPasswordInputValidator(password, cpassword));
    }
}
