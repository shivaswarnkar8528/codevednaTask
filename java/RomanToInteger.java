import java.util.Scanner;

public class RomanToInteger {
public static int value(char r) {
switch (r) {
case 'I':
return 1;
case 'V':
return 5;
case 'X':
return 10;
case 'L':
return 50;
case 'C':
return 100;
case 'D':
return 500;
case 'M':
return 1000;
default:
return -1;
}
}
public static int convertRomanToInt(String s) {
int result = 0;
for (int i = 0; i < s.length(); i++) {
int current = value(s.charAt(i));
if (i + 1 < s.length()) {
int next = value(s.charAt(i + 1));

if (current < next) {
result -= current;
}
else {
result += current;
}
}
else {
result += current;
}
}
return result;
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
String roman = scan.next();
roman = roman.toUpperCase();
int integer = convertRomanToInt(roman);
System.out.println("The integer value of " + roman + " is " + integer);

scan.close();
}
}
