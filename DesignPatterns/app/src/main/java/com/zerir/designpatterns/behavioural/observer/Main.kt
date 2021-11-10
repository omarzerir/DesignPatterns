package com.zerir.designpatterns.behavioural.observer



fun main() {

    val initData = 0

    val mutableObservable = MutableObservable(initData)
    val mutableObserver1 = MutableObserver(initData)
    val mutableObserver2 = MutableObserver(initData)
    val mutableObserver3 = MutableObserver(initData)

    val observer = object: Observe<Int> {
        override fun onUpdate(data: Int) {
            println("Observing: $data")
        }
    }

    mutableObserver1.observe(observer)
    mutableObserver2.observe(observer)
    mutableObserver3.observe(observer)

    mutableObservable.add(mutableObserver1)
    mutableObservable.add(mutableObserver2)
    mutableObservable.add(mutableObserver3)

    Thread {
        for(i in 1..10) {
            mutableObservable.setState(i * 10)
            Thread.sleep(1000)
        }
    }.run()

}