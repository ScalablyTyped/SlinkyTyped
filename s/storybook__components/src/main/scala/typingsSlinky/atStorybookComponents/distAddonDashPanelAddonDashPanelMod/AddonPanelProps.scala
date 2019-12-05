package typingsSlinky.atStorybookComponents.distAddonDashPanelAddonDashPanelMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddonPanelProps extends js.Object {
  var active: Boolean
  var children: TagMod[Any]
}

object AddonPanelProps {
  @scala.inline
  def apply(active: Boolean, children: TagMod[Any]): AddonPanelProps = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AddonPanelProps]
  }
}

