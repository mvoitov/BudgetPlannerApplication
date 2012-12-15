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
public final class EducationHealth extends BasePage {

    private Integer schoolFees = 0;
    private Integer uniTAFE = 0;
    private Integer childcarePreSchool = 0;
    private Integer schoolUniforms = 0;
    private Integer sportMusicDanceEtc = 0;
    private Integer excursions = 0;
    private Integer otherOne = 0;
    private Integer privateHealthInsurance = 0;
    private Integer lifeInsurance = 0;
    private Integer doctors = 0;
    private Integer dentists = 0;
    private Integer medicinesPharmacy = 0;
    private Integer eyeCareGlasses = 0;
    private Integer vet = 0;
    private Integer otherTwo = 0;

    public EducationHealth() {
        Form<?> form = new Form("form");

        PropertyModel<Integer> schoolFeesModel = new PropertyModel<Integer>(this, "schoolFees");
        form.add(new Label("schoolFeesLabel", schoolFeesModel));
        form.add(new TextField<Integer>("schoolFeesInput", schoolFeesModel));

        PropertyModel<Integer> uniTAFEModel = new PropertyModel<Integer>(this, "uniTAFE");
        form.add(new Label("uniTAFELabel", uniTAFEModel));
        form.add(new TextField<Integer>("uniTAFEInput", uniTAFEModel));

        PropertyModel<Integer> childcarePreSchoolModel = new PropertyModel<Integer>(this, "childcarePreSchool");
        form.add(new Label("childcarePreSchoolLabel", childcarePreSchoolModel));
        form.add(new TextField<Integer>("childcarePreSchoolInput", childcarePreSchoolModel));

        PropertyModel<Integer> schoolUniformsModel = new PropertyModel<Integer>(this, "schoolUniforms");
        form.add(new Label("schoolUniformsLabel", schoolUniformsModel));
        form.add(new TextField<Integer>("schoolUniformsInput", schoolUniformsModel));

        PropertyModel<Integer> sportMusicDanceEtcModel = new PropertyModel<Integer>(this, "sportMusicDanceEtc");
        form.add(new Label("sportMusicDanceEtcLabel", sportMusicDanceEtcModel));
        form.add(new TextField<Integer>("sportMusicDanceEtcInput", sportMusicDanceEtcModel));

        PropertyModel<Integer> excursionsModel = new PropertyModel<Integer>(this, "excursions");
        form.add(new Label("excursionsLabel", excursionsModel));
        form.add(new TextField<Integer>("excursionsInput", excursionsModel));

        PropertyModel<Integer> otherOneModel = new PropertyModel<Integer>(this, "otherOne");
        form.add(new Label("otherOneLabel", otherOneModel));
        form.add(new TextField<Integer>("otherOneInput", otherOneModel));

        PropertyModel<Integer> privateHealthInsuranceModel = new PropertyModel<Integer>(this, "privateHealthInsurance");
        form.add(new Label("privateHealthInsuranceLabel", privateHealthInsuranceModel));
        form.add(new TextField<Integer>("privateHealthInsuranceInput", privateHealthInsuranceModel));

        PropertyModel<Integer> lifeInsuranceModel = new PropertyModel<Integer>(this, "lifeInsurance");
        form.add(new Label("lifeInsuranceLabel", lifeInsuranceModel));
        form.add(new TextField<Integer>("lifeInsuranceInput", lifeInsuranceModel));

        PropertyModel<Integer> doctorsModel = new PropertyModel<Integer>(this, "doctors");
        form.add(new Label("doctorsLabel", doctorsModel));
        form.add(new TextField<Integer>("doctorsInput", doctorsModel));

        PropertyModel<Integer> dentistsModel = new PropertyModel<Integer>(this, "dentists");
        form.add(new Label("dentistsLabel", dentistsModel));
        form.add(new TextField<Integer>("dentistsInput", dentistsModel));

        PropertyModel<Integer> medicinesPharmacyModel = new PropertyModel<Integer>(this, "medicinesPharmacy");
        form.add(new Label("medicinesPharmacyLabel", medicinesPharmacyModel));
        form.add(new TextField<Integer>("medicinesPharmacyInput", medicinesPharmacyModel));

        PropertyModel<Integer> eyeCareGlassesModel = new PropertyModel<Integer>(this, "eyeCareGlasses");
        form.add(new Label("eyeCareGlassesLabel", eyeCareGlassesModel));
        form.add(new TextField<Integer>("eyeCareGlassesInput", eyeCareGlassesModel));

        PropertyModel<Integer> vetModel = new PropertyModel<Integer>(this, "vet");
        form.add(new Label("vetLabel", vetModel));
        form.add(new TextField<Integer>("vetInput", vetModel));

        PropertyModel<Integer> otherTwoModel = new PropertyModel<Integer>(this, "otherTwo");
        form.add(new Label("otherTwoLabel", otherTwoModel));
        form.add(new TextField<Integer>("otherTwoInput", otherTwoModel));
        
        add(form);

        
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
