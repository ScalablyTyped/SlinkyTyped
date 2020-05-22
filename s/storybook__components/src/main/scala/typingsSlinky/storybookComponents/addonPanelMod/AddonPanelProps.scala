package typingsSlinky.storybookComponents.addonPanelMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddonPanelProps extends js.Object {
  var active: Boolean = js.native
  var children: TagMod[Any] = js.native
}

object AddonPanelProps {
  @scala.inline
  def apply(active: Boolean, children: TagMod[Any] = null): AddonPanelProps = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddonPanelProps]
  }
}

