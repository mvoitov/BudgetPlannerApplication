/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.budgetplanner.app;

import java.io.Serializable;

/**
 *
 * @author Maxim
 */
public class IncomeFields implements Serializable {

    public Integer youTakeHomePayFrequency = 52,
            yourPartnersTakeHomePayFrequency = 52,
            bonusesOvertimeFrequency = 52,
            incomeFromSavingsAndInvestmentsFrequency = 52,
            centrelingBenefitsFrequency = 52,
            familyBenefitsPaymentsFrequency = 52,
            childSupportReseivedFrequency = 52,
            otherFrequency = 52;
    public Integer youTakeHomePayLabel = 0,
            youTakeHomePayInput = 0,
            yourPartnersTakeHomePayLabel = 0,
            yourPartnersTakeHomePayInput = 0,
            bonusesOvertimeLabel = 0,
            bonusesOvertimeInput = 0,
            incomeFromSavingsAndInvestmentsLabel = 0,
            incomeFromSavingsAndInvestmentsInput = 0,
            centrelingBenefitsLabel = 0,
            centrelingBenefitsInput = 0,
            familyBenefitsPaymentsLabel = 0,
            familyBenefitsPaymentsInput = 0,
            childSupportReseivedLabel = 0,
            childSupportReseivedInput = 0,
            otherLabel = 0,
            otherInput = 0;
    public Integer incomeTotal = 0;
}
