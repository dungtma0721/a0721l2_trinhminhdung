package ss10_DSA_arraylist_linkedlist.bai_tap.Arraylist;

import java.util.Arrays;

public class MyArrayList<E> {
    /**
     * So luong pan tu trong MyArrayList
     */
    private int size = 0;
    /**
     * Suc chua cua MyArrayList
     */
    private static final int DEFAULT_CAPACITY =10;
    /**
     * Mang chua cac pan tu
     */
    Object elements[];

    /**
     * Suc chua mac dinh khi khoi tao Contructor khong tham so
     */
    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    /**
     *Phuong thuc contructor voi suc chua duoc truyen vao
     * @param capacity
     */
    public MyArrayList(int capacity) {
        if(capacity >= 0){
            elements = new Object[capacity];
        }
        else {
            throw new IllegalArgumentException("capacity :" + capacity);

        }
    }

    /**
     * Phuong thuc tra ve so luong phan tu
     * @return
     */
    public int size(){
        return this.size;
    }
    /**
     * Phuong thuc clear
     */
    public void clear(){
        size =0;
        for (int i = 0; i < elements.length; i++) {
            elements[i]= null;
        }
    }

    /**
     * Phuong thuc add pan tu vao MyArrayList
     * @param object
     * @return
     */
    public boolean add(E element){
        if (elements.length==size){
            this.ensureCapacity(1);
        }
        elements[size] = element;
        size++;
        return true;
    }
    public void add(E element, int index){
        if (index> elements.length){
            throw new IllegalArgumentException("index: " + index);
        }
        else if (elements.length==size){
            this.ensureCapacity(5);
        }
        else if (elements[index]==null){
            elements[index]=element;
            size++;
        }
        else {
            for (int i = size+1; i >=index ; i--) {
                elements[i]=elements[i-1];
            }
            elements[index]=element;
            size++;
        }
    }

    /**
     * phuong thuc tang kich thuoc MyArrayList
     */
    public void ensureCapacity(int minCapacity) {
        if(minCapacity >=0){
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        }
        else {
            throw new IllegalArgumentException("minCapacity : " + minCapacity);
        }
    }


}
