package typingsSlinky.stellarSdk.callBuilderMod

import org.scalajs.dom.raw.MessageEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventSourceOptions[T] extends js.Object {
  var onerror: js.UndefOr[js.Function1[/* event */ MessageEvent, Unit]] = js.native
  var onmessage: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.native
  var reconnectTimeout: js.UndefOr[Double] = js.native
}

object EventSourceOptions {
  @scala.inline
  def apply[T](): EventSourceOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventSourceOptions[T]]
  }
  @scala.inline
  implicit class EventSourceOptionsOps[Self[t] <: EventSourceOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withOnerror(value: /* event */ MessageEvent => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onerror")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnerror: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onerror")(js.undefined)
        ret
    }
    @scala.inline
    def withOnmessage(value: /* value */ T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnmessage: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmessage")(js.undefined)
        ret
    }
    @scala.inline
    def withReconnectTimeout(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnectTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReconnectTimeout: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnectTimeout")(js.undefined)
        ret
    }
  }
  
}

