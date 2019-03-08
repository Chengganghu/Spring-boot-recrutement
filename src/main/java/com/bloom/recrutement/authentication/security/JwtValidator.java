package com.bloom.recrutement.authentication.security;

import com.bloom.recrutement.authentication.model.JwtUser;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.stereotype.Component;

@Component
public class JwtValidator {
    private String secret = "worldline2019worldline2019worldline2019worldline2019";

    public JwtUser validate(String token) {

        JwtUser jwtUser = null;
        try {
            Claims body = Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
            jwtUser = new JwtUser();
            jwtUser.setUsername(body.getSubject());
            jwtUser.setRole((String) body.get("role"));
        } catch (Exception e) {

        }

        return jwtUser;
    }
}
