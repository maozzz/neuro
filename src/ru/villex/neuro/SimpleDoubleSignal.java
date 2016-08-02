/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.villex.neuro;

/**
 *
 * @author mao_z
 */
public class SimpleDoubleSignal implements Signal<Double> {
    
    private Double value = null;

    @Override
    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public Double getValue() {
        return value;
    }
}
