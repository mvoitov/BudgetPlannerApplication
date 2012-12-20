/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.budgetplanner.app;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.request.mapper.parameter.PageParameters;

/**
 *
 * @author Maxim
 */
public final class ShoppingTransport extends BasePage {

    public ShoppingTransport() {
        add(new Label("label1", "BlahBlahBlah"));

        add(new Link("nextPage") {
            @Override
            public void onClick() {
                setResponsePage(EntertainmentEatingOut.class);
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
