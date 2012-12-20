/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.budgetplanner.login;

import lv.budgetplanner.db.DataBase;
import org.apache.wicket.authroles.authentication.AuthenticatedWebSession;
import org.apache.wicket.authroles.authorization.strategies.role.Roles;
import org.apache.wicket.request.Request;

/**
 *
 * @author Maxim
 */
public final class SignInSession extends AuthenticatedWebSession {

    private String user;

    public SignInSession(Request request) {
        super(request);
    }

    @Override //нужно ли?
    public final boolean authenticate(final String username, final String password) {
        if (user == null) {
            if ((DataBase.selectUsernameFromDbUserTable(username) == true) && (DataBase.selectPasswordFromDbUserTable(password) == true)) {
                user = username;
            }
        }
        return user != null;
    }

    public String getUser() {
        return user;
    }

    public void setUser(final String user) {
        this.user = user;
    }

    @Override
    public Roles getRoles() {
        return null;
    }
}
