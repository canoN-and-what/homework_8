public class MyArrayList {

    private int size;
    transient Object[] elementData;

    public MyArrayList(int size) {
        elementData = new Object[size];
    }

    public MyArrayList() {
        this(10);
    }

    public int indexOf(Object o) {
        //return indexOfRange(o, 0, size);
        Object[] es = elementData;
        if (o == null) {
            for (int i = 0; i < size; i++) {
                if (es[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (o.equals(es[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }
}
    /* Не совсем понял в целом, как выпонять дз, так как на лекции не было звука, сложно разбираться с материалом.*/
