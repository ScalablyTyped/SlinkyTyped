package typingsSlinky.wordpressBlockEditor.checkMod.MediaUploadCheck

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: TagMod[Any]
  var fallback: js.UndefOr[TagMod[Any]] = js.undefined
}

object Props {
  @scala.inline
  def apply(children: TagMod[Any] = null, fallback: TagMod[Any] = null): Props = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

