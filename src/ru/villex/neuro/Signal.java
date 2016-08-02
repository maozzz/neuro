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
