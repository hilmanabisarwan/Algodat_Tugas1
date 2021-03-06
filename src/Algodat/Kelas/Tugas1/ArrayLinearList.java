/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algodat.Kelas.Tugas1;

/**
 *
 * @author Windows 8
 */

/*import java.lang.*;*/

public class ArrayLinearList implements LinearList{
    protected Object [] element;    //Elemen Array
    protected int size;             //Jumlah Elemen Dalam Array
    protected int capacity;
    private int index;
    
    public ArrayLinearList(int initialCapacity){
        if(initialCapacity < 1)
            throw new IllegalArgumentException ("initial must be >=1");
        element = new Object [initialCapacity];
    }
    
    public ArrayLinearList(){
        this(10);
    }
    
    @Override
    public boolean isEmpty(){
        return size == 0;
    }
    
    @Override
    public int size(){
        return size;
    }
    
    void checkIndex(int index){
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException ("index = " + index + "Size = " + size);
    }
    
    @Override
    public Object get(int index){
        checkIndex(index);
        return element[index];
    }
    
    @Override
    public int indexOf(Object theElement){
        for(int i = 0; i < size; i++)
            if(element[i].equals(theElement))
                return i;
        
        return -1;
    }
    
    @Override
    public Object remove(int index){
        checkIndex(index);
        
        Object removedElement = element[index];
        for(int i = index + 1; i < size; i++)
            element[i-1] = element[i];
        
        element[--size] = null;
        return removedElement;
    }
    
    @Override
    public void add(int index, Object theElement){
        if(index < 0 || index > size)
            throw new IndexOutOfBoundsException ("index = " + index + "Size = " + size);
        
        if(size == element.length)
            element = ChangeArrayLength.changeLength1D(element, 2*size);
        
        for(int i = size; i >= index; i--)
            element [i + 1] = element[i];
        
        element[index] =  theElement;
        size++;
        
    }
    
    @Override
    public String toString(){
        StringBuffer s = new StringBuffer("[");
                for(int i = 0; i < size; i++)
                    if(element[i] == null)
                        s.append("null, ");
                    else
                        s.append(element[i].toString() +", ");
                
                if(size > 0)
                    s.delete(s.length() - 2, s.length());
                s.append("]");
                
                return new String(s);
    }

    public void trimToSize() {
        Object[] element2 = new Object [size];
        if(size < element.length)
            System.arraycopy(element, 0, element2, 0, size);
        
        element = element2;
    }
    
    public Object setSize(int a){
        if(size > a){
            index = size - a;
            Object removedElement = element[index];
            for(int i = 0; i < index; i++){
                for(int j = index+1; j<size; j++)
                    element[j-1] = element[j];
        
                element[--size] = null;
            }
            return removedElement;
        }
        else{
            Object[] element2 = new Object [a];
            System.arraycopy(element, 0, element2, 0, size);
        
            element = element2;
        }
        return size;
    }
    
    public Object clear(){
        for(int i = 0; i<size; i++){
            element[i] = null;
        }
        return size;
    }
    
    
    public void removeRange(int fromIndex, int toIndex){
        if(fromIndex < 0)
            fromIndex = 0;
        if(toIndex > size)
            toIndex = size;
        if(fromIndex >= toIndex)
            return;
        
        int A = size - toIndex;
        System.arraycopy(element, toIndex, element, fromIndex, A);
        
        int newSize = fromIndex + A;
        while(size != newSize)
            element[--size]=null;
    }
    
    public Object clone(Object [] array){
        array = new Object[size];
        array = element.clone();
        return toString();
    }
}
