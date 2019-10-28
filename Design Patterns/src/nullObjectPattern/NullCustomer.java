package nullObjectPattern;

public class NullCustomer extends AbstractCustomer {

	@Override
	public String getName() {
		return "Customer doesn`t exist in the Database";
	}

	@Override
	public boolean isNil() {
		return true;
	}
}