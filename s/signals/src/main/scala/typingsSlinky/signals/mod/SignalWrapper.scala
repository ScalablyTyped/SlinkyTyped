package typingsSlinky.signals.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignalWrapper[T] extends js.Object {
  var Signal: typingsSlinky.signals.mod.Signal[T] = js.native
}

object SignalWrapper {
  @scala.inline
  def apply[T](Signal: Signal[T]): SignalWrapper[T] = {
    val __obj = js.Dynamic.literal(Signal = Signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignalWrapper[T]]
  }
  @scala.inline
  implicit class SignalWrapperOps[Self[t] <: SignalWrapper[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withSignal(value: Signal[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Signal")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

