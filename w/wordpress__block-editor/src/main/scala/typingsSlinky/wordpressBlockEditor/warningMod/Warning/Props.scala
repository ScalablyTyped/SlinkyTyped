package typingsSlinky.wordpressBlockEditor.warningMod.Warning

import slinky.core.TagMod
import typingsSlinky.react.mod.ReactFragment
import typingsSlinky.wordpressBlockEditor.anon.OnClick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var actions: js.UndefOr[ReactFragment] = js.undefined
  var children: TagMod[Any]
  var className: js.UndefOr[String] = js.undefined
  var secondaryActions: js.UndefOr[js.Array[OnClick]] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    actions: ReactFragment = null,
    children: TagMod[Any] = null,
    className: String = null,
    secondaryActions: js.Array[OnClick] = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (secondaryActions != null) __obj.updateDynamic("secondaryActions")(secondaryActions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

