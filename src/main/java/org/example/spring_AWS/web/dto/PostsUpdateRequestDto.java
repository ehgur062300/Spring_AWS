package org.example.spring_AWS.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.spring_AWS.domain.posts.Posts;

@Getter
@NoArgsConstructor
public class PostsUpdateRequestDto {

    private String title;
    private String content;

    @Builder
    public PostsUpdateRequestDto(String title, String content){
        this.title = title;
        this.content = content;
    }
}
