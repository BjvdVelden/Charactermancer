package Donation;

public class donationFunction {
    private int donation = 10;
    private String ranking = "none";

    public donationFunction(){
    }

    public void donationRanking(int donatie){
        this.donation = donatie;

        if(donatie == 10){
            setRanking("Bronze");
        }

        if(donatie > 10 && donatie < 30){
            setRanking("Silver");
        }
        if(donatie >= 30){
            setRanking("Gold");
        }
    }

    public String getRanking() {
        return this.ranking;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking;
    }
}
