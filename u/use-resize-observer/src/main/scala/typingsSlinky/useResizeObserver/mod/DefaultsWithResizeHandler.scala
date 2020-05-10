package typingsSlinky.useResizeObserver.mod

import slinky.core.facade.ReactRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultsWithResizeHandler[TElement] extends ObserverDefaults[TElement] {
  var onResize: ResizeHandler = js.native
  var ref: js.UndefOr[ReactRef[TElement]] = js.native
}

object DefaultsWithResizeHandler {
  @scala.inline
  def apply[TElement](onResize: /* newSize */ RefSize => Unit): DefaultsWithResizeHandler[TElement] = {
    val __obj = js.Dynamic.literal(onResize = js.Any.fromFunction1(onResize))
    __obj.asInstanceOf[DefaultsWithResizeHandler[TElement]]
  }
  @scala.inline
  implicit class DefaultsWithResizeHandlerOps[Self[telement] <: DefaultsWithResizeHandler[telement], TElement] (val x: Self[TElement]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TElement] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TElement]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TElement] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TElement] with Other]
    @scala.inline
    def withOnResize(value: /* newSize */ RefSize => Unit): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRef(value: ReactRef[TElement]): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRef: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(js.undefined)
        ret
    }
  }
  
}

