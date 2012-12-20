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
public final class Income extends BasePage {

    public static IncomeFields incomeFields = new IncomeFields();

    public Income() {
        Form<?> form = new Form("form") {
            @Override
            protected void onSubmit() {
                incomeFields.youTakeHomePayLabel = incomeFields.youTakeHomePayInput * incomeFields.youTakeHomePayFrequency;
                incomeFields.yourPartnersTakeHomePayLabel = incomeFields.yourPartnersTakeHomePayInput * incomeFields.yourPartnersTakeHomePayFrequency;
                incomeFields.bonusesOvertimeLabel = incomeFields.bonusesOvertimeInput * incomeFields.bonusesOvertimeFrequency;
                incomeFields.incomeFromSavingsAndInvestmentsLabel = incomeFields.incomeFromSavingsAndInvestmentsInput * incomeFields.incomeFromSavingsAndInvestmentsFrequency;
                incomeFields.centrelingBenefitsLabel = incomeFields.centrelingBenefitsInput * incomeFields.centrelingBenefitsFrequency;
                incomeFields.familyBenefitsPaymentsLabel = incomeFields.familyBenefitsPaymentsInput * incomeFields.familyBenefitsPaymentsFrequency;
                incomeFields.childSupportReseivedLabel = incomeFields.childSupportReseivedInput * incomeFields.childSupportReseivedFrequency;
                incomeFields.otherLabel = incomeFields.otherInput * incomeFields.otherFrequency;
                incomeFields.incomeTotal = incomeFields.youTakeHomePayLabel
                        + incomeFields.yourPartnersTakeHomePayLabel
                        + incomeFields.bonusesOvertimeLabel
                        + incomeFields.incomeFromSavingsAndInvestmentsLabel
                        + incomeFields.centrelingBenefitsLabel
                        + incomeFields.familyBenefitsPaymentsLabel
                        + incomeFields.childSupportReseivedLabel
                        + incomeFields.otherLabel;
                Results.resultFields.result = incomeFields.incomeTotal - FinancialCommitments.outgoingFields.financialCommitmentsTotal;
            }
        };
        form.add(new Label("youTakeHomePayLabel", new PropertyModel<Integer>(incomeFields, "youTakeHomePayLabel")));
        form.add(new TextField<Integer>("youTakeHomePayInput", new PropertyModel<Integer>(incomeFields, "youTakeHomePayInput")));

        form.add(new Label("yourPartnersTakeHomePayLabel", new PropertyModel<Integer>(incomeFields, "yourPartnersTakeHomePayLabel")));
        form.add(new TextField<Integer>("yourPartnersTakeHomePayInput", new PropertyModel<Integer>(incomeFields, "yourPartnersTakeHomePayInput")));

        form.add(new Label("bonusesOvertimeLabel", new PropertyModel<Integer>(incomeFields, "bonusesOvertimeLabel")));
        form.add(new TextField<Integer>("bonusesOvertimeInput", new PropertyModel<Integer>(incomeFields, "bonusesOvertimeInput")));

        form.add(new Label("incomeFromSavingsAndInvestmentsLabel", new PropertyModel<Integer>(incomeFields, "incomeFromSavingsAndInvestmentsLabel")));
        form.add(new TextField<Integer>("incomeFromSavingsAndInvestmentsInput", new PropertyModel<Integer>(incomeFields, "incomeFromSavingsAndInvestmentsInput")));

        form.add(new Label("centrelingBenefitsLabel", new PropertyModel<Integer>(incomeFields, "centrelingBenefitsLabel")));
        form.add(new TextField<Integer>("centrelingBenefitsInput", new PropertyModel<Integer>(incomeFields, "centrelingBenefitsInput")));

        form.add(new Label("familyBenefitsPaymentsLabel", new PropertyModel<Integer>(incomeFields, "familyBenefitsPaymentsLabel")));
        form.add(new TextField<Integer>("familyBenefitsPaymentsInput", new PropertyModel<Integer>(incomeFields, "familyBenefitsPaymentsInput")));

        form.add(new Label("childSupportReseivedLabel", new PropertyModel<Integer>(incomeFields, "childSupportReseivedLabel")));
        form.add(new TextField<Integer>("childSupportReseivedInput", new PropertyModel<Integer>(incomeFields, "childSupportReseivedInput")));

        form.add(new Label("otherLabel", new PropertyModel<Integer>(incomeFields, "otherLabel")));
        form.add(new TextField<Integer>("otherInput", new PropertyModel<Integer>(incomeFields, "otherInput")));

        add(form);

        form.add(new MyDropDownChoice("youTakeHomePaySelect", new PropertyModel<Integer>(incomeFields, "youTakeHomePayFrequency")));

        form.add(new MyDropDownChoice("yourPartnersTakeHomePaySelect", new PropertyModel<Integer>(incomeFields, "yourPartnersTakeHomePayFrequency")));

        form.add(new MyDropDownChoice("bonusesOvertimeSelect", new PropertyModel<Integer>(incomeFields, "bonusesOvertimeFrequency")));

        form.add(new MyDropDownChoice("incomeFromSavingsAndInvestmentsSelect", new PropertyModel<Integer>(incomeFields, "incomeFromSavingsAndInvestmentsFrequency")));

        form.add(new MyDropDownChoice("centrelingBenefitsSelect", new PropertyModel<Integer>(incomeFields, "centrelingBenefitsFrequency")));

        form.add(new MyDropDownChoice("familyBenefitsPaymentsSelect", new PropertyModel<Integer>(incomeFields, "familyBenefitsPaymentsFrequency")));

        form.add(new MyDropDownChoice("childSupportReseivedSelect", new PropertyModel<Integer>(incomeFields, "childSupportReseivedFrequency")));

        form.add(new MyDropDownChoice("otherSelect", new PropertyModel<Integer>(incomeFields, "otherFrequency")));

        form.add(new Link("nextPage") {
            @Override
            public void onClick() {
                setResponsePage(FinancialCommitments.class);
            }
        });
    }
}
