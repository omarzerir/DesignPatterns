package com.zerir.designpatterns.behavioural.observer

abstract class IObserver<T>(private var data: T, private var observe: Observe<T>?) {

    fun update(data: T) {
        this.data = data
        this.observe?.onUpdate(data)
    }

    fun observe(observe: Observe<T>) {
        if(this.observe == null) this.observe = observe
        this.observe?.onUpdate(data)
    }

}

interface Observe<T> {
    fun onUpdate(data: T)
}

class MutableObserver<T>(d: T, o: Observe<T>? = null) : IObserver<T>(d, o)