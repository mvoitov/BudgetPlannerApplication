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
public final class EntertainmentEatingOut extends BasePage {

    public EntertainmentEatingOut() {
        Form<?> form = new Form("form") {
            @Override
            protected void onSubmit() {
                FinancialCommitments.outgoingFields.holidaysLabel = FinancialCommitments.outgoingFields.holidaysInput * FinancialCommitments.outgoingFields.holidaysFrequency;
                FinancialCommitments.outgoingFields.barsClubsLabel = FinancialCommitments.outgoingFields.barsClubsInput * FinancialCommitments.outgoingFields.barsClubsFrequency;
                FinancialCommitments.outgoingFields.otherAlcoholLabel = FinancialCommitments.outgoingFields.otherAlcoholInput * FinancialCommitments.outgoingFields.otherAlcoholFrequency;
                FinancialCommitments.outgoingFields.gymSportingMembershipLabel = FinancialCommitments.outgoingFields.gymSportingMembershipInput * FinancialCommitments.outgoingFields.gymSportingMembershipFrequency;
                FinancialCommitments.outgoingFields.cigarettesLabel = FinancialCommitments.outgoingFields.cigarettesInput * FinancialCommitments.outgoingFields.cigarettesFrequency;
                FinancialCommitments.outgoingFields.moviesMusicLabel = FinancialCommitments.outgoingFields.moviesMusicInput * FinancialCommitments.outgoingFields.moviesMusicFrequency;
                FinancialCommitments.outgoingFields.hobbiesLabel = FinancialCommitments.outgoingFields.hobbiesInput * FinancialCommitments.outgoingFields.hobbiesFrequency;
                FinancialCommitments.outgoingFields.newspaperMagazinesLabel = FinancialCommitments.outgoingFields.newspaperMagazinesInput * FinancialCommitments.outgoingFields.newspaperMagazinesFrequency;
                FinancialCommitments.outgoingFields.celebrationsLabel = FinancialCommitments.outgoingFields.celebrationsInput * FinancialCommitments.outgoingFields.celebrationsFrequency;
                FinancialCommitments.outgoingFields.otherEntertainmentLabel = FinancialCommitments.outgoingFields.otherEntertainmentInput * FinancialCommitments.outgoingFields.otherEntertainmentFrequency;
                FinancialCommitments.outgoingFields.restaurantsLabel = FinancialCommitments.outgoingFields.restaurantsInput * FinancialCommitments.outgoingFields.restaurantsFrequency;
                FinancialCommitments.outgoingFields.takeawaySnacksLabel = FinancialCommitments.outgoingFields.takeawaySnacksInput * FinancialCommitments.outgoingFields.takeawaySnacksFrequency;
                FinancialCommitments.outgoingFields.boughtLunchesLabel = FinancialCommitments.outgoingFields.boughtLunchesInput * FinancialCommitments.outgoingFields.boughtLunchesFrequency;
                FinancialCommitments.outgoingFields.coffeeTeaLabel = FinancialCommitments.outgoingFields.coffeeTeaInput * FinancialCommitments.outgoingFields.coffeeTeaFrequency;
                FinancialCommitments.outgoingFields.otherEatingOutLabel = FinancialCommitments.outgoingFields.otherEatingOutInput * FinancialCommitments.outgoingFields.otherEatingOutFrequency;
                FinancialCommitments.outgoingFields.entertainmentEatingOutTotal = FinancialCommitments.outgoingFields.holidaysLabel
                        + FinancialCommitments.outgoingFields.barsClubsLabel
                        + FinancialCommitments.outgoingFields.otherAlcoholLabel
                        + FinancialCommitments.outgoingFields.gymSportingMembershipLabel
                        + FinancialCommitments.outgoingFields.cigarettesLabel
                        + FinancialCommitments.outgoingFields.moviesMusicLabel
                        + FinancialCommitments.outgoingFields.hobbiesLabel
                        + FinancialCommitments.outgoingFields.newspaperMagazinesLabel
                        + FinancialCommitments.outgoingFields.celebrationsLabel
                        + FinancialCommitments.outgoingFields.otherEntertainmentLabel
                        + FinancialCommitments.outgoingFields.restaurantsLabel
                        + FinancialCommitments.outgoingFields.takeawaySnacksLabel
                        + FinancialCommitments.outgoingFields.boughtLunchesLabel
                        + FinancialCommitments.outgoingFields.coffeeTeaLabel
                        + FinancialCommitments.outgoingFields.otherEatingOutLabel;
                Results.resultFields.result = Income.incomeFields.incomeTotal - FinancialCommitments.outgoingFields.financialCommitmentsTotal - FinancialCommitments.outgoingFields.homeUtilitiesTotal - FinancialCommitments.outgoingFields.educationHealthTotal - FinancialCommitments.outgoingFields.shoppingTransportTotal - FinancialCommitments.outgoingFields.entertainmentEatingOutTotal;
            }
        };

        form.add(new Label("holidaysLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "holidaysLabel")));
        form.add(new TextField<Integer>("holidaysInput", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "holidaysInput")));

        form.add(new Label("barsClubsLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "barsClubsLabel")));
        form.add(new TextField<Integer>("barsClubsInput", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "barsClubsInput")));

        form.add(new Label("otherAlcoholLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "otherAlcoholLabel")));
        form.add(new TextField<Integer>("otherAlcoholInput", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "otherAlcoholInput")));

        form.add(new Label("gymSportingMembershipLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "gymSportingMembershipLabel")));
        form.add(new TextField<Integer>("gymSportingMembershipInput", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "gymSportingMembershipInput")));

        form.add(new Label("cigarettesLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "cigarettesLabel")));
        form.add(new TextField<Integer>("cigarettesInput", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "cigarettesInput")));

        form.add(new Label("moviesMusicLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "moviesMusicLabel")));
        form.add(new TextField<Integer>("moviesMusicInput", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "moviesMusicInput")));

        form.add(new Label("hobbiesLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "hobbiesLabel")));
        form.add(new TextField<Integer>("hobbiesInput", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "hobbiesInput")));

        form.add(new Label("newspaperMagazinesLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "newspaperMagazinesLabel")));
        form.add(new TextField<Integer>("newspaperMagazinesInput", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "newspaperMagazinesInput")));

        form.add(new Label("celebrationsLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "celebrationsLabel")));
        form.add(new TextField<Integer>("celebrationsInput", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "celebrationsInput")));

        form.add(new Label("otherEntertainmentLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "otherEntertainmentLabel")));
        form.add(new TextField<Integer>("otherEntertainmentInput", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "otherEntertainmentInput")));

        form.add(new Label("restaurantsLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "restaurantsLabel")));
        form.add(new TextField<Integer>("restaurantsInput", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "restaurantsInput")));

        form.add(new Label("takeawaySnacksLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "takeawaySnacksLabel")));
        form.add(new TextField<Integer>("takeawaySnacksInput", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "takeawaySnacksInput")));

        form.add(new Label("boughtLunchesLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "boughtLunchesLabel")));
        form.add(new TextField<Integer>("boughtLunchesInput", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "boughtLunchesInput")));

        form.add(new Label("coffeeTeaLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "coffeeTeaLabel")));
        form.add(new TextField<Integer>("coffeeTeaInput", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "coffeeTeaInput")));

        form.add(new Label("otherEatingOutLabel", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "otherEatingOutLabel")));
        form.add(new TextField<Integer>("otherEatingOutInput", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "otherEatingOutInput")));

        add(form);

        form.add(new MyDropDownChoice("holidaysSelect", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "holidaysFrequency")));

        form.add(new MyDropDownChoice("barsClubsSelect", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "barsClubsFrequency")));

        form.add(new MyDropDownChoice("otherAlcoholSelect", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "otherAlcoholFrequency")));

        form.add(new MyDropDownChoice("gymSportingMembershipSelect", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "gymSportingMembershipFrequency")));

        form.add(new MyDropDownChoice("cigarettesSelect", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "cigarettesFrequency")));

        form.add(new MyDropDownChoice("moviesMusicSelect", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "moviesMusicFrequency")));

        form.add(new MyDropDownChoice("hobbiesSelect", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "hobbiesFrequency")));

        form.add(new MyDropDownChoice("newspaperMagazinesSelect", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "newspaperMagazinesFrequency")));

        form.add(new MyDropDownChoice("celebrationsSelect", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "celebrationsFrequency")));

        form.add(new MyDropDownChoice("otherEntertainmentSelect", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "otherEntertainmentFrequency")));

        form.add(new MyDropDownChoice("restaurantsSelect", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "restaurantsFrequency")));

        form.add(new MyDropDownChoice("takeawaySnacksSelect", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "takeawaySnacksFrequency")));

        form.add(new MyDropDownChoice("boughtLunchesSelect", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "boughtLunchesFrequency")));

        form.add(new MyDropDownChoice("coffeeTeaSelect", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "coffeeTeaFrequency")));

        form.add(new MyDropDownChoice("otherEatingOutSelect", new PropertyModel<Integer>(FinancialCommitments.outgoingFields, "otherEatingOutFrequency")));

        form.add(new Link("previousPage") {
            @Override
            public void onClick() {
                setResponsePage(ShoppingTransport.class);
            }
        });
        form.add(new Link("nextPage") {
            @Override
            public void onClick() {
                setResponsePage(Results.class);
            }
        });
    }
}
