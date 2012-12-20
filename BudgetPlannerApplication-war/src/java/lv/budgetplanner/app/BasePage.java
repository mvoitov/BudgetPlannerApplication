/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.budgetplanner.app;

import lv.budgetplanner.login.SignInSession;
import lv.budgetplanner.error404.ErrorPage404;
import lv.budgetplanner.db.DataBase;
import java.util.List;
import lv.budgetplanner.pages.BudgetCreationPage;
import lv.budgetplanner.pages.EducationHealth;
import lv.budgetplanner.pages.EntertainmentEatingOut;
import lv.budgetplanner.pages.FinancialCommitments;
import lv.budgetplanner.pages.HomeUtilities;
import lv.budgetplanner.pages.Income;
import lv.budgetplanner.pages.Results;
import lv.budgetplanner.pages.ShoppingTransport;
import org.apache.wicket.Session;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.PropertyModel;

/**
 *
 * @author Maxim
 */
public class BasePage extends WebPage implements AuthenticatedWebPage {

    private static List<String> BUDGET_PLANNER_NAMES = DataBase.selectBudgetPlannersNames(null);
    private String selected = BUDGET_PLANNER_NAMES.get(0);

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
        form.add(new Label("homeUtilitiesLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "homeUtilitiesTotal")));
        form.add(new Label("educationHealthLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "educationHealthTotal")));
        form.add(new Label("shoppingTransportLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "shoppingTransportTotal")));
        form.add(new Label("entertainmentLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "entertainmentEatingOutTotal")));
        form.add(new Label("whatsLeftLabel", new PropertyModel<Integer>(Results.resultFields, "result")));
        form.add(new Label("per", "Year!"));

        add(form);

        if (((SignInSession) Session.get()).getUser().toString().isEmpty()) {
            setResponsePage(ErrorPage404.class);
        } else {
            BUDGET_PLANNER_NAMES = DataBase.selectBudgetPlannersNames(((SignInSession) Session.get()).getUser().toString());
        }

        DropDownChoice<String> budgetPlannerNames = new DropDownChoice<String>("budgetPlannersNamesSelector", new PropertyModel<String>(this, "selected"), BUDGET_PLANNER_NAMES);
        add(new Link("createBudgetButton") {
            @Override
            public void onClick() {
                setResponsePage(BudgetCreationPage.class);
            }
        });
        add(new Link("saveBudgetButton") {
            @Override
            public void onClick() {
                if (DataBase.saveBudget(selected) == true) {
                    success("Budget has been saved successfully!");
                } else {
                    error("Please be sure you entered correct name of new budget.");
                }
            }
        });
        add(new Link("deleteBudgetbutton") {
            @Override
            public void onClick() {
                if (DataBase.deleteBudget(selected) == true) {
                    success("Budget has been deleted successfully!");
                } else {
                    error("Please be sure you entered correct name of new budget.");
                }
            }
        });
        add(budgetPlannerNames);
        add(new Label("whoiam", ((SignInSession) Session.get()).getUser().toString()));
        add(new FeedbackPanel("feedback"));
        add(new Label("footer", "All copyrights are reserved by © "));
    }
}
