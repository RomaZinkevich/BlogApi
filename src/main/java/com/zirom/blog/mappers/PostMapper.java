package com.zirom.blog.mappers;

import com.zirom.blog.domain.CreatePostRequest;
import com.zirom.blog.domain.UpdatePostRequest;
import com.zirom.blog.domain.dtos.CreatePostRequestDto;
import com.zirom.blog.domain.dtos.PostDto;
import com.zirom.blog.domain.dtos.UpdatePostRequestDto;
import com.zirom.blog.domain.entities.Post;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PostMapper {

    @Mapping(target = "author", source = "author")
    @Mapping(target = "category", source = "category")
    @Mapping(target = "tags", source = "tags")
    PostDto toDto(Post post);

    CreatePostRequest toCreatePostRequest(CreatePostRequestDto dto);

    @Mapping(target = "status", source = "status")
    UpdatePostRequest toUpdatePostRequest(UpdatePostRequestDto dto);
}
