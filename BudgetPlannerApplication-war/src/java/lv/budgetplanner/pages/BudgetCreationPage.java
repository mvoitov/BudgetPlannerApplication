/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.budgetplanner.pages;

import lv.budgetplanner.app.BasePage;
import lv.budgetplanner.db.DataBase;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.PropertyModel;

/**
 *
 * @author Maxim
 */
public final class BudgetCreationPage extends WebPage {

    private String budgetName;

    public BudgetCreationPage() {
        Form<?> form = new Form("budgetCreationForm") {
            @Override
            protected void onSubmit() {
                if (DataBase.saveBudget(budgetName) == true) {
                    setResponsePage(BasePage.class);
                }
            }
        };
        form.add(new FeedbackPanel("feedback"));
        form.add(new Link("homePage") {
            @Override
            public void onClick() {
                setResponsePage(BasePage.class);
            }
        });
        form.add(new TextField<String>("budgetName", new PropertyModel<String>(this, "budgetName")));
        add(form);
    }
}
