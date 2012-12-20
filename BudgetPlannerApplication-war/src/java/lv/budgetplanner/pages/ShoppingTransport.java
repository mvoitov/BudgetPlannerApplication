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
public final class ShoppingTransport extends BasePage {

    public ShoppingTransport() {
        Form<?> form = new Form("form") {
            @Override
            protected void onSubmit() {
                FinancialCommitments.outgoingFields.supermarketLabel = FinancialCommitments.outgoingFields.supermarketInput * FinancialCommitments.outgoingFields.supermarketFrequency;
                FinancialCommitments.outgoingFields.fruitVegLabel = FinancialCommitments.outgoingFields.fruitVegInput * FinancialCommitments.outgoingFields.fruitVegFrequency;
                FinancialCommitments.outgoingFields.babyProductsLabel = FinancialCommitments.outgoingFields.babyProductsInput * FinancialCommitments.outgoingFields.babyProductsFrequency;
                FinancialCommitments.outgoingFields.clothingShoesLabel = FinancialCommitments.outgoingFields.clothingShoesInput * FinancialCommitments.outgoingFields.clothingShoesFrequency;
                FinancialCommitments.outgoingFields.cosmeticsToiletriesLabel = FinancialCommitments.outgoingFields.cosmeticsToiletriesInput * FinancialCommitments.outgoingFields.cosmeticsToiletriesFrequency;
                FinancialCommitments.outgoingFields.hairDresserLabel = FinancialCommitments.outgoingFields.hairDresserInput * FinancialCommitments.outgoingFields.hairDresserFrequency;
                FinancialCommitments.outgoingFields.giftsAndOtherLabel = FinancialCommitments.outgoingFields.giftsAndOtherInput * FinancialCommitments.outgoingFields.giftsAndOtherFrequency;
                FinancialCommitments.outgoingFields.otherFoodAndGroceryLabel = FinancialCommitments.outgoingFields.otherFoodAndGroceryInput * FinancialCommitments.outgoingFields.otherFoodAndGroceryFrequency;
                FinancialCommitments.outgoingFields.carInsuranceLabel = FinancialCommitments.outgoingFields.carInsuranceInput * FinancialCommitments.outgoingFields.carInsuranceFrequency;
                FinancialCommitments.outgoingFields.carMaintenanceLabel = FinancialCommitments.outgoingFields.carMaintenanceInput * FinancialCommitments.outgoingFields.carMaintenanceFrequency;
                FinancialCommitments.outgoingFields.carRegoLicenceLabel = FinancialCommitments.outgoingFields.carRegoLicenceInput * FinancialCommitments.outgoingFields.carRegoLicenceFrequency;
                FinancialCommitments.outgoingFields.petrolLabel = FinancialCommitments.outgoingFields.petrolInput * FinancialCommitments.outgoingFields.petrolFrequency;
                FinancialCommitments.outgoingFields.roadTollsParkingLabel = FinancialCommitments.outgoingFields.roadTollsParkingInput * FinancialCommitments.outgoingFields.roadTollsParkingFrequency;
                FinancialCommitments.outgoingFields.trainsBusesFerriesLabel = FinancialCommitments.outgoingFields.trainsBusesFerriesInput * FinancialCommitments.outgoingFields.trainsBusesFerriesFrequency;
                FinancialCommitments.outgoingFields.otherShoppingTransportLabel = FinancialCommitments.outgoingFields.otherShoppingTransportInput * FinancialCommitments.outgoingFields.otherShoppingTransportFrequency;
                FinancialCommitments.outgoingFields.shoppingTransportTotal = FinancialCommitments.outgoingFields.supermarketLabel
                        + FinancialCommitments.outgoingFields.fruitVegLabel
                        + FinancialCommitments.outgoingFields.babyProductsLabel
                        + FinancialCommitments.outgoingFields.clothingShoesLabel
                        + FinancialCommitments.outgoingFields.cosmeticsToiletriesLabel
                        + FinancialCommitments.outgoingFields.hairDresserLabel
                        + FinancialCommitments.outgoingFields.giftsAndOtherLabel
                        + FinancialCommitments.outgoingFields.otherFoodAndGroceryLabel
                        + FinancialCommitments.outgoingFields.carInsuranceLabel
                        + FinancialCommitments.outgoingFields.carMaintenanceLabel
                        + FinancialCommitments.outgoingFields.carRegoLicenceLabel
                        + FinancialCommitments.outgoingFields.petrolLabel
                        + FinancialCommitments.outgoingFields.roadTollsParkingLabel
                        + FinancialCommitments.outgoingFields.trainsBusesFerriesLabel
                        + FinancialCommitments.outgoingFields.otherShoppingTransportLabel;
                Results.resultFields.result = Income.incomeFields.incomeTotal - FinancialCommitments.outgoingFields.financialCommitmentsTotal - FinancialCommitments.outgoingFields.homeUtilitiesTotal - FinancialCommitments.outgoingFields.educationHealthTotal - FinancialCommitments.outgoingFields.shoppingTransportTotal - FinancialCommitments.outgoingFields.entertainmentEatingOutTotal;
            }
        };

        form.add(new Label("supermarketLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "supermarketLabel")));
        form.add(new TextField<Integer>("supermarketInput", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "supermarketInput")));

        form.add(new Label("fruitVegLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "fruitVegLabel")));
        form.add(new TextField<Integer>("fruitVegInput", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "fruitVegInput")));

        form.add(new Label("babyProductsLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "babyProductsLabel")));
        form.add(new TextField<Integer>("babyProductsInput", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "babyProductsInput")));

        form.add(new Label("clothingShoesLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "clothingShoesLabel")));
        form.add(new TextField<Integer>("clothingShoesInput", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "clothingShoesInput")));

        form.add(new Label("cosmeticsToiletriesLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "cosmeticsToiletriesLabel")));
        form.add(new TextField<Integer>("cosmeticsToiletriesInput", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "cosmeticsToiletriesInput")));

        form.add(new Label("hairDresserLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "hairDresserLabel")));
        form.add(new TextField<Integer>("hairDresserInput", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "hairDresserInput")));

        form.add(new Label("giftsAndOtherLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "giftsAndOtherLabel")));
        form.add(new TextField<Integer>("giftsAndOtherInput", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "giftsAndOtherInput")));

        form.add(new Label("otherFoodAndGroceryLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "otherFoodAndGroceryLabel")));
        form.add(new TextField<Integer>("otherFoodAndGroceryInput", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "otherFoodAndGroceryInput")));

        form.add(new Label("carInsuranceLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "carInsuranceLabel")));
        form.add(new TextField<Integer>("carInsuranceInput", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "carInsuranceInput")));

        form.add(new Label("carMaintenanceLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "carMaintenanceLabel")));
        form.add(new TextField<Integer>("carMaintenanceInput", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "carMaintenanceInput")));

        form.add(new Label("carRegoLicenceLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "carRegoLicenceLabel")));
        form.add(new TextField<Integer>("carRegoLicenceInput", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "carRegoLicenceInput")));

        form.add(new Label("petrolLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "petrolLabel")));
        form.add(new TextField<Integer>("petrolInput", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "petrolInput")));

        form.add(new Label("roadTollsParkingLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "roadTollsParkingLabel")));
        form.add(new TextField<Integer>("roadTollsParkingInput", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "roadTollsParkingInput")));

        form.add(new Label("trainsBusesFerriesLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "trainsBusesFerriesLabel")));
        form.add(new TextField<Integer>("trainsBusesFerriesInput", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "trainsBusesFerriesInput")));

        form.add(new Label("otherLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "otherShoppingTransportLabel")));
        form.add(new TextField<Integer>("otherInput", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "otherShoppingTransportInput")));

        add(form);

        form.add(new MyDropDownChoice("supermarketSelect", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "supermarketFrequency")));

        form.add(new MyDropDownChoice("fruitVegSelect", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "fruitVegFrequency")));

        form.add(new MyDropDownChoice("babyProductsSelect", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "babyProductsFrequency")));

        form.add(new MyDropDownChoice("clothingShoesSelect", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "clothingShoesFrequency")));

        form.add(new MyDropDownChoice("cosmeticsToiletriesSelect", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "cosmeticsToiletriesFrequency")));

        form.add(new MyDropDownChoice("hairDresserSelect", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "hairDresserFrequency")));

        form.add(new MyDropDownChoice("giftsAndOtherSelect", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "giftsAndOtherFrequency")));

        form.add(new MyDropDownChoice("otherFoodAndGrocerySelect", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "otherFoodAndGroceryFrequency")));

        form.add(new MyDropDownChoice("carInsuranceSelect", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "carInsuranceFrequency")));

        form.add(new MyDropDownChoice("carMaintenanceSelect", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "carMaintenanceFrequency")));

        form.add(new MyDropDownChoice("carRegoLicenceSelect", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "carRegoLicenceFrequency")));

        form.add(new MyDropDownChoice("petrolSelect", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "petrolFrequency")));

        form.add(new MyDropDownChoice("roadTollsParkingSelect", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "roadTollsParkingFrequency")));

        form.add(new MyDropDownChoice("trainsBusesFerriesSelect", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "trainsBusesFerriesFrequency")));

        form.add(new MyDropDownChoice("otherSelect", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "otherShoppingTransportFrequency")));

        form.add(new Link("previousPage") {
            @Override
            public void onClick() {
                setResponsePage(EducationHealth.class);
            }
        });
        form.add(new Link("nextPage") {
            @Override
            public void onClick() {
                setResponsePage(EntertainmentEatingOut.class);
            }
        });
    }
}
