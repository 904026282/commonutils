package com.tool.function.jdk8demo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author: zhangyu
 */

@Data
@AllArgsConstructor
public class TestObject {
    // "Ron", "M", 10, "ron.zheng@tfschange.com", false),
    private String name;
    private String sex;
    private Integer age;
    private String mail;
    private Boolean flag;
}