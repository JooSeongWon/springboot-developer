package me.jsw.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.jsw.springbootdeveloper.domain.User;
import me.jsw.springbootdeveloper.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

// 스프링 시큐리티에서 사용자 정보를 가져오는 인터페이스
@RequiredArgsConstructor
@Service
public class UserDetailService implements UserDetailsService {

    private final UserRepository userRepository;

    // 샤옹자 이름(email)으로 사용자의 정보를 가져오는 메서드
    @Override
    public User loadUserByUsername(String email) {
        return userRepository.findByEmail(email)
                .orElseThrow(() -> new IllegalArgumentException((email)));
    }
}
