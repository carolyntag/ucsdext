package com.mycompany.myproject.automation.data;

public interface Constants {

    // Application Defaults
    String DEFAULT_USERNAME = "UCSD.Ext2@gmail.com";
    String DEFAULT_PASSWORD = "UCSD.Ext";

    // IMG Elements
    String LOGO_IMAGE = "//h1[@id='logo']";

    // ANCHOR Elements
    String CORE_ANCHOR = "core-microservice";
    String RUNNER_ANCHOR = "runner-microservice";
    String ADD_GADGET_ANCHOR = "//a[@id='add-gadget']";
    String DASHBOARD_LAYOUT_ANCHOR = "//a[@id='layout-aa']";
    String CLOSE_ADD_GADGET_ANCHOR = "//a[@class='aui-dialog2-header-close']//span[contains(@class,'aui-icon') and contains(text(),'Close')]";
    String DELETE_GADGET = "//a[contains(@class,'ui-dd-trigger')]//span[contains(@class,'aui-icon') and contains(text(),'more')]";
    String DELETE_ANCHOR = "//a[contains(@class,'item-link delete') and contains(text(),'Delete')]";

    // HEADING Elements
    String BURNDOWN_GADGET = "//div[@id='gadget-10304-chrome']//div[@class='dashboard-item-header']//h3[@id='gadget-10304-title']";
    String INTRODUCTION_GADGET = "//h3[@id='gadget-10300-title']";
    String BUBBLE_CHART_GADGET = "//h3[@title='Bubble Chart']";

    // INPUT Elements
    String USERNAME_INPUT = "//input[@id='username']";
    String PASSWORD_INPUT = "//input[@id='password']";

    // BUTTON Elements
    String EDIT_LAYOUT_BUTTON = "//a[@id='layout-changer']";
    String NEXT_BUTTON = "//button[@id='login-submit']//span[contains(text(),'Next')]";
    String LOGIN_BUTTON = "//button[@id='login-submit']//span[contains(text(),'Log in')]";
    String BUBBLE_CHART_ADD_GADGET_BUTTON = "//button[@data-item-id='com.atlassian.jira.gadgets:bubble-chart-dashboard-item' and contains(text(),'Add gadget')]";

    //TEXT elements
    String BUBBLE_CHART_TEXT = "Bubble Chart";

    // SELECT Elements

    // DIV Elements

    // TABLE Elements

    // RADIO Elements

    // SPAN Elements

    // STATIC Text

}
