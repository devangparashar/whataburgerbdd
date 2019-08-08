$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Whataburger Login Feature",
  "description": "",
  "id": "whataburger-login-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Whataburger Login Test Scenario",
  "description": "",
  "id": "whataburger-login-feature;whataburger-login-test-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is in welcome page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user is on Home Page and verify wab logo",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user signout the app",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "whataburger-login-feature;whataburger-login-test-scenario;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 12,
      "id": "whataburger-login-feature;whataburger-login-test-scenario;;1"
    },
    {
      "cells": [
        "devangwa998@gmail.com",
        "burger01"
      ],
      "line": 13,
      "id": "whataburger-login-feature;whataburger-login-test-scenario;;2"
    },
    {
      "cells": [
        "wabburger@gmail.com",
        "burger01"
      ],
      "line": 14,
      "id": "whataburger-login-feature;whataburger-login-test-scenario;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Whataburger Login Test Scenario",
  "description": "",
  "id": "whataburger-login-feature;whataburger-login-test-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is in welcome page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters \"devangwa998@gmail.com\" and \"burger01\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user is on Home Page and verify wab logo",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user signout the app",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefination.user_is_in_welcome_page()"
});
formatter.result({
  "duration": 22393545050,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "devangwa998@gmail.com",
      "offset": 13
    },
    {
      "val": "burger01",
      "offset": 41
    }
  ],
  "location": "LoginStepDefination.user_enters_credentials(String,String)"
});
formatter.result({
  "duration": 7225754829,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_is_on_Home_Page_and_verify_wab_logo()"
});
formatter.result({
  "duration": 392533,
  "error_message": "java.lang.NullPointerException\r\n\tat StepDefinitions.LoginStepDefination.user_is_on_Home_Page_and_verify_wab_logo(LoginStepDefination.java:44)\r\n\tat ✽.Then user is on Home Page and verify wab logo(login.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginStepDefination.user_signout_the_app()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefination.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 14,
  "name": "Whataburger Login Test Scenario",
  "description": "",
  "id": "whataburger-login-feature;whataburger-login-test-scenario;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is in welcome page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters \"wabburger@gmail.com\" and \"burger01\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user is on Home Page and verify wab logo",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user signout the app",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefination.user_is_in_welcome_page()"
});
formatter.result({
  "duration": 11951099490,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "wabburger@gmail.com",
      "offset": 13
    },
    {
      "val": "burger01",
      "offset": 39
    }
  ],
  "location": "LoginStepDefination.user_enters_credentials(String,String)"
});
formatter.result({
  "duration": 16410155,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_is_on_Home_Page_and_verify_wab_logo()"
});
formatter.result({
  "duration": 323697,
  "error_message": "java.lang.NullPointerException\r\n\tat StepDefinitions.LoginStepDefination.user_is_on_Home_Page_and_verify_wab_logo(LoginStepDefination.java:44)\r\n\tat ✽.Then user is on Home Page and verify wab logo(login.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginStepDefination.user_signout_the_app()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefination.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("signup.feature");
formatter.feature({
  "line": 1,
  "name": "Whataburger Sign up Account",
  "description": "",
  "id": "whataburger-sign-up-account",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 2,
      "value": "#datadriven approach"
    },
    {
      "line": 4,
      "value": "#@SmokeTest"
    }
  ],
  "line": 5,
  "name": "Whataburger Signup Test Sceanrio",
  "description": "",
  "id": "whataburger-sign-up-account;whataburger-signup-test-sceanrio",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "User is in sign up page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user enters details in all fields",
  "rows": [
    {
      "cells": [
        "FirstName",
        "Last name",
        "Phone number",
        "Create Password",
        "Confirm Password"
      ],
      "line": 9
    },
    {
      "cells": [
        "Den",
        "Dude",
        "8496348534",
        "burger01",
        "burger01"
      ],
      "line": 10
    }
  ],
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 11,
      "value": "#\t|Devie    |denal     |8496348537  |burger01        |burger01        |"
    }
  ],
  "line": 13,
  "name": "user enters email id",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user taps on email checkbox \u0026 tap on Signup button",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user signout",
  "keyword": "Then "
});
formatter.match({
  "location": "SignupStepDefination.user_is_in_sign_up_page()"
});
