package com.redis.om.spring.metamodel;

import java.lang.reflect.Field;
import java.util.Arrays;

import com.redis.om.spring.search.stream.predicates.fulltext.EqualPredicate;
import com.redis.om.spring.search.stream.predicates.fulltext.InPredicate;
import com.redis.om.spring.search.stream.predicates.fulltext.NotEqualPredicate;
import com.redis.om.spring.search.stream.predicates.fulltext.LikePredicate;
import com.redis.om.spring.search.stream.predicates.fulltext.NotLikePredicate;
import com.redis.om.spring.search.stream.predicates.fulltext.StartsWithPredicate;

public class TextFieldOperationInterceptor<E, T> extends FieldOperationInterceptor<E, T> {

  public TextFieldOperationInterceptor(Field field, boolean indexed) {
    super(field, indexed);
  }
  
  public EqualPredicate<? super E,T> eq(T value) {
    return new EqualPredicate<E,T>(field,value);
  }
  
  public NotEqualPredicate<? super E,T> notEq(T value) {
    return new NotEqualPredicate<E,T>(field,value);
  }
  
  public StartsWithPredicate<? super E,T> startsWith(T value) {
    return new StartsWithPredicate<E,T>(field,value);
  }
  
  public LikePredicate<? super E,T> like(T value) {
    return new LikePredicate<E,T>(field,value);
  }
  
  public NotLikePredicate<? super E,T> notLike(T value) {
    return new NotLikePredicate<E,T>(field,value);
  }
  
  public LikePredicate<? super E,T> containing(T value) {
    return new LikePredicate<E,T>(field,value);
  }
  
  public NotLikePredicate<? super E,T> notContaining(T value) {
    return new NotLikePredicate<E,T>(field,value);
  }

  @SuppressWarnings("unchecked")
  public InPredicate<? super E, ?> in(T... values) {
    return new InPredicate<E,T>(field, Arrays.asList(values));
  }
}
