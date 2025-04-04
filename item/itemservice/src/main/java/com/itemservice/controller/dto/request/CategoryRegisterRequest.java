package com.itemservice.controller.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CategoryRegisterRequest {
    private String name;
    private Long parentId;
}
