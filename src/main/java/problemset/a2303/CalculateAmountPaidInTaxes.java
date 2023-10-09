package problemset.a2303;

public class CalculateAmountPaidInTaxes {
    public double calculateTax(int[][] brackets, int income) {
        double res = 0.0;
        int prevTaxBracketEarnings = 0;
        for (int i = 0; i < brackets.length; i++) {
            int percentage = brackets[i][1];
            int balance = brackets[i][0];

            if (income < balance) {
                return res + (income - prevTaxBracketEarnings) * percentage / 100.0;
            }

            int earnings = brackets[i][0] - prevTaxBracketEarnings;
            res += earnings * percentage / 100.0;
            prevTaxBracketEarnings = brackets[i][0];

        }

        return res;
    }
}
