# UniqueEmailValidator
A simple Java project to identify unique email address from list of email address

Concepts used
1. Substring
2. Hashsets

Solutions for the unique email address is handled with three functions. All three functions are created under the class EmailUtils so that it becomes easy to write test cases for each rule of local name and domain name.
1.	getValidEmail
Functions takes in array of email address and returns a hash set (unique addresses) of valid unique addresses 

2.	getLocalName
Functions takes in string parameter which will be the local name. Functions removes the dot operator and plus sign using SubString and replace functions of String class. Finally returns valid local names

3.	isDomainNameValid
Functions takes in string parameter which will be the domain address. By calculating the middle index of the parameter, presence of “ABC” character is validated. Function returns Boolean flag indicating whether parameter passed is a valid domain name.

All the unit test cases written successfully verify the rules for identifying a valid unique address from the given set or arrays. 

