package net.ramixin.stator;

public class Latent<T> {

    private T object;

    public T get() {
        if(object == null)
            throw new IllegalStateException("object is null");
        return object;
    }

    public void supply(T object) {
        if(this.object != null)
            throw new IllegalStateException("object is already set");
        this.object = object;
    }

}
