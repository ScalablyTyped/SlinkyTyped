package typingsSlinky.useResizeObserver.mod

import slinky.core.facade.ReactRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultsWithoutResizeHandler[TElement] extends ObserverDefaults[TElement] {
  var ref: js.UndefOr[ReactRef[TElement]] = js.native
}

object DefaultsWithoutResizeHandler {
  @scala.inline
  def apply[TElement](): DefaultsWithoutResizeHandler[TElement] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultsWithoutResizeHandler[TElement]]
  }
  @scala.inline
  implicit class DefaultsWithoutResizeHandlerOps[Self[telement] <: DefaultsWithoutResizeHandler[telement], TElement] (val x: Self[TElement]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TElement] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TElement]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TElement] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TElement] with Other]
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

