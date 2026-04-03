package aisco.donation.core;

public abstract class DonationDecorator extends DonationComponent {
    public DonationComponent donation;

    public DonationDecorator(DonationComponent donation)
    {
        this.donation = donation;
    }
}
