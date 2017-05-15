package org.particleframework.inject.qualifiers

import javax.inject.Qualifier
import java.lang.annotation.Documented
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy

@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface One {
}