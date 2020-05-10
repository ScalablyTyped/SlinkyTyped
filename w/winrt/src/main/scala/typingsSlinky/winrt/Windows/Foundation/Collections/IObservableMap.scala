package typingsSlinky.winrt.Windows.Foundation.Collections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObservableMap[K, V] extends IMap[K, V] {
  var onmapchanged: js.Any = js.native
}

object IObservableMap {
  @scala.inline
  def apply[K, V](
    clear: () => Unit,
    first: () => IIterator[IKeyValuePair[K, V]],
    getView: () => IMapView[K, V],
    hasKey: K => Boolean,
    insert: (K, V) => Boolean,
    lookup: K => V,
    onmapchanged: js.Any,
    remove: K => Unit,
    size: Double
  ): IObservableMap[K, V] = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), first = js.Any.fromFunction0(first), getView = js.Any.fromFunction0(getView), hasKey = js.Any.fromFunction1(hasKey), insert = js.Any.fromFunction2(insert), lookup = js.Any.fromFunction1(lookup), onmapchanged = onmapchanged.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove), size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObservableMap[K, V]]
  }
  @scala.inline
  implicit class IObservableMapOps[Self[k, v] <: IObservableMap[k, v], K, V] (val x: Self[K, V]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K, V] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K, V]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K, V]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K, V]) with Other]
    @scala.inline
    def withOnmapchanged(value: js.Any): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmapchanged")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

