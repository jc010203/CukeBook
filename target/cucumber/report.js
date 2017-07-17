$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cucumber/withdrawal.feature");
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
  "name": "I have deposited $100.00 in my account",
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
      "val": "100.00",
      "offset": 18
    }
  ],
  "location": "AccountSteps.iHaveDeposited$InMyAccount(Money)"
});
formatter.result({
  "duration": 151295977,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "20",
      "offset": 11
    }
  ],
  "location": "TellerSteps.iRequest$(int)"
});
formatter.result({
  "duration": 3436002,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "20",
      "offset": 1
    }
  ],
  "location": "CashSlotSteps.$ShouldBeDispensed(int)"
});
formatter.result({
  "duration": 4089240,
  "status": "passed"
});
});