package typingsSlinky.uifabricUtilities

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaultRender[T] extends js.Object {
  var defaultRender: js.UndefOr[ReactComponentClass[T]] = js.undefined
}

object AnonDefaultRender {
  @scala.inline
  def apply[T](defaultRender: ReactComponentClass[T] = null): AnonDefaultRender[T] = {
    val __obj = js.Dynamic.literal()
    if (defaultRender != null) __obj.updateDynamic("defaultRender")(defaultRender.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefaultRender[T]]
  }
}

