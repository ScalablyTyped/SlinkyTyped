package typingsSlinky.uifabricUtilities.anon

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RootRef extends js.Object {
  var rootRef: js.UndefOr[ReactRef[HTMLElement]] = js.undefined
}

object RootRef {
  @scala.inline
  def apply(rootRef: ReactRef[HTMLElement] = null): RootRef = {
    val __obj = js.Dynamic.literal()
    if (rootRef != null) __obj.updateDynamic("rootRef")(rootRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootRef]
  }
}

