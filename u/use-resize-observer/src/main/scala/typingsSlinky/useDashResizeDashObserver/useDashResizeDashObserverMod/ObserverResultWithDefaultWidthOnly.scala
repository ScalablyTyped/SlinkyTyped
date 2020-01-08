package typingsSlinky.useDashResizeDashObserver.useDashResizeDashObserverMod

import slinky.core.facade.ReactRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObserverResultWithDefaultWidthOnly[TElement] extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var ref: ReactRef[TElement]
  var width: Double
}

object ObserverResultWithDefaultWidthOnly {
  @scala.inline
  def apply[TElement](ref: ReactRef[TElement], width: Double, height: Int | Double = null): ObserverResultWithDefaultWidthOnly[TElement] = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObserverResultWithDefaultWidthOnly[TElement]]
  }
}

