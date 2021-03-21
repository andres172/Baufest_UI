$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("BuyProduct.feature");
formatter.feature({
  "line": 1,
  "name": "BuyProduct",
  "description": "",
  "id": "buyproduct",
  "keyword": "Feature"
});
formatter.before({
  "duration": 12732601300,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Add Laptop to Car",
  "description": "",
  "id": "buyproduct;add-laptop-to-car",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@BuyProduct"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User selects laptop category",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User selects first laptop on the list",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User add product to car",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User close the alert message",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User goes to Car section",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Product is added to car",
  "keyword": "Then "
});
formatter.match({
  "location": "BuyProductStep.userSelectsLaptopategory()"
});
formatter.result({
  "duration": 841539500,
  "status": "passed"
});
formatter.match({
  "location": "BuyProductStep.userSelectsFisrtLaptopOnTheList()"
});
formatter.result({
  "duration": 267067365400,
  "status": "passed"
});
formatter.match({
  "location": "BuyProductStep.userAddProductToCar()"
});
formatter.result({
  "duration": 504080900,
  "status": "passed"
});
formatter.match({
  "location": "BuyProductStep.closeTheAlertMessage()"
});
