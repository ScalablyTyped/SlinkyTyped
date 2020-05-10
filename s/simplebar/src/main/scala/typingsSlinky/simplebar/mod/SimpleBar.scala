package typingsSlinky.simplebar.mod

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleBar extends js.Object {
  def getContentElement(): Element = js.native
  def getScrollElement(): Element = js.native
  def recalculate(): Unit = js.native
}

object SimpleBar {
  @scala.inline
  def apply(getContentElement: () => Element, getScrollElement: () => Element, recalculate: () => Unit): SimpleBar = {
    val __obj = js.Dynamic.literal(getContentElement = js.Any.fromFunction0(getContentElement), getScrollElement = js.Any.fromFunction0(getScrollElement), recalculate = js.Any.fromFunction0(recalculate))
    __obj.asInstanceOf[SimpleBar]
  }
  @scala.inline
  implicit class SimpleBarOps[Self <: SimpleBar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetContentElement(value: () => Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContentElement")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetScrollElement(value: () => Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScrollElement")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRecalculate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recalculate")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

