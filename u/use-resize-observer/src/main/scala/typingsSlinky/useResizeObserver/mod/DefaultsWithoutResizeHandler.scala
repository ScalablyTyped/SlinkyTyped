package typingsSlinky.useResizeObserver.mod

import slinky.core.facade.ReactRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultsWithoutResizeHandler[TElement] extends ObserverDefaults[TElement] {
  var ref: js.UndefOr[ReactRef[TElement]] = js.undefined
}

object DefaultsWithoutResizeHandler {
  @scala.inline
  def apply[TElement](ref: ReactRef[TElement] = null): DefaultsWithoutResizeHandler[TElement] = {
    val __obj = js.Dynamic.literal()
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultsWithoutResizeHandler[TElement]]
  }
}

