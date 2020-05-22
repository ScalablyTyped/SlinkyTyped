package typingsSlinky.uiBox.safeHrefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SafeHrefConfigObj extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
  var origin: js.UndefOr[String] = js.undefined
}

object SafeHrefConfigObj {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, origin: String = null): SafeHrefConfigObj = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[SafeHrefConfigObj]
  }
}

