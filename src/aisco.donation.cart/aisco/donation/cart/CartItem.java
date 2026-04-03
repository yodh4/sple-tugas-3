package aisco.donation.cart;

import aisco.program.core.Program;

public class CartItem {
    private Program program;
    private int amount;

    public CartItem(Program program, int amount)
    {
        this.program = program;
        this.amount = amount;
    }

    public Program getProgram()
    {
        return program;
    }

    public int getAmount()
    {
        return amount;
    }

    public String toString()
    {
        return "- CartItem Program: " + program + ", Amount: " + amount;
    }
}
