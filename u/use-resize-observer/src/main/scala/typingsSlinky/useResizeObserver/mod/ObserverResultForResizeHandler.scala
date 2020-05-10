package typingsSlinky.useResizeObserver.mod

import slinky.core.facade.ReactRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObserverResultForResizeHandler[TElement] extends js.Object {
  var ref: ReactRef[TElement] = js.native
}

object ObserverResultForResizeHandler {
  @scala.inline
  def apply[TElement](ref: ReactRef[TElement]): ObserverResultForResizeHandler[TElement] = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObserverResultForResizeHandler[TElement]]
  }
  @scala.inline
  implicit class ObserverResultForResizeHandlerOps[Self[telement] <: ObserverResultForResizeHandler[telement], TElement] (val x: Self[TElement]) extends AnyVal {
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
  }
  
}

