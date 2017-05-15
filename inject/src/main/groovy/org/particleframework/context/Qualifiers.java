package org.particleframework.context;

import java.lang.annotation.Annotation;

/**
 * Factory for qualifiers
 *
 * @author Graeme Rocher
 * @since 1.0
 */
public class Qualifiers {

    /**
     * Build a qualifier for the given name
     *
     * @param name The name
     * @param <T> The component type
     * @return The qualifier
     */
    public static <T> Qualifier<T> qualify(String name) {
        return new NameQualifier<T>(name);
    }

    /**
     * Build a qualifier for the given annotation
     *
     * @param annotation The annotation
     * @param <T> The component type
     * @return The qualifier
     */
    public static <T> Qualifier<T> qualify(Annotation annotation) {
        return new AnnotationQualifier<T>(annotation);
    }
}
