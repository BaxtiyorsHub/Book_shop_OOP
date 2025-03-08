package org.example.requests;

public record ProfileRequest (
        String name,
        String phone,
        String password,
        Short age
){
}
