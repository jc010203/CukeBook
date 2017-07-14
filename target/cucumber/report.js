$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cucumber/calculator.feature");
formatter.feature({
  "line": 1,
  "name": "Cash Withdrawal",
  "description": "",
  "id": "cash-withdrawal",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Successful withdrawal from an account in credit",
  "description": "",
  "id": "cash-withdrawal;successful-withdrawal-from-an-account-in-credit",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I have deposited $100 in my account",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I request $20",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "$20 should be dispensed",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 18
    }
  ],
  "location": "Steps.iHaveDeposited$InMyAccount(int)"
});
formatter.result({
  "duration": 157962834,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "20",
      "offset": 11
    }
  ],
  "location": "Steps.iRequest$(int)"
});
formatter.result({
  "duration": 2095840,
  "error_message": "cucumber.api.PendingException: TODO: implement me\n\tat steps.nicebank.Steps.iRequest$(Steps.java:28)\n\tat ✽.When I request $20(cucumber/calculator.feature:5)\n",
  "status": "pending"
});
formatter.match({
  "arguments": [
    {
      "val": "20",
      "offset": 1
    }
  ],
  "location": "Steps.$ShouldBeDispensed(int)"
});
formatter.result({
  "status": "skipped"
});
});