class AvgRain {
    public static void main(String[] args) {
        int April = 12;
	int May = 14;
	int June = 8;
	
	double Average = (double) (April + May + June) / 3.0;

	System.out.println("Rainfall for April\t: " + April);
	System.out.println("Rainfall for May\t: " + May);
	System.out.println("Rainfall for June\t: " + June);
	System.out.println("Average rainfall\t: " + Average);
    }
}