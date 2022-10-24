package Junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import java.lang.annotation.Retention;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD})  //@Target requires element type at method level
                                                            //@Retention : these annotations are valid at runtime
@Retention(RetentionPolicy.RUNTIME)
@DisplayName("CalAddition")                                 // here add all the annotations that we want to customize
@Tag("Sanity")                          
@Test
public @interface CustomAnnotation {
	
	

}
