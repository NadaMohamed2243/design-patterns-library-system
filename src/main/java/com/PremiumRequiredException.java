// PremiumRequiredException.java
package com;

public class PremiumRequiredException extends RuntimeException {
    public PremiumRequiredException() {
        super("Premium membership is required for this operation");
    }
}