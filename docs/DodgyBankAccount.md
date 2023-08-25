# Problems identified with DodgyBankAccount Class 

1. Access modifier in all the fields are marked as `public` which means 
it can be access and modified publicly. Hence, there is a risk of data manipulation.
So all the field should be marked as `private`.

2. The `accountNumber` set by constructor it should not be changed. 
So the `accountNumber` field should be final.

3. The `rewardAmount` is set to 50 and doesn't change hence it should be declared 
`final`.

4. The name of the `getAccountBalance` method is misleading because getter methods 
have a return type whereas this method does not have return type so the method 
name naming should be appropriate like `displayAccountBalance`.

5. The `addReward` method is declared as public, but it is used internally only hence
it should be declared `private`.