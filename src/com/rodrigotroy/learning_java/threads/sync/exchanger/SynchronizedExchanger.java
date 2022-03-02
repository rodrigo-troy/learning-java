package com.rodrigotroy.learning_java.threads.sync.exchanger;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning_threads
 * User: rodrigotroy
 * Date: 22-01-21
 * Time: 16:47
 */
//synchronized impide que dos hilos accedan a un metodo al mismo tiempo
public class SynchronizedExchanger {
    protected Object object = null;

    public synchronized Object getObject() {
        return this.object;
    }

    public synchronized void setObject(Object o) {
        this.object = o;
    }

    //Si no se desea declarar toodoo el metodo como sync, se puede declarar solo un bloque adentro del metodo
    public Object getObj() {
        synchronized (this) {
            return this.object;
        }
    }

    //Si no se desea declarar toodoo el metodo como sync, se puede declarar solo un bloque adentro del metodo
    public void setObj(Object o) {
        synchronized (this) {
            this.object = o;
        }
    }
}
