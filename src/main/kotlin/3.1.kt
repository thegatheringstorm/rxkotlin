// https://www.safaribooksonline.com/library/view/reactive-programming-in/9781788473026/b9534ab3-f4c0-452e-a17e-fe5a178532f7.xhtml

import io.reactivex.Observable

fun main(args: Array<String>) {
    val observable: Observable<Int> = Observable.create<Int> {
        // it: ObservableEmitter<String!>
        it.onNext(1)
        it.onNext(2)
        it.onNext(3)
        it.onComplete()
    }

    observable.subscribe(observer)
}

/*
New Subscription
Next 1
Next 2
Next 3
All Completed
 */