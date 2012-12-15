/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.budgetplanner.app;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
/**
 *
 * @author Maxim
 */
public final class EntertainmentEatingOut extends BasePage {

    public EntertainmentEatingOut() {
        add(new Label("label1", "BlahBlahBlah"));

        add(new Link("nextPage") {
            @Override
            public void onClick() {
                setResponsePage(Results.class);
            }
        });
        add(new Link("savePage") {
            @Override
            public void onClick() {
                setResponsePage(getPage());
            }
        });
    }
}
