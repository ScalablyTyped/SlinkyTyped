package typingsSlinky.winrt.Windows.Foundation.Collections

import typingsSlinky.winrt.AnonFirst
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMapView[K, V] extends IIterable[IKeyValuePair[K, V]] {
  var size: Double = js.native
  def hasKey(key: K): Boolean = js.native
  def lookup(key: K): V = js.native
  def split(): AnonFirst[K, V] = js.native
}

object IMapView {
  @scala.inline
  def apply[K, V](
    first: () => IIterator[IKeyValuePair[K, V]],
    hasKey: K => Boolean,
    lookup: K => V,
    size: Double,
    split: () => AnonFirst[K, V]
  ): IMapView[K, V] = {
    val __obj = js.Dynamic.literal(first = js.Any.fromFunction0(first), hasKey = js.Any.fromFunction1(hasKey), lookup = js.Any.fromFunction1(lookup), size = size.asInstanceOf[js.Any], split = js.Any.fromFunction0(split))
    __obj.asInstanceOf[IMapView[K, V]]
  }
  @scala.inline
  implicit class IMapViewOps[Self[k, v] <: IMapView[k, v], K, V] (val x: Self[K, V]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K, V] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K, V]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K, V]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K, V]) with Other]
    @scala.inline
    def withHasKey(value: K => Boolean): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLookup(value: K => V): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSize(value: Double): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSplit(value: () => AnonFirst[K, V]): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("split")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

