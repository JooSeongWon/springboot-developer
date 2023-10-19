package me.jsw.springbootdeveloper.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.jsw.springbootdeveloper.domain.Article;

@NoArgsConstructor
@AllArgsConstructor //모든 필드 값을 파라미터로 받는 생성자 추가
@Getter
public class AddArticleRequest {

    private String title;
    private String content;

    //빌더 패턴을 사용해 DTO를 엔티티로 만들어주는 메서드
    public Article toEntity() {
        return Article.builder()
                .title(title)
                .content(content).build();
    }
}
