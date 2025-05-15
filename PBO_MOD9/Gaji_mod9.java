public class Gaji_mod9 extends Karyawan_mod9 {
    private double gaji; 

    public Gaji_mod9(String name, String address, int number, double gaji) {
        super(name, address, number);
        setGaji(gaji); 
    }

    public void mailCheck() {
        System.out.println("Within mailCheck Gaji");
        System.out.println("Mailing check to " + getName() + " with gaji " + gaji);
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double newGaji) {
        if (newGaji >= 0.0) {
            gaji = newGaji;
        }
    }

    public double computePay() {
        System.out.println("Computing gaji pay for " + getName());
        return gaji / 52;
    }
}



