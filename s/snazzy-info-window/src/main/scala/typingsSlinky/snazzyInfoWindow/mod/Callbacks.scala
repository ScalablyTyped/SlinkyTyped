package typingsSlinky.snazzyInfoWindow.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Callbacks extends js.Object {
  /**
    * Called after the info window has closed.
    * This occurs at the end of the OverlayView onRemove() implementation.
    * At this point the info window should be removed from the DOM.
    */
  var afterClose: js.UndefOr[js.Function0[Boolean | Unit]] = js.native
  /**
    * Called when the info window has opened.
    * This occurs at the end of the OverlayView draw() implementation.
    * At this point the info window is added to the DOM and should be visible.
    */
  var afterOpen: js.UndefOr[js.Function0[Boolean | Unit]] = js.native
  /**
    * Called before the info window attempts to close.
    * Return false to cancel the close.
    */
  var beforeClose: js.UndefOr[js.Function0[Boolean | Unit]] = js.native
  /**
    * Called before the info window attempts to open.
    * Return false to cancel the open.
    */
  var beforeOpen: js.UndefOr[js.Function0[Boolean | Unit]] = js.native
  /**
    * Called when the info window is closing.
    * This occurs at the beginning of the OverlayView onRemove() implementation.
    * At this point the info window is still in the DOM.
    */
  var close: js.UndefOr[js.Function0[Boolean | Unit]] = js.native
  /**
    * Called when the info window is opening.
    * This occurs at the end of the OverlayView onAdd() implementation.
    * At this point the info window is added to the DOM but is not drawn yet.
    */
  var open: js.UndefOr[js.Function0[Boolean | Unit]] = js.native
}

object Callbacks {
  @scala.inline
  def apply(): Callbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Callbacks]
  }
  @scala.inline
  implicit class CallbacksOps[Self <: Callbacks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterClose(value: () => Boolean | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterClose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAfterClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterClose")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterOpen(value: () => Boolean | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterOpen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAfterOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeClose(value: () => Boolean | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeClose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutBeforeClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeClose")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeOpen(value: () => Boolean | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeOpen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutBeforeOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withClose(value: () => Boolean | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.undefined)
        ret
    }
    @scala.inline
    def withOpen(value: () => Boolean | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.undefined)
        ret
    }
  }
  
}

