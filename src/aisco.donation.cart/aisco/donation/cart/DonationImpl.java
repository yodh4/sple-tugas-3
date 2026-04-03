package aisco.donation.cart;

import aisco.donation.core.DonationComponent;
import aisco.program.core.Program;
import java.util.ArrayList;
import java.util.List;

public class DonationImpl extends DonationComponent {
    private List<CartItem> donationCart;

    public DonationImpl()
    {
        System.out.println("\nDonation via AISCO Add-to-Cart");
        donationCart = new ArrayList<>();
    }

    public void addToCart(Program program, int amount)
    {
        donationCart.add(new CartItem(program, amount));
    }

    public void setDonorInfo(String name, String email, String phone, String paymentMethod)
    {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.paymentMethod = paymentMethod;
    }

    public int getCartTotal()
    {
        int total = 0;
        for (int i = 0; i < donationCart.size(); i++) {
            total = total + donationCart.get(i).getAmount();
        }
        return total;
    }

    public void addDonation()
    {
        System.out.println("Create one donation transaction for many programs");
    }

    public void getDonation()
    {
        System.out.println("Donor: " + name + " | Payment Method: " + paymentMethod);
        System.out.println("Donation Cart:");
        System.out.println(donationCart);
        System.out.println("Total Donation: " + getCartTotal());
    }
}
