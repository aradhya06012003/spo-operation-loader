package com.spo.core_app.ennums;

public enum Currency {

    INR("INDIAN RUPEE", "Rs."),
    USD("US DOLLAR", "$"),
    EUR("EURO", "EUR"),
    GBP("BRITISH POUND", "€"),
    JPV("JAPANESE YEN", "¥"),
    AUD("AUSTRALIAN DOLLAR", "A$"),
    CAD("CANADIAN DOLLAR", "C$"),
    CHF("SWISS FRANC", "CHF"),
    CNY("CHINESE YUAN", "¥"),
    SGD("SINGAPORE DOLLAR", "S$"),
    AED("UAE DIRHAM", "د.إ "),
    SAR("SAUDI RIYAL", "﷼.");

    private final String displayName;
    private final String symbol;

    Currency(String displayName, String symbol) {
        this.displayName = displayName;
        this.symbol = symbol;
    }

    public String getDisplayName(){
        return displayName;
    }

    public String getSymbol(){
        return symbol;
    }
}
