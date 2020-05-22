package typingsSlinky.wordpressComponents.dropdownMenuMod.DropdownMenu

import slinky.core.facade.ReactElement
import typingsSlinky.wordpressComponents.dashiconMod.Dashicon.Icon
import typingsSlinky.wordpressComponents.dropdownMod.Dropdown.RenderProps
import typingsSlinky.wordpressComponents.popoverMod.Popover.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.wordpressComponents.dropdownMenuMod.DropdownMenu.PropsWithChildren
  - typingsSlinky.wordpressComponents.dropdownMenuMod.DropdownMenu.PropsWithControls
*/
trait Props extends js.Object

object Props {
  @scala.inline
  def PropsWithChildren(
    children: RenderProps => ReactElement,
    label: String,
    className: String = null,
    icon: Icon = null,
    menuLabel: String = null,
    position: Position = null
  ): Props = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), label = label.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (menuLabel != null) __obj.updateDynamic("menuLabel")(menuLabel.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  def PropsWithControls(
    controls: js.Array[Control],
    label: String,
    className: String = null,
    icon: Icon = null,
    menuLabel: String = null,
    position: Position = null
  ): Props = {
    val __obj = js.Dynamic.literal(controls = controls.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (menuLabel != null) __obj.updateDynamic("menuLabel")(menuLabel.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

