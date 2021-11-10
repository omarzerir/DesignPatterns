package com.zerir.designpatterns.behavioural.observer

abstract class IObservable<T>(private var state: T) {

    private val observers = mutableListOf<IObserver<T>>()

    fun add(observer: IObserver<T>) = observers.add(observer)

    fun remove(observer: IObserver<T>) = observers.remove(observer)

    private fun notifying() = observers.forEach { it.update(state) }

    fun setState(state: T)  {
        this.state = state
        notifying()
    }

}

class MutableObservable<T>(s: T) : IObservable<T>(s)