//Chained Exceptions
public class UsingChainedExceptions {

	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception exception) {
			// exceptions thrown from method1
			exceptions.printStackTrace();
		}
	}

}
