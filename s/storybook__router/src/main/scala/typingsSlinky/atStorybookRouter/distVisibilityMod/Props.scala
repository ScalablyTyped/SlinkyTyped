package typingsSlinky.atStorybookRouter.distVisibilityMod

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
  def apply(children: TagMod[Any], hidden: Boolean): Props = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Props]
  }
}

