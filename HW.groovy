println "hello world!"
println "is that really all you want me to do?"
println "what about some sort of calculation? How about I multiply some numbers for you?"
print "Enter a number: "
String str = System.console().readLine()
double num1 = Double.parseDouble(str)
print "Enter another number: "
String str1 = System.console().readLine()
double num2 = Double.parseDouble(str1)
double answer = num1*num2
println num1 + " multiplied by " + num2 + " is " + answer
println "how about a game of poker?"
print "take 5 cards and key in their numbers and suits: "
 