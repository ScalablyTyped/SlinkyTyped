package typingsSlinky.useDashResizeDashObserver.useDashResizeDashObserverMod

import slinky.core.facade.ReactRef
import typingsSlinky.useDashResizeDashObserver.useDashResizeDashObserverBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultsWithoutSize[TElement] extends _ObserverDefaults[TElement] {
  var ref: js.UndefOr[ReactRef[TElement]] = js.undefined
  var useDefaults: js.UndefOr[`false`] = js.undefined
}

object DefaultsWithoutSize {
  @scala.inline
  def apply[TElement](ref: ReactRef[TElement] = null, useDefaults: `false` = null): DefaultsWithoutSize[TElement] = {
    val __obj = js.Dynamic.literal()
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (useDefaults != null) __obj.updateDynamic("useDefaults")(useDefaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultsWithoutSize[TElement]]
  }
}

