package typingsSlinky.splitpanes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait splitPanesWatch extends js.Object {
  def defaultPercent(`val`: js.Any): Unit = js.native
}

object splitPanesWatch {
  @scala.inline
  def apply(defaultPercent: js.Any => Unit): splitPanesWatch = {
    val __obj = js.Dynamic.literal(defaultPercent = js.Any.fromFunction1(defaultPercent))
    __obj.asInstanceOf[splitPanesWatch]
  }
  @scala.inline
  implicit class splitPanesWatchOps[Self <: splitPanesWatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultPercent(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPercent")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

