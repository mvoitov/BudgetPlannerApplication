/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.budgetplanner.login;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.mapper.parameter.PageParameters;

/**
 *
 * @author Maxim
 */
public final class SignOut extends WebPage {

    public SignOut(final PageParameters parameters) {
        getSession().invalidate();
    }
}
