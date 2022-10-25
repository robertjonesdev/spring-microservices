package com.robertjones.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
