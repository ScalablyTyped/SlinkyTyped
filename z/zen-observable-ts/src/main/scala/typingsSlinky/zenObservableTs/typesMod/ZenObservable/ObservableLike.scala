package typingsSlinky.zenObservableTs.typesMod.ZenObservable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObservableLike[T] extends js.Object {
  var subscribe: js.UndefOr[Subscriber[T]] = js.native
}

object ObservableLike {
  @scala.inline
  def apply[T](): ObservableLike[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObservableLike[T]]
  }
  @scala.inline
  implicit class ObservableLikeOps[Self[t] <: ObservableLike[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withSubscribe(value: /* observer */ SubscriptionObserver[T] => Unit | js.Function0[Unit] | Subscription): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribe")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSubscribe: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribe")(js.undefined)
        ret
    }
  }
  
}

