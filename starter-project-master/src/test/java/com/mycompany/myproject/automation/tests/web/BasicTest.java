package com.mycompany.myproject.automation.tests.web;

import com.mycompany.myproject.automation.data.Constants;
import com.mycompany.myproject.automation.frameworksupport.Groups;
import com.mycompany.myproject.automation.frameworksupport.MyApplicationTestCase;
import com.pwc.core.framework.annotations.MaxRetryCount;
import com.pwc.core.framework.listeners.Retry;
import org.testng.annotations.Test;

import static com.pwc.assertion.AssertService.assertContains;
import static com.pwc.logging.service.LoggerService.*;

public class BasicTest extends MyApplicationTestCase {

   // public static final String SEARCH_TEXT = "pacificwebconsulting";

    @Override
    public void beforeMethod() {
    }

    @Override
    public void afterMethod() {
    }

    @MaxRetryCount(1)
    @Test(retryAnalyzer = Retry.class, groups = {Groups.ACCEPTANCE_TEST})
    public void testBasic() {

        FEATURE("Feature Under Test");
        SCENARIO("Scenario Being Tested Here");
            webElementExists(Constants.USERNAME_INPUT);
            webAction(Constants.USERNAME_INPUT, Constants.DEFAULT_USERNAME);
            webElementExists(Constants.NEXT_BUTTON);
            webAction(Constants.NEXT_BUTTON);
            webElementExists(Constants.PASSWORD_INPUT);
            webAction(Constants.PASSWORD_INPUT, Constants.DEFAULT_PASSWORD);
            webElementExists(Constants.LOGIN_BUTTON);
            webAction(Constants.LOGIN_BUTTON);

        GIVEN("I have done something");
        webElementVisible(Constants.LOGO_IMAGE);
        webElementExists(Constants.BURNDOWN_GADGET);
        webElementExists(Constants.INTRODUCTION_GADGET);

        WHEN("I do something");
        webElementExists(Constants.EDIT_LAYOUT_BUTTON);
        webAction(Constants.EDIT_LAYOUT_BUTTON);
        webElementExists(Constants.DASHBOARD_LAYOUT_ANCHOR);
        webAction(Constants.DASHBOARD_LAYOUT_ANCHOR);


        THEN("Something happens as expected");
        webElementExists(Constants.BURNDOWN_GADGET);

        webElementExists(Constants.ADD_GADGET_ANCHOR);

        webAction(Constants.ADD_GADGET_ANCHOR);

        webElementExists(Constants.BUBBLE_CHART_ADD_GADGET_BUTTON);
        webAction(Constants.BUBBLE_CHART_ADD_GADGET_BUTTON);
        webElementExists(Constants.CLOSE_ADD_GADGET_ANCHOR);
        webAction(Constants.CLOSE_ADD_GADGET_ANCHOR);
        webElementExists(Constants.BUBBLE_CHART_GADGET);
        String gadgetVal = getWebElementText(Constants.BUBBLE_CHART_GADGET);
        assertContains("Verified gadget added is ", gadgetVal, Constants.BUBBLE_CHART_TEXT );

     //   webElementHoverTextContains(Constants.BUBBLE_CHART_GADGET, Constants.BUBBLE_CHART_TEXT);
     //   webElementExists(Constants.DELETE_GADGET);
     //   webAction(Constants.DELETE_GADGET);
     //   webElementExists(Constants.DELETE_ANCHOR);

        System.out.println("Finishing Basic Test");



    }

}
