package typingsSlinky.useDashResizeDashObserver.useDashResizeDashObserverMod

import slinky.core.facade.ReactRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObserverResultWithoutDefaultSize[TElement] extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var ref: ReactRef[TElement]
  var width: js.UndefOr[Double] = js.undefined
}

object ObserverResultWithoutDefaultSize {
  @scala.inline
  def apply[TElement](ref: ReactRef[TElement], height: Int | Double = null, width: Int | Double = null): ObserverResultWithoutDefaultSize[TElement] = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObserverResultWithoutDefaultSize[TElement]]
  }
}

