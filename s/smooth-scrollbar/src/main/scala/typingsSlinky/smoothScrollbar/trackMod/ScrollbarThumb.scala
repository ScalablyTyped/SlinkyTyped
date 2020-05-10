package typingsSlinky.smoothScrollbar.trackMod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollbarThumb extends js.Object {
  var displaySize: Double = js.native
  val element: HTMLElement = js.native
  var offset: Double = js.native
  var realSize: Double = js.native
  def attachTo(track: HTMLElement): Unit = js.native
  def update(scrollOffset: Double, containerSize: Double, pageSize: Double): Unit = js.native
}

object ScrollbarThumb {
  @scala.inline
  def apply(
    attachTo: HTMLElement => Unit,
    displaySize: Double,
    element: HTMLElement,
    offset: Double,
    realSize: Double,
    update: (Double, Double, Double) => Unit
  ): ScrollbarThumb = {
    val __obj = js.Dynamic.literal(attachTo = js.Any.fromFunction1(attachTo), displaySize = displaySize.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], realSize = realSize.asInstanceOf[js.Any], update = js.Any.fromFunction3(update))
    __obj.asInstanceOf[ScrollbarThumb]
  }
  @scala.inline
  implicit class ScrollbarThumbOps[Self <: ScrollbarThumb] (val x: Self) extends AnyVal {
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
    def withDisplaySize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displaySize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRealSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realSize")(value.asInstanceOf[js.Any])
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

