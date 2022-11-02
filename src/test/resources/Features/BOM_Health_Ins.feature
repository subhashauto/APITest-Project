Feature: BOM-Health Insurance: Manipal Cigna.

  Scenario: Generate Quote/Create Proposal/Customer Consent/Iniitate Payment/Approve Payment for Manipal Signa  
    Given Login with "User_Id" and "User_Pass"
    Then On User home page enter "CIF" and Click on Quick Quote
    Then Select Health Insurance product
    Then Enter mandatory details and generate the quote
    Then Click on Buy Now
    Then Click on Yes button to get policy immediately
    Then On Proposal form fill the Medical details and click on Next button    
    Then Fill the Insured details and click on Next button
    Then Fill the Proposer details and click on Next button
    Then Fill the Contact Info details and click on Next button
    Then View proposal summary and click on Submit button
    Then Give the customer consent
    Then Make the payment
    Then Check the policy status and initiate the payment
    Then Login with BOM PaymentApprover and approve the payment
    Then Approve the payment and check the policy status
    
    
    Scenario:
    
   

    #Examples: 
      #| username   |  | password  ||Retailer_id| |Retailer_Pass|
      #| 7021530275 |  | Admin@123 | |7021530275| |Admin@123|   
#Scenario: Open Mobile Recharge Service
#Then Open Service Mobile Recharge
