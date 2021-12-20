package org.devio.hi.library.restful.annotation

import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy

/**
 * @BaseUrl("https://api.devio.org/as/")
 *fun test(@Filed("province") int provinceId)
 */
@Target(AnnotationTarget.FUNCTION)
@Retention(RetentionPolicy.RUNTIME)
annotation class BaseUrl(val value: String)