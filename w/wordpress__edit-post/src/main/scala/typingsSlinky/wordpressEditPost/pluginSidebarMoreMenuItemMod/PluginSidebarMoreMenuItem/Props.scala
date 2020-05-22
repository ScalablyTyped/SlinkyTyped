package typingsSlinky.wordpressEditPost.pluginSidebarMoreMenuItemMod.PluginSidebarMoreMenuItem

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.wordpressComponents.dashiconMod.Dashicon.Icon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: TagMod[Any]
  /**
    * A Dashicon slug or a custom JSX element to be rendered to the left of the menu item
    * label.
    */
  var icon: js.UndefOr[Icon | ReactElement] = js.undefined
  /**
    * A string identifying the target sidebar you wish to be activated by this menu item. Must
    * be the same as the `name` prop you have given to that sidebar.
    */
  var target: String
}

object Props {
  @scala.inline
  def apply(target: String, children: TagMod[Any] = null, icon: Icon | ReactElement = null): Props = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

