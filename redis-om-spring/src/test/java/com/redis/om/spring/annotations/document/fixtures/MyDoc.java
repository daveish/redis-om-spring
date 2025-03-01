package com.redis.om.spring.annotations.document.fixtures;

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;

import com.redis.om.spring.annotations.Document;
import com.redis.om.spring.annotations.TagIndexed;
import com.redis.om.spring.annotations.TextIndexed;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor(staticName = "of")
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Document
public class MyDoc {
  @Id
  private String id;
  @NonNull
  @TextIndexed(alias = "title")
  private String title;
  @TagIndexed(alias = "tag")
  private Set<String> tag = new HashSet<String>();
}
