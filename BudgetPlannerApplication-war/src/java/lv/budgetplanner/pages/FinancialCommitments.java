/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.budgetplanner.app;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.model.PropertyModel;

/**
 *
 * @author Maxim
 */
public final class FinancialCommitments extends BasePage {

    public static OutgoingFields outgoingFields = new OutgoingFields();

    public FinancialCommitments() {
        Form<?> form = new Form("form") {
            @Override
            protected void onSubmit() {
                outgoingFields.rentMontageLabel = outgoingFields.rentMontageInput * outgoingFields.rentMontageFrequency;
                outgoingFields.carLoanRepaymentsLabel = outgoingFields.carLoanRepaymentsInput * outgoingFields.carLoanRepaymentsFrequency;
                outgoingFields.otherLoanRepaymentsLabel = outgoingFields.otherLoanRepaymentsInput * outgoingFields.otherLoanRepaymentsFrequency;
                outgoingFields.creditCardInterestsLabel = outgoingFields.creditCardInterestsInput * outgoingFields.creditCardInterestsFrequency;
                outgoingFields.voluntarySuperContributionsLabel = outgoingFields.voluntarySuperContributionsInput * outgoingFields.voluntarySuperContributionsFrequency;
                outgoingFields.savingsLabel = outgoingFields.savingsInput * outgoingFields.savingsFrequency;
                outgoingFields.childSupportPaymentsLabel = outgoingFields.childSupportPaymentsInput * outgoingFields.childSupportPaymentsFrequency;
                outgoingFields.donationsCharityLabel = outgoingFields.donationsCharityInput * outgoingFields.donationsCharityFrequency;
                outgoingFields.pocketMoneyLabel = outgoingFields.pocketMoneyInput * outgoingFields.pocketMoneyFrequency;
                outgoingFields.otherLabel = outgoingFields.otherInput * outgoingFields.otherFrequency;
                outgoingFields.financialCommitmentsTotal = outgoingFields.rentMontageLabel
                        + outgoingFields.carLoanRepaymentsLabel
                        + outgoingFields.otherLoanRepaymentsLabel
                        + outgoingFields.creditCardInterestsLabel
                        + outgoingFields.voluntarySuperContributionsLabel
                        + outgoingFields.savingsLabel
                        + outgoingFields.childSupportPaymentsLabel
                        + outgoingFields.donationsCharityLabel
                        + outgoingFields.pocketMoneyLabel
                        + outgoingFields.otherLabel;
                Results.resultFields.result = Income.incomeFields.incomeTotal - outgoingFields.financialCommitmentsTotal;
            }
        };

        form.add(new Label("rentMontageLabel", new PropertyModel<Integer>(outgoingFields, "rentMontageLabel")));
        form.add(new TextField<Integer>("rentMontageInput", new PropertyModel<Integer>(outgoingFields, "rentMontageInput")));

        form.add(new Label("carLoanRepaymentsLabel", new PropertyModel<Integer>(outgoingFields, "carLoanRepaymentsLabel")));
        form.add(new TextField<Integer>("carLoanRepaymentsInput", new PropertyModel<Integer>(outgoingFields, "carLoanRepaymentsInput")));

        form.add(new Label("otherLoanRepaymentsLabel", new PropertyModel<Integer>(outgoingFields, "otherLoanRepaymentsLabel")));
        form.add(new TextField<Integer>("otherLoanRepaymentsInput", new PropertyModel<Integer>(outgoingFields, "otherLoanRepaymentsInput")));

        form.add(new Label("creditCardInterestsLabel", new PropertyModel<Integer>(outgoingFields, "creditCardInterestsLabel")));
        form.add(new TextField<Integer>("creditCardInterestsInput", new PropertyModel<Integer>(outgoingFields, "creditCardInterestsInput")));

        form.add(new Label("voluntarySuperContributionsLabel", new PropertyModel<Integer>(outgoingFields, "voluntarySuperContributionsLabel")));
        form.add(new TextField<Integer>("voluntarySuperContributionsInput", new PropertyModel<Integer>(outgoingFields, "voluntarySuperContributionsInput")));

        form.add(new Label("savingsLabel", new PropertyModel<Integer>(outgoingFields, "savingsLabel")));
        form.add(new TextField<Integer>("savingsInput", new PropertyModel<Integer>(outgoingFields, "savingsInput")));

        form.add(new Label("childSupportPaymentsLabel", new PropertyModel<Integer>(outgoingFields, "childSupportPaymentsLabel")));
        form.add(new TextField<Integer>("childSupportPaymentsInput", new PropertyModel<Integer>(outgoingFields, "childSupportPaymentsInput")));

        form.add(new Label("donationsCharityLabel", new PropertyModel<Integer>(outgoingFields, "donationsCharityLabel")));
        form.add(new TextField<Integer>("donationsCharityInput", new PropertyModel<Integer>(outgoingFields, "donationsCharityInput")));

        form.add(new Label("pocketMoneyLabel", new PropertyModel<Integer>(outgoingFields, "pocketMoneyLabel")));
        form.add(new TextField<Integer>("pocketMoneyInput", new PropertyModel<Integer>(outgoingFields, "pocketMoneyInput")));

        form.add(new Label("otherLabel", new PropertyModel<Integer>(outgoingFields, "otherLabel")));
        form.add(new TextField<Integer>("otherInput", new PropertyModel<Integer>(outgoingFields, "otherInput")));

        add(form);

        form.add(new MyDropDownChoice("rentMontageSelect", new PropertyModel<Integer>(outgoingFields, "rentMontageFrequency")));

        form.add(new MyDropDownChoice("carLoanRepaymentsSelect", new PropertyModel<Integer>(outgoingFields, "carLoanRepaymentsFrequency")));

        form.add(new MyDropDownChoice("otherLoanRepaymentsSelect", new PropertyModel<Integer>(outgoingFields, "otherLoanRepaymentsFrequency")));

        form.add(new MyDropDownChoice("creditCardInterestsSelect", new PropertyModel<Integer>(outgoingFields, "creditCardInterestsFrequency")));

        form.add(new MyDropDownChoice("voluntarySuperContributionsSelect", new PropertyModel<Integer>(outgoingFields, "voluntarySuperContributionsFrequency")));

        form.add(new MyDropDownChoice("savingsSelect", new PropertyModel<Integer>(outgoingFields, "savingsFrequency")));

        form.add(new MyDropDownChoice("childSupportPaymentsSelect", new PropertyModel<Integer>(outgoingFields, "childSupportPaymentsFrequency")));

        form.add(new MyDropDownChoice("donationsCharitySelect", new PropertyModel<Integer>(outgoingFields, "donationsCharityFrequency")));

        form.add(new MyDropDownChoice("pocketMoneySelect", new PropertyModel<Integer>(outgoingFields, "pocketMoneyFrequency")));

        form.add(new MyDropDownChoice("otherSelect", new PropertyModel<Integer>(outgoingFields, "otherFrequency")));

        form.add(new Link("previousPage") {
            @Override
            public void onClick() {
                setResponsePage(Income.class);
            }
        });
        form.add(new Link("nextPage") {
            @Override
            public void onClick() {
                setResponsePage(HomeUtilities.class);
            }
        });
    }
}
