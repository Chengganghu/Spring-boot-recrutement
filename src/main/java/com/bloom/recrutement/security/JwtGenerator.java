package com.bloom.recrutement.security;

import com.bloom.recrutement.model.JwtUser;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;

@Component
public class JwtGenerator {
    public String generate(JwtUser jwtUser){
        Claims claims = Jwts.claims().setSubject(jwtUser.getUserName());
        claims.put("userId",String.valueOf(jwtUser.getId()));
        claims.put("role",jwtUser.getRole());

        return Jwts.builder().setClaims(claims).signWith(SignatureAlgorithm.ES512,"worldline").compact();

    }
}
