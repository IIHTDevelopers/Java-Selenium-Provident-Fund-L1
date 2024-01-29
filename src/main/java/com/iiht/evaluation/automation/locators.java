package com.iiht.evaluation.automation;

import java.util.HashMap;
import java.util.Map;

public class locators {
    public static final Map<String, String> money_control_element = new HashMap<>();

    static {
       

       money_control_element.put("main_menu", "");
        money_control_element.put("sub_menu", "");

       
        money_control_element.put("your_age_input", "");
        money_control_element.put("your_basic_salary_monthly_input", "");
        money_control_element.put("your_contribution_to_epf_input",  "");
        money_control_element.put("your_employer_contribution_to_epf_input",  "");
        money_control_element.put("average_annual_increase_in_salary_you_expect_input",  "");
        money_control_element.put("age_when_you_intend_to_retire_input",  "");
        money_control_element.put("current_epf_balance_if_any_input",  "");
        money_control_element.put("current_interest_rate_input",  "");
        money_control_element.put("pf_calculator_calculate_button",  "");
        money_control_element.put("pf_cal_result_div",  "");

       
    }
}
