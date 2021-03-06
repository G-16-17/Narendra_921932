package session1;

public class MovableAdapterImpl implements MovableAdapter {

	BugattiVeyron buggattiVeyron = new BugattiVeyron();
	private Movable luxuryCars = buggattiVeyron;

	// standard constructors
	@Override
	public double getSpeed() {
		return convertMPHtoKMPH(luxuryCars.getSpeed());
	}

	private double convertMPHtoKMPH(double mph) {
		return mph * 1.60934;
	}

	@Override
	public double getPrice() {
		return convertUsdtoEuro(luxuryCars.getPrice());
	}

	private double convertUsdtoEuro(double price) {
		return price * 0.82;
	}
}
