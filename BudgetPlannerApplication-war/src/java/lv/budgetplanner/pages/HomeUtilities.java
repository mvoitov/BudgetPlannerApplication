/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.budgetplanner.pages;

import lv.budgetplanner.app.BasePage;
import lv.budgetplanner.app.MyDropDownChoice;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.model.PropertyModel;

/**
 *
 * @author Maxim
 */
public final class HomeUtilities extends BasePage {

    public HomeUtilities() {
        Form<?> form = new Form("form") {
            @Override
            protected void onSubmit() {
                FinancialCommitments.outgoingFields.councilRatesLabel = FinancialCommitments.outgoingFields.councilRatesInput * FinancialCommitments.outgoingFields.councilRatesFrequency;
                FinancialCommitments.outgoingFields.bodyCorporateFeesLabel = FinancialCommitments.outgoingFields.bodyCorporateFeesInput * FinancialCommitments.outgoingFields.bodyCorporateFeesFrequency;
                FinancialCommitments.outgoingFields.carLoanRepaymentsLabel = FinancialCommitments.outgoingFields.carLoanRepaymentsInput * FinancialCommitments.outgoingFields.carLoanRepaymentsFrequency;
                FinancialCommitments.outgoingFields.childSupportPaymentsLabel = FinancialCommitments.outgoingFields.childSupportPaymentsInput * FinancialCommitments.outgoingFields.childSupportPaymentsFrequency;
                FinancialCommitments.outgoingFields.creditCardInterestsLabel = FinancialCommitments.outgoingFields.creditCardInterestsInput * FinancialCommitments.outgoingFields.creditCardInterestsFrequency;
                FinancialCommitments.outgoingFields.donationsCharityLabel = FinancialCommitments.outgoingFields.donationsCharityInput * FinancialCommitments.outgoingFields.donationsCharityFrequency;
                FinancialCommitments.outgoingFields.electricityLabel = FinancialCommitments.outgoingFields.electricityInput * FinancialCommitments.outgoingFields.electricityFrequency;
                FinancialCommitments.outgoingFields.gasLabel = FinancialCommitments.outgoingFields.gasInput * FinancialCommitments.outgoingFields.gasFrequency;
                FinancialCommitments.outgoingFields.homeAndContestsInsuranceLabel = FinancialCommitments.outgoingFields.homeAndContestsInsuranceInput * FinancialCommitments.outgoingFields.homeAndContestsInsuranceFrequency;
                FinancialCommitments.outgoingFields.homeMaintenanceAndRepairsLabel = FinancialCommitments.outgoingFields.homeMaintenanceAndRepairsInput * FinancialCommitments.outgoingFields.homeMaintenanceAndRepairsFrequency;
                FinancialCommitments.outgoingFields.newFurnitureAppliancesLabel = FinancialCommitments.outgoingFields.newFurnitureAppliancesInput * FinancialCommitments.outgoingFields.newFurnitureAppliancesFrequency;
                FinancialCommitments.outgoingFields.otherOneLabel = FinancialCommitments.outgoingFields.otherOneInput * FinancialCommitments.outgoingFields.otherOneFrequency;
                FinancialCommitments.outgoingFields.otherTwoLabel = FinancialCommitments.outgoingFields.otherTwoInput * FinancialCommitments.outgoingFields.otherTwoFrequency;
                FinancialCommitments.outgoingFields.homePhoneLabel = FinancialCommitments.outgoingFields.homePhoneInput * FinancialCommitments.outgoingFields.homePhoneFrequency;
                FinancialCommitments.outgoingFields.internetLabel = FinancialCommitments.outgoingFields.internetInput * FinancialCommitments.outgoingFields.internetFrequency;
                FinancialCommitments.outgoingFields.payTvLabel = FinancialCommitments.outgoingFields.payTvInput * FinancialCommitments.outgoingFields.payTvFrequency;
                FinancialCommitments.outgoingFields.mobilePhonesLabel = FinancialCommitments.outgoingFields.mobilePhonesInput * FinancialCommitments.outgoingFields.mobilePhonesFrequency;
                FinancialCommitments.outgoingFields.waterLabel = FinancialCommitments.outgoingFields.waterInput * FinancialCommitments.outgoingFields.waterFrequency;
                FinancialCommitments.outgoingFields.homeUtilitiesTotal = FinancialCommitments.outgoingFields.councilRatesLabel
                        + FinancialCommitments.outgoingFields.bodyCorporateFeesLabel
                        + FinancialCommitments.outgoingFields.carLoanRepaymentsLabel
                        + FinancialCommitments.outgoingFields.childSupportPaymentsLabel
                        + FinancialCommitments.outgoingFields.creditCardInterestsLabel
                        + FinancialCommitments.outgoingFields.donationsCharityLabel
                        + FinancialCommitments.outgoingFields.electricityLabel
                        + FinancialCommitments.outgoingFields.gasLabel
                        + FinancialCommitments.outgoingFields.homeAndContestsInsuranceLabel
                        + FinancialCommitments.outgoingFields.homeMaintenanceAndRepairsLabel
                        + FinancialCommitments.outgoingFields.newFurnitureAppliancesLabel
                        + FinancialCommitments.outgoingFields.otherOneLabel
                        + FinancialCommitments.outgoingFields.otherTwoLabel
                        + FinancialCommitments.outgoingFields.homePhoneLabel
                        + FinancialCommitments.outgoingFields.internetLabel
                        + FinancialCommitments.outgoingFields.payTvLabel
                        + FinancialCommitments.outgoingFields.mobilePhonesLabel
                        + FinancialCommitments.outgoingFields.waterLabel;
                Results.resultFields.result = Income.incomeFields.incomeTotal - FinancialCommitments.outgoingFields.financialCommitmentsTotal - FinancialCommitments.outgoingFields.homeUtilitiesTotal - FinancialCommitments.outgoingFields.educationHealthTotal - FinancialCommitments.outgoingFields.shoppingTransportTotal - FinancialCommitments.outgoingFields.entertainmentEatingOutTotal;
            }
        };


        form.add(new Label("councilRatesLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "councilRatesLabel")));
        form.add(new TextField<Integer>("councilRatesInput", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "councilRatesInput")));

        form.add(new Label("bodyCorporateFeesLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "bodyCorporateFeesLabel")));
        form.add(new TextField<Integer>("bodyCorporateFeesInput", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "bodyCorporateFeesInput")));

        form.add(new Label("homeAndContestsInsuranceLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "homeAndContestsInsuranceLabel")));
        form.add(new TextField<Integer>("homeAndContestsInsuranceInput", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "homeAndContestsInsuranceInput")));

        form.add(new Label("homeMaintenanceAndRepairsLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "homeMaintenanceAndRepairsLabel")));
        form.add(new TextField<Integer>("homeMaintenanceAndRepairsInput", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "homeMaintenanceAndRepairsInput")));

        form.add(new Label("newFurnitureAppliancesLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "newFurnitureAppliancesLabel")));
        form.add(new TextField<Integer>("newFurnitureAppliancesInput", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "newFurnitureAppliancesInput")));

        form.add(new Label("otherOneLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "otherOneLabel")));
        form.add(new TextField<Integer>("otherOneInput", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "otherOneInput")));

        form.add(new Label("electricityLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "electricityLabel")));
        form.add(new TextField<Integer>("electricityInput", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "electricityInput")));

        form.add(new Label("gasLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "gasLabel")));
        form.add(new TextField<Integer>("gasInput", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "gasInput")));

        form.add(new Label("waterLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "waterLabel")));
        form.add(new TextField<Integer>("waterInput", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "waterInput")));

        form.add(new Label("internetLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "internetLabel")));
        form.add(new TextField<Integer>("internetInput", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "internetInput")));

        form.add(new Label("payTvLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "payTvLabel")));
        form.add(new TextField<Integer>("payTvInput", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "payTvInput")));

        form.add(new Label("homePhoneLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "homePhoneLabel")));
        form.add(new TextField<Integer>("homePhoneInput", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "homePhoneInput")));

        form.add(new Label("mobilePhonesLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "mobilePhonesLabel")));
        form.add(new TextField<Integer>("mobilePhonesInput", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "mobilePhonesInput")));

        form.add(new Label("otherTwoLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "otherTwoLabel")));
        form.add(new TextField<Integer>("otherTwoInput", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "otherTwoInput")));

        add(form);

        form.add(new MyDropDownChoice("councilRatesSelect", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "councilRatesFrequency")));

        form.add(new MyDropDownChoice("bodyCorporateFeesSelect", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "bodyCorporateFeesFrequency")));

        form.add(new MyDropDownChoice("homeAndContestsInsuranceSelect", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "homeAndContestsInsuranceFrequency")));

        form.add(new MyDropDownChoice("homeMaintenanceAndRepairsSelect", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "homeMaintenanceAndRepairsFrequency")));

        form.add(new MyDropDownChoice("newFurnitureAppliancesSelect", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "newFurnitureAppliancesFrequency")));

        form.add(new MyDropDownChoice("otherOneSelect", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "otherOneFrequency")));

        form.add(new MyDropDownChoice("electricitySelect", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "electricityFrequency")));

        form.add(new MyDropDownChoice("gasSelect", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "gasFrequency")));

        form.add(new MyDropDownChoice("waterSelect", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "waterFrequency")));

        form.add(new MyDropDownChoice("internetSelect", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "internetFrequency")));

        form.add(new MyDropDownChoice("payTvSelect", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "payTvFrequency")));

        form.add(new MyDropDownChoice("homePhoneSelect", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "homePhoneFrequency")));

        form.add(new MyDropDownChoice("mobilePhonesSelect", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "mobilePhonesFrequency")));

        form.add(new MyDropDownChoice("otherTwoSelect", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "otherTwoFrequency")));

        form.add(new Link("previousPage") {
            @Override
            public void onClick() {
                setResponsePage(FinancialCommitments.class);
            }
        });
        form.add(new Link("nextPage") {
            @Override
            public void onClick() {
                setResponsePage(EducationHealth.class);
            }
        });
    }
}
