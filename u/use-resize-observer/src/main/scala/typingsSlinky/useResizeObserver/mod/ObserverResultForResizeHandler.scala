package typingsSlinky.useResizeObserver.mod

import slinky.core.facade.ReactRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObserverResultForResizeHandler[TElement] extends js.Object {
  var ref: ReactRef[TElement]
}

object ObserverResultForResizeHandler {
  @scala.inline
  def apply[TElement](ref: ReactRef[TElement]): ObserverResultForResizeHandler[TElement] = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObserverResultForResizeHandler[TElement]]
  }
}

