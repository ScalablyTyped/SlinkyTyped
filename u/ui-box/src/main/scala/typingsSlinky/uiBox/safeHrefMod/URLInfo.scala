package typingsSlinky.uiBox.safeHrefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URLInfo extends js.Object {
  var sameOrigin: Boolean
  var url: js.UndefOr[String] = js.undefined
}

object URLInfo {
  @scala.inline
  def apply(sameOrigin: Boolean, url: String = null): URLInfo = {
    val __obj = js.Dynamic.literal(sameOrigin = sameOrigin.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[URLInfo]
  }
}

