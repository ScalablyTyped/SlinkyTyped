package typingsSlinky.webpackHotMiddleware.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventStream extends js.Object {
  def close(): Unit = js.native
  def publish(payload: js.Any): Unit = js.native
}

object EventStream {
  @scala.inline
  def apply(close: () => Unit, publish: js.Any => Unit): EventStream = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), publish = js.Any.fromFunction1(publish))
    __obj.asInstanceOf[EventStream]
  }
  @scala.inline
  implicit class EventStreamOps[Self <: EventStream] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPublish(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publish")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

