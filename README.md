# Recusive_descent_parser
Construct and implement a recursive-descent parser for the grammar S->+SS | -SS | a
The code will parse an arithmentic expression and for the expression that does not belong to the above grammar, it will cause a syntax error
This code does not support using spaces in user input.
Remember that the grammar support only two binary operation ( addition and subtraction) in postfix form.
Remember grammar with left recusive cannot be used in recusive-descent parser.
Example for input:
+aa 
++aa will cause a sytnax error
