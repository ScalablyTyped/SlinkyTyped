package typingsSlinky.wordpressEditPost.pluginBlockSettingsMenuItemMod.PluginBlockSettingsMenuItem

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.wordpressComponents.dashiconMod.Dashicon.Icon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  /**
    * An array containing a list of block names for which the item should be shown. If not present,
    * it'll be rendered for any block. If multiple blocks are selected, it'll be shown if and only if
    * all of them are in the whitelist.
    */
  var allowedBlocks: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * A dashicon slug, or a custom JSX element.
    * @defaultValue `"admin-plugins"`
    */
  var icon: js.UndefOr[ReactElement | Icon] = js.undefined
  /**
    * The menu item text.
    */
  var label: String
  /**
    * Callback function to be executed when the user click the menu item.
    */
  var onClick: MouseEventHandler[HTMLButtonElement]
  /**
    * If it should be rendered smaller. (This is undocumented).
    */
  var small: js.UndefOr[Boolean] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    label: String,
    onClick: SyntheticMouseEvent[HTMLButtonElement] => Unit,
    allowedBlocks: js.Array[String] = null,
    icon: ReactElement | Icon = null,
    small: js.UndefOr[Boolean] = js.undefined
  ): Props = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
    if (allowedBlocks != null) __obj.updateDynamic("allowedBlocks")(allowedBlocks.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(small)) __obj.updateDynamic("small")(small.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

