package typingsSlinky.storybookRouter.visibilityMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: TagMod[Any]
  var hidden: Boolean
}

object Props {
  @scala.inline
  def apply(hidden: Boolean, children: TagMod[Any] = null): Props = {
    val __obj = js.Dynamic.literal(hidden = hidden.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

