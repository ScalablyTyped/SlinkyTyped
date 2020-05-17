package typingsSlinky.seen.mod

import org.scalajs.dom.raw.Event
import typingsSlinky.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MouseEventOptions extends js.Object {
  var drag: js.UndefOr[EventListener] = js.native
  var dragEnd: js.UndefOr[EventListener] = js.native
  var dragStart: js.UndefOr[EventListener] = js.native
  var mouseDown: js.UndefOr[EventListener] = js.native
  var mouseMove: js.UndefOr[EventListener] = js.native
  var mouseUp: js.UndefOr[EventListener] = js.native
  var mouseWheel: js.UndefOr[EventListener] = js.native
}

object MouseEventOptions {
  @scala.inline
  def apply(): MouseEventOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MouseEventOptions]
  }
  @scala.inline
  implicit class MouseEventOptionsOps[Self <: MouseEventOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDrag(value: /* evt */ Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag")(js.undefined)
        ret
    }
    @scala.inline
    def withDragEnd(value: /* evt */ Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDragEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withDragStart(value: /* evt */ Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDragStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragStart")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseDown(value: /* evt */ Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMouseDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseDown")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseMove(value: /* evt */ Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMouseMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseMove")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseUp(value: /* evt */ Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseUp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMouseUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseUp")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseWheel(value: /* evt */ Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseWheel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMouseWheel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseWheel")(js.undefined)
        ret
    }
  }
  
}

