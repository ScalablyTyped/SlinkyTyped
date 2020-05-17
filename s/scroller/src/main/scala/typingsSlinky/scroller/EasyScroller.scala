package typingsSlinky.scroller

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EasyScroller extends js.Object {
  def bindEvents(): Unit = js.native
  def reflow(): Unit = js.native
  def render(): Unit = js.native
}

object EasyScroller {
  @scala.inline
  def apply(bindEvents: () => Unit, reflow: () => Unit, render: () => Unit): EasyScroller = {
    val __obj = js.Dynamic.literal(bindEvents = js.Any.fromFunction0(bindEvents), reflow = js.Any.fromFunction0(reflow), render = js.Any.fromFunction0(render))
    __obj.asInstanceOf[EasyScroller]
  }
  @scala.inline
  implicit class EasyScrollerOps[Self <: EasyScroller] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBindEvents(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindEvents")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReflow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reflow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRender(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

