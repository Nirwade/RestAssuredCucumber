$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/restAPI/apitest.feature");
formatter.feature({
  "name": "Perform the CURD Operations",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To Perform the POST Operation on Employe 08",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "The base URI is \"http://localhost:3000/employees\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefs.the_base_URI_is(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I perform the POST Operation with \"name\" and \"salary\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefs.i_perform_the_post_operation_with_and1(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Responsecode should be",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefs.response_code_should_be()"
});
formatter.result({
  "status": "passed"
});
});