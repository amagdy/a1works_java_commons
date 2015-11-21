# A1Works Java Commons
Is a library of utility classes that offer common functionality like object equality and hash code generation and common constructs for safer development with Java 7+.

### Sample Code:
**Simpler and safer Object.equals() and Object.hashCode() methods**

    @Override
    public boolean equals(Object o) {
        for (EqualsBuilder<Feature> equalsBuilder : EqualsBuilder.createInstanceIfParamsHaveSameType(this, o)) {
            Feature otherFeature = equalsBuilder.getOtherObject();
            return equalsBuilder
                    .append(getName(), otherFeature.getName())
                    .isEqual();
        }
        return false;
    }

    @Override
    public int hashCode(){
        return HashcodeBuilder.createInstance()
                .append(getName())
                .getHashCode();
    }


