package Module2.Lessons12;

class Triple<T1, T2, T3> {
    T1 first;
    T2 second;
    T3 third;

    Triple(T1 t1, T2 t2, T3 t3) {
        first = t1;
        second = t2;
        third = t3;
    }

    ;


    @Override
    public String toString() {
        return "Triple{" +
                "\nFirst type is " + first.getClass().getSimpleName() + " value is " + first.toString() +
                ",\n Second type is " + second.getClass().getSimpleName()  + " value is " + second.toString() +
                ",\n Third type is" + third.getClass().getSimpleName() + " value is " + third.toString() +
                '}';
    }
}
