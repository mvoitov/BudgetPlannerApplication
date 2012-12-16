/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.budgetplanner.app;

import java.util.Arrays;
import java.util.List;
import org.apache.wicket.Session;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.model.PropertyModel;

/**
 *
 * @author Maxim
 */
public class BasePage extends WebPage implements AuthenticatedWebPage {

    private static final List<String> BUDGET_PLANNER_NAMES = DataBase.selectBudgetPlannersNames(((SignInSession) Session.get()).getUser().toString());
    private static final List<String> budgetPlannerFrequences = Arrays.asList("Anual", "Week", "Fortnight", "Month", "Quarter");
    private String selected = BUDGET_PLANNER_NAMES.get(0);
    private String budgetName;
    private String selectedFrequency = "Annual";

    public BasePage() {

        add(new BookmarkablePageLink("income", Income.class));
        add(new BookmarkablePageLink("financialCommitments", FinancialCommitments.class));
        add(new BookmarkablePageLink("homeUtilities", HomeUtilities.class));
        add(new BookmarkablePageLink("educationHealth", EducationHealth.class));
        add(new BookmarkablePageLink("shoppingTransport", ShoppingTransport.class));
        add(new BookmarkablePageLink("entertainmentEatingOut", EntertainmentEatingOut.class));
        add(new BookmarkablePageLink("results", Results.class));

        DropDownChoice<String> budgetFrequences = new DropDownChoice<String>("budgetFrequences", new PropertyModel<String>(this, "selectedFrequency"), budgetPlannerFrequences);
        Form<?> form = new Form("basePageForm");

        form.add(budgetFrequences);
        form.add(new Label("incomeLabel", new PropertyModel<Integer>(Income.incomeFields, "incomeTotal")));
        form.add(new Label("financialCommLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "financialCommitmentsTotal")));
        form.add(new Label("homeUtilitiesLabel", "0"));
        form.add(new Label("educationHealthLabel", "0"));
        form.add(new Label("shoppingTransportLabel", "0"));
        form.add(new Label("entertainmentLabel", "0"));
        form.add(new Label("whatsLeftLabel", new PropertyModel<Integer>(Results.resultFields, "result")));
        form.add(new Label("per", "Year"));
        add(form);

        DropDownChoice<String> budgetPlannerNames = new DropDownChoice<String>("budgetPlannersNamesSelector", new PropertyModel<String>(this, "selected"), BUDGET_PLANNER_NAMES);

        add(budgetPlannerNames);

        add(new Button("saveBudgetButton") {
            public void onClick() {
                if (DataBase.saveBudget(budgetName) == false) {
                    setResponsePage(BudgetHasBeenSavedSuccessfully.class);
                }
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

        if (((SignInSession) Session.get()).getUser().toString().isEmpty()) {
            setResponsePage(ErrorPage404.class);
        }
        add(new Label("whoiam", ((SignInSession) Session.get()).getUser().toString()));
        add(new Label("footer", "All copyrights are reserved by © "));
    }
}
