/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.budgetplanner.validators;

import org.apache.wicket.validation.CompoundValidator;
import org.apache.wicket.validation.validator.PatternValidator;
import org.apache.wicket.validation.validator.StringValidator;

public class UsernameValidator extends CompoundValidator<String> {

    private static final long serialVersionUID = 1l;

    public UsernameValidator() {
        add(StringValidator.lengthBetween(5, 25));
        add(new PatternValidator("[a-z0-9_-]+"));
    }
}
