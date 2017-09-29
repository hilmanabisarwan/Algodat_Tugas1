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
public abstract class LinearListAsAbstractClass {
    public abstract boolean isEmpty();
    public abstract int size();
    public abstract Object get(int index);
    public abstract int indexOf(Object elem);
    public abstract Object remove(int index);
    public abstract void add(int index, Object obj);
    @Override
    public abstract String toString();
}
