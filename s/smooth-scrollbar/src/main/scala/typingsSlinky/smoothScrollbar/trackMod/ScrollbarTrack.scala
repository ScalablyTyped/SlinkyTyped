package typingsSlinky.smoothScrollbar.trackMod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollbarTrack extends js.Object {
  val element: HTMLElement = js.native
  val thumb: ScrollbarThumb = js.native
  def attachTo(container: HTMLElement): Unit = js.native
  def hide(): Unit = js.native
  def show(): Unit = js.native
  def update(scrollOffset: Double, containerSize: Double, pageSize: Double): Unit = js.native
}

object ScrollbarTrack {
  @scala.inline
  def apply(
    attachTo: HTMLElement => Unit,
    element: HTMLElement,
    hide: () => Unit,
    show: () => Unit,
    thumb: ScrollbarThumb,
    update: (Double, Double, Double) => Unit
  ): ScrollbarTrack = {
    val __obj = js.Dynamic.literal(attachTo = js.Any.fromFunction1(attachTo), element = element.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show), thumb = thumb.asInstanceOf[js.Any], update = js.Any.fromFunction3(update))
    __obj.asInstanceOf[ScrollbarTrack]
  }
  @scala.inline
  implicit class ScrollbarTrackOps[Self <: ScrollbarTrack] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachTo(value: HTMLElement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withThumb(value: ScrollbarThumb): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: (Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

