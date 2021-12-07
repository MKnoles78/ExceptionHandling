//Chained Exceptions
public class UsingChainedExceptions {

	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception exception) {
			// exceptions thrown from method1
			exception.printStackTrace();
		}
	}

	// call method2; throws exception back to main
	public static void method1() throws Exception {
		try {
			method2();
		} catch (Exception exception) {
			// exception thrown from method2
			throw new Exception("Exception thrown in method1", exception);
		}
	}
}
