/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.villex.neuro;

/**
 *
 * @author mao_z
 * @param <T>
 */
public interface Signal<T> {
    public void setValue(T value);
    public T getValue();
}
