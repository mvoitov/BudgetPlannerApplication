/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.budgetplanner.app;

import org.apache.wicket.markup.html.WebPage;

/**
 *
 * @author Maxim
 */
public final class ErrorPage404 extends WebPage {

    public ErrorPage404() {
    }

    protected void configureResponse() {
        //super.configureResponse();
        //getWebRequestCycle().getWebResponse().getHttpServletResponse().setStatus(HttpServletResponse.SC_NOT_FOUND);
    }

    @Override
    public boolean isVersioned() {
        return false;
    }

    @Override
    public boolean isErrorPage() {
        return true;
    }
}
