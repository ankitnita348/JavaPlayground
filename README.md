# JavaPlayground
A dedicated workspace for mastering Core Java concepts, including Object-Oriented Programming (OOP), Collections Framework, Multithreading, and Exception Handling. This workspace serves as a hands-on environment for writing, testing, and optimizing Java programs, ensuring a strong foundation in Java development


📌 Understanding Methods in Java

🚀 What are Methods in Java?

A method in Java is a block of code that performs a specific task and can be reused multiple times.
✅ Why Use Methods?

    Code Reusability – Write once, use multiple times.
    Modularity – Break large programs into smaller, manageable parts.
    Readability – Makes code easier to understand.
    Maintainability – Easier to debug and update code.
    Avoid Repetition – No need to write the same logic repeatedly.

🔹 Program Without Methods (Code Repetition)

❌ Problem: Code repetition, harder to maintain.

public class WithoutMethod {

	public static void main(String[] args) {

		/* simple Java program without methods to add two numbers multiple times: */
		int a = 5, b = 6;
		int sum = a + b;
		System.out.println("Sum : " + sum);

		int x = 15, y = 25;
		int sum2 = x + y;
		System.out.println("Sum: " + sum2);

		int p = 30, q = 40;
		int sum3 = p + q;
		System.out.println("Sum: " + sum3);
	}

}

🔹 Program Using Methods (Reusable Code)

✅ Solution: Better code structure, reusable logic.

public class WithMethod {
	public static int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		System.out.println("Sum : " + add(5, 10));
		System.out.println("Sum : " + add(5, 1));
		System.out.println("Sum : " + add(5, 2));
	}

}


📌 Conclusion

Using methods improves efficiency, readability, and maintainability in Java programming.

💡 Want to contribute? Feel free to open a Pull Request or Issue. 🚀
🔗 Follow Me for More Java Content

📧 Email: ankitnita348@gmail.com
🔗 GitHub: https://github.com/ankitnita348/JavaPlayground
