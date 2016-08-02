/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.villex.neuro;

import java.util.HashMap;

/**
 *
 * @author mao_z
 */
public class SimpleNeuron implements Neuron {
    public HashMap<Neuron, Sinaps> neurons = new HashMap<>();
    private final double step = 1d;

    @Override
    public void connectWith(Neuron neuron, Sinaps sinaps) {
        neurons.put(neuron, sinaps);
    }

    @Override
    public void input(Signal signal) {
        neurons.keySet().stream().forEach((neuron) -> {
            neuron.input(neurons.get(neuron).affect(signal));
        });
    }
}
