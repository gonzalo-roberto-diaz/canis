package com.canis.rest.validator;

import com.canis.requestmodels.DogBreedRequestModel;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * Created by Gonzalo on 3/30/2016.
 */
public class DogBreedValidator implements Validator {

    /**
     * Can this {@link Validator} {@link #validate(Object, Errors) validate}
     * instances of the supplied {@code clazz}?
     * <p>This method is <i>typically</i> implemented like so:
     * <pre class="code">return Foo.class.isAssignableFrom(clazz);</pre>
     * (Where {@code Foo} is the class (or superclass) of the actual
     * object instance that is to be {@link #validate(Object, Errors) validated}.)
     *
     * @param clazz the {@link Class} that this {@link Validator} is
     *              being asked if it can {@link #validate(Object, Errors) validate}
     * @return {@code true} if this {@link Validator} can indeed
     * {@link #validate(Object, Errors) validate} instances of the
     * supplied {@code clazz}
     */
    @Override
    public boolean supports(Class<?> clazz) {
        if (clazz.equals(DogBreedRequestModel.class)){
            return true;
        }
        return false;
    }

    /**
     * Validate the supplied {@code target} object, which must be
     * of a {@link Class} for which the {@link #supports(Class)} method
     * typically has (or would) return {@code true}.
     * <p>The supplied {@link Errors errors} instance can be used to report
     * any resulting validation errors.
     *
     * @param target the object that is to be validated (can be {@code null})
     * @param errors contextual state about the validation process (never {@code null})
     * @see org.springframework.validation.ValidationUtils
     */
    @Override
    public void validate(Object target, Errors errors) {
        DogBreedRequestModel model = (DogBreedRequestModel)target;
        if (model.getLifespanMax()<model.getLifespanMin()){
            errors.reject("wrong.lifespan.range");
        }

        if (model.getServingMin()!=null && model.getServingMax()!=null){
            if(model.getServingMax().compareTo(model.getServingMin())<0) {
                errors.reject("wrong.serving.size.range");
            }
        }

        if (model.getWeightMax().compareTo(model.getWeightMin())<0){
            errors.reject("wrong.weight.range");
        }else if (model.getSizeMax().compareTo(model.getSizeMin())<0){
            errors.reject("wrong.size.range");
        }
    }
}
