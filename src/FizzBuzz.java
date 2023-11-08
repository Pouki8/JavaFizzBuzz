

class FizzBuzz {
  public static String check(int a) {


	        	  if (a<=1) {
	        		  return ("Ce nombre est inférieur à 1");
	        	  } else if (a>=100) {
	        		  return("Ce nombre est supérieur à 100");
	        	  } else if (a % 3 == 0 && a % 5 == 0) {
	                  return("FizzBuzz");
	              } else {
	                  if (a % 5 == 0) {
	                      return("Buzz");
	                  } else {
	                      if (a % 3 == 0) {
	                          return("Fizz");
	                      } else {
	                          return Integer.toString(a);
	                      }
	                  }
	              }
	  }
  }

