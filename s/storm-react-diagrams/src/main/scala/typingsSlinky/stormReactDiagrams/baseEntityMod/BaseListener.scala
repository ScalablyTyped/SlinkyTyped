package typingsSlinky.stormReactDiagrams.baseEntityMod

import typingsSlinky.stormReactDiagrams.anon.Locked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseListener[T /* <: BaseEntity[BaseListener[_]] */] extends js.Object {
  var lockChanged: js.UndefOr[js.Function1[/* event */ BaseEvent[T] with Locked, Unit]] = js.native
}

object BaseListener {
  @scala.inline
  def apply[T](): BaseListener[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseListener[T]]
  }
  @scala.inline
  implicit class BaseListenerOps[Self[t] <: BaseListener[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withLockChanged(value: /* event */ BaseEvent[T] with Locked => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLockChanged: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockChanged")(js.undefined)
        ret
    }
  }
  
}

