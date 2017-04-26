package keywords;

public class SpaceAge {

	private static final double venusYear = 0.61519726;
	private static double spaceAge = 0.00;
	private static final double oneYrOnEarthInSec = 31557600.00 ;
	private static final double mercuryYear = 0.2408467 ;
	private static final double marsYear = 1.8808158;
	private static final double jupiterYear = 11.862615;
	private static final double saturnYear = 29.447498;
	private static final double uranusYear = 84.016846;
	private static final double neptuneYear = 164.79132;

	public SpaceAge(double age) {
		SpaceAge.spaceAge = age;
	}

	public double getSeconds() {
		return spaceAge;
	}

	public double onEarth() {		
		return spaceAge/oneYrOnEarthInSec;
	}

	public double onMercury() {
		
		return spaceAge/(oneYrOnEarthInSec*mercuryYear);
	}

	public double onVenus() {
		return spaceAge/(oneYrOnEarthInSec*venusYear);
	}

	public double onMars() {
		return spaceAge/(oneYrOnEarthInSec*marsYear);
	}

	public double onJupiter() {
		return spaceAge/(oneYrOnEarthInSec*jupiterYear);
	}

	public double onSaturn() {
		return spaceAge/(oneYrOnEarthInSec*saturnYear);
	}

	public double onUranus() {
		return spaceAge/(oneYrOnEarthInSec*uranusYear);
	}

	public double onNeptune() {
		return spaceAge/(oneYrOnEarthInSec*neptuneYear);
	}

}
