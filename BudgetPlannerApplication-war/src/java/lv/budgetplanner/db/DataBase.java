/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.budgetplanner.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.wicket.Session;

/**
 *
 * @author Maxim
 */
public class DataBase {

    public static boolean selectUsernameFromDbUserTable(String username) {
        String usernameFromDb = "";
        boolean bool = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
            Statement st = (Statement) con.createStatement();
            String selectTableSQL = "SELECT * FROM `user`";
            ResultSet rs = st.executeQuery(selectTableSQL);
            while (rs.next()) {
                usernameFromDb = rs.getString("Username");
                if (username.equals(usernameFromDb)) {
                    bool = true;
                }
            }
        } catch (Exception e) {
        }
        return bool;
    }

    public static boolean selectPasswordFromDbUserTable(String password) {
        String passwordFromDb = "";
        boolean bool = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
            Statement st = (Statement) con.createStatement();
            String selectTableSQL = "SELECT * FROM `user`";
            ResultSet rs = st.executeQuery(selectTableSQL);
            while (rs.next()) {
                passwordFromDb = rs.getString("Password");
                if (password.equals(passwordFromDb)) {
                    bool = true;
                }
            }
        } catch (Exception e) {
        }
        return bool;
    }

    public static void insertRecordIntoDbUserTable(String usernameValue, String passwordValue) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
            Statement st = (Statement) con.createStatement();
            String insertTableSQL = "INSERT INTO test.`user` (`Username`, `Password`) VALUES ('" + usernameValue + "', '" + passwordValue + "');";
            st.executeUpdate(insertTableSQL);
            st.close();
        } catch (Exception e) {
        }
    }

    public static boolean usernameIsNotAlreadyTaken(String usernameValue) {
        String usernameFromDb = "";
        boolean bool = true;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
            Statement st = (Statement) con.createStatement();
            String selectTableSQL = "SELECT * FROM `user`";
            ResultSet rs = st.executeQuery(selectTableSQL);
            while (rs.next()) {
                usernameFromDb = rs.getString("Username");
                if (usernameValue.equals(usernameFromDb)) {
                    bool = false;
                }
            }
        } catch (Exception e) {
        }
        return bool;
    }

    static List<String> selectBudgetPlannersNames(String username) {
        ArrayList<String> budgetPlannersNamesList = new ArrayList<String>();
        String budgetPlannerName;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
            Statement st = (Statement) con.createStatement();
            String selectTableSQL = "select `Budget name` from budgetplace where `Username`='" + username + "'";
            ResultSet rs = st.executeQuery(selectTableSQL);
            while (rs.next()) {
                budgetPlannerName = rs.getString("Budget name");
                budgetPlannersNamesList.add(budgetPlannerName);
            }
        } catch (Exception e) {
        }
        if (budgetPlannersNamesList.isEmpty()) {
            budgetPlannersNamesList.add("You don't have saved budgets");
        }
        return budgetPlannersNamesList;
    }
    public static String budgetNameDB;
    public static String usernameDB;

    static boolean saveBudget(String budgetName) {

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();

        boolean bool = true;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
            Statement st = (Statement) con.createStatement();
            String selectTableSQL = "SELECT * from budgetplace";
            ResultSet rs = st.executeQuery(selectTableSQL);
            while (rs.next()) {
                usernameDB = rs.getString("Username");
                budgetNameDB = rs.getString("Budget name");
            }
            if (budgetName.equals(budgetNameDB) && usernameDB.equals(((SignInSession) Session.get()).getUser().toString())) {
                try {
                    String insertTableSQL = "UPDATE test.budgetplace SET `You take home pay` = " + Income.incomeFields.youTakeHomePayInput + ", `Your partner take home pay` = " + Income.incomeFields.yourPartnersTakeHomePayInput + ", `Bonuses overtime` = " + Income.incomeFields.bonusesOvertimeInput + ", `Income from savings and investments` = " + Income.incomeFields.incomeFromSavingsAndInvestmentsInput + ", `Centreling benefits` = " + Income.incomeFields.centrelingBenefitsInput + ", `Family benefits patments` = " + Income.incomeFields.familyBenefitsPaymentsInput + ", `Child support reseived` = " + Income.incomeFields.childSupportReseivedInput + ", `Other income` = " + Income.incomeFields.otherInput + ", `Income total` = " + Income.incomeFields.incomeTotal + ", `Rent montage` = " + FinancialCommitments.outgoingFields.rentMontageInput + ", `Car loan repayments` = " + FinancialCommitments.outgoingFields.carLoanRepaymentsInput + ", `Other loan repayments` = " + FinancialCommitments.outgoingFields.otherLoanRepaymentsInput + ", `Credit card interests` = " + FinancialCommitments.outgoingFields.creditCardInterestsInput + ", `Voluntary super contributions` = " + FinancialCommitments.outgoingFields.voluntarySuperContributionsInput + ", `Savings` = " + FinancialCommitments.outgoingFields.savingsInput + ", `Child support payments` = " + FinancialCommitments.outgoingFields.childSupportPaymentsInput + ", `Donations charity` = " + FinancialCommitments.outgoingFields.donationsCharityInput + ", `Pocket monet` = " + FinancialCommitments.outgoingFields.pocketMoneyInput + ", `Other financial commitments` = " + FinancialCommitments.outgoingFields.otherInput + ", `Financial commitments total` = " + FinancialCommitments.outgoingFields.financialCommitmentsTotal + " WHERE `Username` = '" + ((SignInSession) Session.get()).getUser().toString() + "' AND `Budget name` = '" + budgetName + "';";
                    st.executeUpdate(insertTableSQL);
                    st.close();
                } catch (Exception e) {
                }
            } else {
                try {
                    String insertTableSQL = "INSERT INTO test.budgetplace (`Username`, `Budget name`, `Budget date`, `You take home pay`, `Your partner take home pay`, `Bonuses overtime`, `Income from savings and investments`, `Centreling benefits`, `Family benefits patments`, `Child support reseived`, `Other income`, `Income total`, `Rent montage`, `Car loan repayments`, `Other loan repayments`, `Credit card interests`, `Voluntary super contributions`, `Savings`, `Child support payments`, `Donations charity`, `Pocket monet`, `Other financial commitments`, `Financial commitments total`) VALUES ('" + ((SignInSession) Session.get()).getUser().toString() + "', '" + budgetName + "', '" + dateFormat.format(date) + "', '" + Income.incomeFields.youTakeHomePayInput + "', '" + Income.incomeFields.yourPartnersTakeHomePayInput + "', '" + Income.incomeFields.bonusesOvertimeInput + "', '" + Income.incomeFields.incomeFromSavingsAndInvestmentsInput + "', '" + Income.incomeFields.centrelingBenefitsInput + "', '" + Income.incomeFields.familyBenefitsPaymentsInput + "', '" + Income.incomeFields.childSupportReseivedInput + "', '" + Income.incomeFields.otherInput + "', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);";
                    st.executeUpdate(insertTableSQL);
                    st.close();
                } catch (Exception e) {
                }
            }
        } catch (Exception e) {
            bool = false;
        }
        return bool;
    }

    static void getPageReadyBeforeResponse() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
            Statement st = (Statement) con.createStatement();
            String selectTableSQL = "SELECT * FROM budgetplace WHERE `Username`='" + ((SignInSession) Session.get()).getUser().toString() + "';";
            ResultSet rs = st.executeQuery(selectTableSQL);
            while (rs.next()) {
                Income.incomeFields.youTakeHomePayInput = rs.getInt("You take home pay");
            }
        } catch (Exception e) {
        }
    }

    static boolean deleteBudget(String budgetName) {
        boolean bool = true;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
            Statement st = (Statement) con.createStatement();
            String selectTableSQL = "SELECT * from budgetplace";
            ResultSet rs = st.executeQuery(selectTableSQL);
            while (rs.next()) {
                usernameDB = rs.getString("Username");
                budgetNameDB = rs.getString("Budget name");
            }
            if (budgetName.equals(budgetNameDB) && usernameDB.equals(((SignInSession) Session.get()).getUser().toString())) {
                try {
                    String insertTableSQL = "DELETE FROM test.budgetplace WHERE `Username` = '" + ((SignInSession) Session.get()).getUser().toString() + "' AND `Budget name` = '" + budgetName + "'";
                    st.executeUpdate(insertTableSQL);
                    st.close();
                } catch (Exception e) {
                }
            } else {
                bool = false;
            }
        } catch (Exception e) {
            bool = false;
        }
        return bool;
    }
}
