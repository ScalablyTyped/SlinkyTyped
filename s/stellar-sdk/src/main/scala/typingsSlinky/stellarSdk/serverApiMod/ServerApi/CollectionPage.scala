package typingsSlinky.stellarSdk.serverApiMod.ServerApi

import typingsSlinky.stellarSdk.horizonApiMod.Horizon.BaseResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionPage[T /* <: BaseResponse[scala.Nothing] */] extends js.Object {
  var records: js.Array[T] = js.native
  def next(): js.Promise[CollectionPage[T]] = js.native
  def prev(): js.Promise[CollectionPage[T]] = js.native
}

object CollectionPage {
  @scala.inline
  def apply[T](
    next: () => js.Promise[CollectionPage[T]],
    prev: () => js.Promise[CollectionPage[T]],
    records: js.Array[T]
  ): CollectionPage[T] = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next), prev = js.Any.fromFunction0(prev), records = records.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionPage[T]]
  }
  @scala.inline
  implicit class CollectionPageOps[Self[t] <: CollectionPage[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withNext(value: () => js.Promise[CollectionPage[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPrev(value: () => js.Promise[CollectionPage[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRecords(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("records")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

