package com.karakat.spring.RedditClone.service;

import com.karakat.spring.RedditClone.repository.UserRepository;
import com.karakat.spring.RedditClone.repository.VerificationTokenRepository;
import com.karakat.spring.RedditClone.security.JwtProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class AuthService {

    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;
    private final VerificationTokenRepository verificationTokenRepository;
//    private final MailService mailService;
    private final AuthenticationManager authenticationManager;
    private final JwtProvider jwtProvider;
//    private final RefreshTokenService refreshTokenService;
    public void signup()
}
