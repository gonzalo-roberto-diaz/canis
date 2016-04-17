package com.canis.domain.enums;

import javax.persistence.AttributeConverter;

/**
 * Created by Gonzalo on 4/16/2016.
 */
public class DogSizeConverter implements AttributeConverter<DogSize, Integer> {
    /**
     * Converts the value stored in the entity attribute into the
     * data representation to be stored in the database.
     *
     * @param attribute the entity attribute value to be converted
     * @return the converted data to be stored in the database column
     */
    @Override
    public Integer convertToDatabaseColumn(DogSize attribute) {
        return attribute.getId();
    }

    /**
     * Converts the data stored in the database column into the
     * value to be stored in the entity attribute.
     * Note that it is the responsibility of the converter writer to
     * specify the correct dbData type for the corresponding column
     * for use by the JDBC driver: i.e., persistence providers are
     * not expected to do such type conversion.
     *
     * @param dbData the data from the database column to be converted
     * @return the converted value to be stored in the entity attribute
     */
    @Override
    public DogSize convertToEntityAttribute(Integer dbData) {
        switch (dbData){
            case 1: return DogSize.TOY;
            case 2: return DogSize.SMALL;
            case 5: return DogSize.MEDIUM;
            case 7: return DogSize.LARGE;
            case 8: return DogSize.XLARGE;
            case 9: return DogSize.GIANT;
            default:
                throw new RuntimeException("Can't find value for dog size id=" + dbData.intValue());
        }
    }
}
