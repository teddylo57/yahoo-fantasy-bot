package bridges

import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.subjects.PublishSubject
import org.jsoup.nodes.Document

object ScoreUpdateBridge : Bridge {
    private val dataBridge = PublishSubject.create<Document>()

    override val dataObserver: Observer<Document>
        get() = dataBridge

    override val dataObservable: Observable<Document>
        get() = dataBridge
}