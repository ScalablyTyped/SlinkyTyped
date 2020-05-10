package typingsSlinky.zdog.mod

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DraggerOptions extends js.Object {
  val onDragEnd: js.UndefOr[DragEndListener] = js.native
  val onDragMove: js.UndefOr[DragMoveListener] = js.native
  val onDragStart: js.UndefOr[DragStartListener] = js.native
  /**
    * The element to start dragging on the initial `mousedown`, `pointerdown`, or `touchstart` event.
    */
  val startElement: js.UndefOr[String | Element] = js.native
}

object DraggerOptions {
  @scala.inline
  def apply(): DraggerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DraggerOptions]
  }
  @scala.inline
  implicit class DraggerOptionsOps[Self <: DraggerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnDragEnd(value: DragEndListener): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDragEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragMove(value: DragMoveListener): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDragMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragStart(value: DragStartListener): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDragStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.undefined)
        ret
    }
    @scala.inline
    def withStartElementElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartElement(value: String | Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startElement")(js.undefined)
        ret
    }
  }
  
}

