package typingsSlinky.uifabricUtilities

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAsyncPlaceholder extends js.Object {
  var asyncPlaceholder: js.UndefOr[ReactComponentClass[_]] = js.undefined
}

object AnonAsyncPlaceholder {
  @scala.inline
  def apply(asyncPlaceholder: ReactComponentClass[_] = null): AnonAsyncPlaceholder = {
    val __obj = js.Dynamic.literal()
    if (asyncPlaceholder != null) __obj.updateDynamic("asyncPlaceholder")(asyncPlaceholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAsyncPlaceholder]
  }
}

