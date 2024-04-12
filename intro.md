# Explaining the skeleton of Java

## Note: The name of the file should be the same with the class name

# 1. let's take "import java.lang.*;" as a case study
- **The "Java.lang" is a Java package that is authomatically imported even when it's not typed**

# 2. let's explain ```public static void main(String[] args)```
**The keyword "public" is an access modifier which is used to define the accessibility of classes, methods, and variables. When used in the context of the main method signature. There are are other access modifiers like "private, and protected
**the main() is a method, any code written in the method will be executed** 


- **Static:** This keyword allows the main method to be called without creating an instance of the class containing it. It means the method belongs to the class itself rather than to instances of the class.

- **void:** This keyword indicates that the main method does not return any value.

- **main:** This is the name of the method. In Java, the main method is the entry point of a Java application. It is the method that the Java Virtual Machine (JVM) calls to start the execution of a program.

- **(String[] args):** This is the parameter list of the main method. It specifies that the main method can accept an array of strings as arguments when it is called. The args parameter allows command-line arguments to be passed to the Java program when it is executed.

# 3. let's explain ```System.out.println("Hello Oluwaseun")```

# 4. Let's explain why we should save the file with the same name as the class 
The reason why do that is because, when we compile, two classes 

 ```import java.lang.*;
class MyFirst{
	public static void main(String arg[])
	{
		System.out.println("Hello World");
	}
}
``` 



- **This above code, is saved as MyFirst.Java, when we compile, we get two files namely MyFirst.java and MyFirst.class**

## Now let's change the class name 

``` import java.lang.*;
class MySecond{
	public static void main(String arg[])
	{
		System.out.println("Hello World");
	}
} 
```

- When we compile, we get three files namely MyFirst.java, MyFirst.class, and MySecond.class meaning another class was created because the class name was changed


# Reading data from the keyboard
**Java provides a class called "Scanner" that is used to read data from different sources"**
This class is present in the "utility package" and it's provided in version5(V5)


``` import java.lang.*;
    import java.util.*;
class Keyboard{
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);
	}
} 
```

## Using the scanner class 
```Scanner scan = new Scanner(System.in);```
- **Scanner:** This is an object
- **Scan:** This is a reference
- **new Scanner:** This is a constructor

- So when using the Scanner class, the above syntax should be followed

# let's create a program to add two variables from the keyboard together


``` import java.lang.*;
    import java.util.*;
class Keyboard{
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);
		int a, b, c;
		System.out.println("Input two numbers");
		a = scan.nextInt();
		b = scan.nextInt();
		c = a+b;
		
		System.out.println("The sum is" + c);
	}
} 
```

# Let's explain some methods under the Scanner class
- **nextInt():** This reads integer
- **nextFloat():** This reads float integers
- **nextDouble():** This reads double integers
- **next():** This reads String
- **nextLine():** This reads sentence
etc

# let's create a program to get a name from the keybord and then print a welcome message

``` import java.lang.*;
    import java.util.*;
class Keyboard{
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);
		String name;

		System.out.println("Input your name");
		name = scan.nextLine();

		System.out.println("Welcome Mr/Mrs" + name)
	}
} 
```