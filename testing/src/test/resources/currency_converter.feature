Feature: As a user I want to use a currency converter
  Scenario: Convert PLN to USD
    Given I have currency converter with input currency "PLN", output currency "USD" and exchange rate 0.26
    When I convert 100 PLN
    Then the receipt should be "PLN->USD=26.0"

  Scenario Outline: Convert PLN to USD
    Given I have currency converter with input currency <input_currency>, output currency <output_currency> and exchange rate <exchange_rate>
    When I convert <input_currency_value> PLN
    Then the receipt should be <receipt>
    Examples:
      | input_currency | output_currency | exchange_rate | input_currency_value | receipt |
      | "PLN"          | "USD"           | 0.26          | 100                  | "PLN->USD:26.0" |
      | "PLN"          | "USD"           | 0.26          | 200                  | "PLN->USD:52.0" |