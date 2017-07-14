$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cucumber/calculator.feature");
formatter.feature({
  "line": 1,
  "name": "Calculator",
  "description": "\nAs a user\nI want to use a calculator\nSo that I don\u0027t need to calculate myself",
  "id": "calculator",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 7,
  "name": "Add two numbers",
  "description": "",
  "id": "calculator;add-two-numbers",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I have a calculator",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I add 2 and 3",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "the result should be 5",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});