package typingsSlinky.wordpressComponents.menuGroupMod.MenuGroup

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: TagMod[Any]
  var className: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[TagMod[Any]] = js.undefined
}

object Props {
  @scala.inline
  def apply(children: TagMod[Any] = null, className: String = null, label: TagMod[Any] = null): Props = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

