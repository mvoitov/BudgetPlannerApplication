/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.budgetplanner.app;

import org.apache.wicket.Session;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.model.PropertyModel;

/**
 *
 * @author Maxim
 */
public class BasePage extends WebPage implements AuthenticatedWebPage {

    public BasePage() {

        add(new BookmarkablePageLink("income", Income.class));
        add(new BookmarkablePageLink("financialCommitments", FinancialCommitments.class));
        add(new BookmarkablePageLink("homeUtilities", HomeUtilities.class));
        add(new BookmarkablePageLink("educationHealth", EducationHealth.class));
        add(new BookmarkablePageLink("shoppingTransport", ShoppingTransport.class));
        add(new BookmarkablePageLink("entertainmentEatingOut", EntertainmentEatingOut.class));
        add(new BookmarkablePageLink("results", Results.class));

        Form<?> form = new Form("basePageForm");
        form.add(new Label("incomeLabel", new PropertyModel<Integer>(Income.incomeFields, "incomeTotal")));
        form.add(new Label("financialCommLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "financialCommitmentsTotal")));
        form.add(new Label("homeUtilitiesLabel", "0"));
        form.add(new Label("educationHealthLabel", "0"));
        form.add(new Label("shoppingTransportLabel", "0"));
        form.add(new Label("entertainmentLabel", "0"));
        form.add(new Label("whatsLeftLabel", new PropertyModel<Integer>(Results.resultFields, "result")));

        add(form);

        add(new Button("saveBudgetButton") {
            public void onClick() {
                setResponsePage(BasePage.class);
            }
        });
        add(new Button("deleteBudgetbutton") {
            public void onClick() {
                info("ok");
            }
        });
        add(new Button("editBudgetButton") {
            public void onClick() {
                info("ok");
            }
        });
        add(new Button("printBudgetButton") {
            public void onClick() {
                info("ok");
            }
        });
        if (((SignInSession) Session.get()).getUser().toString().isEmpty()) {
            setResponsePage(ErrorPage404.class);
        }
        add(new Label("whoiam", ((SignInSession) Session.get()).getUser().toString()));
        add(new Label("footer", "All copyrights are reserved by © "));
    }
}
