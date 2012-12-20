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
public final class EducationHealth extends BasePage {

    public EducationHealth() {
        Form<?> form = new Form("form") {
            @Override
            protected void onSubmit() {
                FinancialCommitments.outgoingFields.schoolFeesLabel = FinancialCommitments.outgoingFields.schoolFeesInput * FinancialCommitments.outgoingFields.schoolFeesFrequency;
                FinancialCommitments.outgoingFields.uniTAFELabel = FinancialCommitments.outgoingFields.uniTAFEInput * FinancialCommitments.outgoingFields.uniTAFEFrequency;
                FinancialCommitments.outgoingFields.childcarePreSchoolLabel = FinancialCommitments.outgoingFields.childcarePreSchoolInput * FinancialCommitments.outgoingFields.childcarePreSchoolFrequency;
                FinancialCommitments.outgoingFields.schoolUniformsLabel = FinancialCommitments.outgoingFields.schoolUniformsInput * FinancialCommitments.outgoingFields.schoolUniformsFrequency;
                FinancialCommitments.outgoingFields.sportMusicDanceEtcLabel = FinancialCommitments.outgoingFields.sportMusicDanceEtcInput * FinancialCommitments.outgoingFields.sportMusicDanceEtcFrequency;
                FinancialCommitments.outgoingFields.excursionsLabel = FinancialCommitments.outgoingFields.excursionsInput * FinancialCommitments.outgoingFields.excursionsFrequency;
                FinancialCommitments.outgoingFields.otherOneEducationHealthLabel = FinancialCommitments.outgoingFields.otherOneEducationHealthInput * FinancialCommitments.outgoingFields.otherOneEducationHealthFrequency;
                FinancialCommitments.outgoingFields.privateHealthInsuranceLabel = FinancialCommitments.outgoingFields.privateHealthInsuranceInput * FinancialCommitments.outgoingFields.privateHealthInsuranceFrequency;
                FinancialCommitments.outgoingFields.lifeInsuranceLabel = FinancialCommitments.outgoingFields.lifeInsuranceInput * FinancialCommitments.outgoingFields.lifeInsuranceFrequency;
                FinancialCommitments.outgoingFields.doctorsLabel = FinancialCommitments.outgoingFields.doctorsInput * FinancialCommitments.outgoingFields.doctorsFrequency;
                FinancialCommitments.outgoingFields.dentistsLabel = FinancialCommitments.outgoingFields.dentistsInput * FinancialCommitments.outgoingFields.dentistsFrequency;
                FinancialCommitments.outgoingFields.medicinesPharmacyLabel = FinancialCommitments.outgoingFields.medicinesPharmacyInput * FinancialCommitments.outgoingFields.medicinesPharmacyFrequency;
                FinancialCommitments.outgoingFields.eyeCareGlassesLabel = FinancialCommitments.outgoingFields.eyeCareGlassesInput * FinancialCommitments.outgoingFields.eyeCareGlassesFrequency;
                FinancialCommitments.outgoingFields.vetLabel = FinancialCommitments.outgoingFields.vetInput * FinancialCommitments.outgoingFields.vetFrequency;
                FinancialCommitments.outgoingFields.otherTwoEducationHealthLabel = FinancialCommitments.outgoingFields.otherTwoEducationHealthInput * FinancialCommitments.outgoingFields.otherTwoEducationHealthFrequency;
                FinancialCommitments.outgoingFields.educationHealthTotal = FinancialCommitments.outgoingFields.schoolFeesLabel
                        + FinancialCommitments.outgoingFields.uniTAFELabel
                        + FinancialCommitments.outgoingFields.childcarePreSchoolLabel
                        + FinancialCommitments.outgoingFields.schoolUniformsLabel
                        + FinancialCommitments.outgoingFields.sportMusicDanceEtcLabel
                        + FinancialCommitments.outgoingFields.excursionsLabel
                        + FinancialCommitments.outgoingFields.otherOneEducationHealthLabel
                        + FinancialCommitments.outgoingFields.privateHealthInsuranceLabel
                        + FinancialCommitments.outgoingFields.lifeInsuranceLabel
                        + FinancialCommitments.outgoingFields.doctorsLabel
                        + FinancialCommitments.outgoingFields.dentistsLabel
                        + FinancialCommitments.outgoingFields.dentistsLabel
                        + FinancialCommitments.outgoingFields.medicinesPharmacyLabel
                        + FinancialCommitments.outgoingFields.eyeCareGlassesLabel
                        + FinancialCommitments.outgoingFields.vetLabel
                        + FinancialCommitments.outgoingFields.otherTwoEducationHealthLabel;
                Results.resultFields.result = Income.incomeFields.incomeTotal - FinancialCommitments.outgoingFields.financialCommitmentsTotal - FinancialCommitments.outgoingFields.homeUtilitiesTotal - FinancialCommitments.outgoingFields.educationHealthTotal - FinancialCommitments.outgoingFields.shoppingTransportTotal - FinancialCommitments.outgoingFields.entertainmentEatingOutTotal;
            }
        };

        form.add(new Label("schoolFeesLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "schoolFeesLabel")));
        form.add(new TextField<Integer>("schoolFeesInput", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "schoolFeesInput")));

        form.add(new Label("uniTAFELabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "uniTAFELabel")));
        form.add(new TextField<Integer>("uniTAFEInput", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "uniTAFEInput")));

        form.add(new Label("childcarePreSchoolLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "childcarePreSchoolLabel")));
        form.add(new TextField<Integer>("childcarePreSchoolInput", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "childcarePreSchoolInput")));

        form.add(new Label("schoolUniformsLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "schoolUniformsLabel")));
        form.add(new TextField<Integer>("schoolUniformsInput", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "schoolUniformsInput")));

        form.add(new Label("sportMusicDanceEtcLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "sportMusicDanceEtcLabel")));
        form.add(new TextField<Integer>("sportMusicDanceEtcInput", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "sportMusicDanceEtcInput")));

        form.add(new Label("excursionsLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "excursionsLabel")));
        form.add(new TextField<Integer>("excursionsInput", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "excursionsInput")));

        form.add(new Label("otherOneLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "otherOneEducationHealthLabel")));
        form.add(new TextField<Integer>("otherOneInput", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "otherOneEducationHealthInput")));

        form.add(new Label("privateHealthInsuranceLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "privateHealthInsuranceLabel")));
        form.add(new TextField<Integer>("privateHealthInsuranceInput", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "privateHealthInsuranceInput")));

        form.add(new Label("lifeInsuranceLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "lifeInsuranceLabel")));
        form.add(new TextField<Integer>("lifeInsuranceInput", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "lifeInsuranceInput")));

        form.add(new Label("doctorsLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "doctorsLabel")));
        form.add(new TextField<Integer>("doctorsInput", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "doctorsInput")));

        form.add(new Label("dentistsLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "dentistsLabel")));
        form.add(new TextField<Integer>("dentistsInput", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "dentistsInput")));

        form.add(new Label("medicinesPharmacyLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "medicinesPharmacyLabel")));
        form.add(new TextField<Integer>("medicinesPharmacyInput", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "medicinesPharmacyInput")));

        form.add(new Label("eyeCareGlassesLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "eyeCareGlassesLabel")));
        form.add(new TextField<Integer>("eyeCareGlassesInput", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "eyeCareGlassesInput")));

        form.add(new Label("vetLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "vetLabel")));
        form.add(new TextField<Integer>("vetInput", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "vetInput")));

        form.add(new Label("otherTwoLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "otherTwoEducationHealthLabel")));
        form.add(new TextField<Integer>("otherTwoInput", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "otherTwoEducationHealthInput")));

        add(form);

        form.add(new MyDropDownChoice("schoolFeesSelect", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "schoolFeesFrequency")));

        form.add(new MyDropDownChoice("uniTAFESelect", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "uniTAFEFrequency")));

        form.add(new MyDropDownChoice("childcarePreSchoolSelect", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "childcarePreSchoolFrequency")));

        form.add(new MyDropDownChoice("schoolUniformsSelect", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "schoolUniformsFrequency")));

        form.add(new MyDropDownChoice("sportMusicDanceEtcSelect", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "sportMusicDanceEtcFrequency")));

        form.add(new MyDropDownChoice("excursionsSelect", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "excursionsFrequency")));

        form.add(new MyDropDownChoice("otherOneSelect", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "otherOneEducationHealthFrequency")));

        form.add(new MyDropDownChoice("privateHealthInsuranceSelect", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "privateHealthInsuranceFrequency")));

        form.add(new MyDropDownChoice("lifeInsuranceSelect", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "lifeInsuranceFrequency")));

        form.add(new MyDropDownChoice("doctorsSelect", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "doctorsFrequency")));

        form.add(new MyDropDownChoice("dentistsSelect", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "dentistsFrequency")));

        form.add(new MyDropDownChoice("medicinesPharmacySelect", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "medicinesPharmacyFrequency")));

        form.add(new MyDropDownChoice("eyeCareGlassesSelect", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "eyeCareGlassesFrequency")));

        form.add(new MyDropDownChoice("vetSelect", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "vetFrequency")));

        form.add(new MyDropDownChoice("otherTwoSelect", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "otherTwoEducationHealthFrequency")));

        form.add(new Link("previousPage") {
            @Override
            public void onClick() {
                setResponsePage(HomeUtilities.class);
            }
        });
        form.add(new Link("nextPage") {
            @Override
            public void onClick() {
                setResponsePage(ShoppingTransport.class);
            }
        });
    }
}
