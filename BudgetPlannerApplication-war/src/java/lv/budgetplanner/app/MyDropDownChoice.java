/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.budgetplanner.app;

import java.util.Arrays;
import java.util.List;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.IChoiceRenderer;
import org.apache.wicket.model.IModel;

/**
 *
 * @author Maxim
 */
public class MyDropDownChoice extends DropDownChoice<Integer> {

    private static final List<Integer> choices = Arrays.asList(52, 26, 12, 4, 1);
    static final IChoiceRenderer<Integer> renderer = new IChoiceRenderer<Integer>() {
            @Override
            public Object getDisplayValue(Integer value) {
                switch (value) {
                    case 52:
                        return "Weekly";
                    case 26:
                        return "Forthnightly";
                    case 12:
                        return "Monthly";
                    case 4:
                        return "Quarterly";
                    case 1:
                        return "Annually";
                    default:
                        throw new IllegalStateException(value + " is not mapped!");
                }
            }

            @Override
            public String getIdValue(Integer object, int index) {
                return String.valueOf(choices.get(index));
            }
        };

    public MyDropDownChoice(String id, IModel<Integer> model) {
        super(id, model, choices, renderer);
    }
}
