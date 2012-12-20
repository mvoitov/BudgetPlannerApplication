/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.budgetplanner.pages;

import lv.budgetplanner.app.BasePage;
import lv.budgetplanner.fields.ResultFields;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.PropertyModel;

/**
 *
 * @author Maxim
 */
public final class Results extends BasePage {

    public static ResultFields resultFields = new ResultFields();

    public Results() {
        if (resultFields.result == 0) {
            add(new Label("resultTotal", new PropertyModel<Integer>(resultFields, "result")));
            add(new Label("lessOrMore", "not more and not less"));
            add(new Label("summary", "Congradulations!"));
        } else {
            if (resultFields.result > 0) {
                add(new Label("resultTotal", new PropertyModel<Integer>(resultFields, "result")));
                add(new Label("lessOrMore", "less"));
                add(new Label("summary", "Congratulations!"));
            } else {
                add(new Label("resultTotal", new PropertyModel<Integer>(resultFields, "result")));
                add(new Label("lessOrMore", "more"));
                add(new Label("summary", "We have bad news for you! :("));
            }
        }
    }
}
