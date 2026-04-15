package fr.snowtyy.wirer.exception;

/**
 * @author Snowtyy
 */
public class NotInstantiableException extends IllegalArgumentException {

    public NotInstantiableException(Class<?> clazz) {
        super("The class '" + clazz.getSimpleName() + "' is not instantiable");
    }

}
