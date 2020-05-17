package typingsSlinky.viewporter

import typingsSlinky.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Viewporter extends js.Object {
  var ACTIVE: Boolean = js.native
  var READY: Boolean = js.native
  var forceDetection: Boolean = js.native
  var preventPageScroll: Boolean = js.native
  def change(callback: EventListener): Unit = js.native
  def isLandscape(): Boolean = js.native
  def ready(callback: EventListener): Unit = js.native
  def refresh(): Unit = js.native
}

object Viewporter {
  @scala.inline
  def apply(
    ACTIVE: Boolean,
    READY: Boolean,
    change: EventListener => Unit,
    forceDetection: Boolean,
    isLandscape: () => Boolean,
    preventPageScroll: Boolean,
    ready: EventListener => Unit,
    refresh: () => Unit
  ): Viewporter = {
    val __obj = js.Dynamic.literal(ACTIVE = ACTIVE.asInstanceOf[js.Any], READY = READY.asInstanceOf[js.Any], change = js.Any.fromFunction1(change), forceDetection = forceDetection.asInstanceOf[js.Any], isLandscape = js.Any.fromFunction0(isLandscape), preventPageScroll = preventPageScroll.asInstanceOf[js.Any], ready = js.Any.fromFunction1(ready), refresh = js.Any.fromFunction0(refresh))
    __obj.asInstanceOf[Viewporter]
  }
  @scala.inline
  implicit class ViewporterOps[Self <: Viewporter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withACTIVE(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ACTIVE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withREADY(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("READY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChange(value: EventListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withForceDetection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceDetection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsLandscape(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLandscape")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPreventPageScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventPageScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefresh(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refresh")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

