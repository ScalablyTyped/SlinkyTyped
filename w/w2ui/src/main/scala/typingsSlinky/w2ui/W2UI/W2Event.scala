package typingsSlinky.w2ui.W2UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait W2Event extends js.Object {
  var target: String = js.native
  def onComplete(): Unit = js.native
}

object W2Event {
  @scala.inline
  def apply(onComplete: () => Unit, target: String): W2Event = {
    val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction0(onComplete), target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[W2Event]
  }
  @scala.inline
  implicit class W2EventOps[Self <: W2Event] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnComplete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

