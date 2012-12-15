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
public final class HomeUtilities extends BasePage {

    private Integer councilRates = 0;
    private Integer bodyCorporateFees = 0;
    private Integer homeAndContestsInsurance = 0;
    private Integer homeMaintenanceAndRepairs = 0;
    private Integer newFurnitureAppliances = 0;
    private Integer otherOne = 0;
    private Integer electricity = 0;
    private Integer gas = 0;
    private Integer water = 0;
    private Integer internet = 0;
    private Integer payTv = 0;
    private Integer homePhone = 0;
    private Integer mobilePhones = 0;
    private Integer otherTwo = 0;

    public HomeUtilities() {
        Form<?> form = new Form("form");

        PropertyModel<Integer> councilRatesModel = new PropertyModel<Integer>(this, "councilRates");
        form.add(new Label("councilRatesLabel", councilRatesModel));
        form.add(new TextField<Integer>("councilRatesInput", councilRatesModel));

        PropertyModel<Integer> bodyCorporateFeesModel = new PropertyModel<Integer>(this, "bodyCorporateFees");
        form.add(new Label("bodyCorporateFeesLabel", bodyCorporateFeesModel));
        form.add(new TextField<Integer>("bodyCorporateFeesInput", bodyCorporateFeesModel));

        PropertyModel<Integer> homeAndContestsInsuranceModel = new PropertyModel<Integer>(this, "homeAndContestsInsurance");
        form.add(new Label("homeAndContestsInsuranceLabel", homeAndContestsInsuranceModel));
        form.add(new TextField<Integer>("homeAndContestsInsuranceInput", homeAndContestsInsuranceModel));

        PropertyModel<Integer> homeMaintenanceAndRepairsModel = new PropertyModel<Integer>(this, "homeMaintenanceAndRepairs");
        form.add(new Label("homeMaintenanceAndRepairsLabel", homeMaintenanceAndRepairsModel));
        form.add(new TextField<Integer>("homeMaintenanceAndRepairsInput", homeMaintenanceAndRepairsModel));

        PropertyModel<Integer> newFurnitureAppliancesModel = new PropertyModel<Integer>(this, "newFurnitureAppliances");
        form.add(new Label("newFurnitureAppliancesLabel", newFurnitureAppliancesModel));
        form.add(new TextField<Integer>("newFurnitureAppliancesInput", newFurnitureAppliancesModel));

        PropertyModel<Integer> otherOneModel = new PropertyModel<Integer>(this, "otherOne");
        form.add(new Label("otherOneLabel", otherOneModel));
        form.add(new TextField<Integer>("otherOneInput", otherOneModel));

        PropertyModel<Integer> electricityModel = new PropertyModel<Integer>(this, "electricity");
        form.add(new Label("electricityLabel", electricityModel));
        form.add(new TextField<Integer>("electricityInput", electricityModel));

        PropertyModel<Integer> gasModel = new PropertyModel<Integer>(this, "gas");
        form.add(new Label("gasLabel", gasModel));
        form.add(new TextField<Integer>("gasInput", gasModel));

        PropertyModel<Integer> waterModel = new PropertyModel<Integer>(this, "water");
        form.add(new Label("waterLabel", waterModel));
        form.add(new TextField<Integer>("waterInput", waterModel));

        PropertyModel<Integer> internetModel = new PropertyModel<Integer>(this, "internet");
        form.add(new Label("internetLabel", internetModel));
        form.add(new TextField<Integer>("internetInput", internetModel));
        
        PropertyModel<Integer> payTvModel = new PropertyModel<Integer>(this, "payTv");
        form.add(new Label("payTvLabel", payTvModel));
        form.add(new TextField<Integer>("payTvInput", payTvModel));
        
        PropertyModel<Integer> homePhoneModel = new PropertyModel<Integer>(this, "homePhone");
        form.add(new Label("homePhoneLabel", homePhoneModel));
        form.add(new TextField<Integer>("homePhoneInput", homePhoneModel));
        
        PropertyModel<Integer> mobilePhonesModel = new PropertyModel<Integer>(this, "mobilePhones");
        form.add(new Label("mobilePhonesLabel", mobilePhonesModel));
        form.add(new TextField<Integer>("mobilePhonesInput", mobilePhonesModel));
        
        PropertyModel<Integer> otherTwoModel = new PropertyModel<Integer>(this, "otherTwo");
        form.add(new Label("otherTwoLabel", otherTwoModel));
        form.add(new TextField<Integer>("otherTwoInput", otherTwoModel));

        add(form);
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
