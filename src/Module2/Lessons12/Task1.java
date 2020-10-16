package Module2.Lessons12;

class Triple<T1, T2, T3> {
    Triple(T1 t1, T2 t2, T3 t3 ){
        first = t1;
        second = t2;
        third = t3;
    };

    T1 first;
    T2 second;
    T3 third;

    @Override
    public String toString() {
        return "Triple{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                '}';
    }
}
