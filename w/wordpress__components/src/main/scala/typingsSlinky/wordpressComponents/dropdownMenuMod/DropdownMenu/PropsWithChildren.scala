package typingsSlinky.wordpressComponents.dropdownMenuMod.DropdownMenu

import slinky.core.facade.ReactElement
import typingsSlinky.wordpressComponents.dashiconMod.Dashicon.Icon
import typingsSlinky.wordpressComponents.dropdownMod.Dropdown.RenderProps
import typingsSlinky.wordpressComponents.popoverMod.Popover.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropsWithChildren
  extends BaseProps
     with Props {
  /**
    * A function render prop which should return an element or elements
    * valid for use in a `DropdownMenu`: `MenuItem`, `MenuItemsChoice`, or
    * `MenuGroup`.
    */
  def children(props: RenderProps): ReactElement
}

object PropsWithChildren {
  @scala.inline
  def apply(
    children: RenderProps => ReactElement,
    label: String,
    className: String = null,
    icon: Icon = null,
    menuLabel: String = null,
    position: Position = null
  ): PropsWithChildren = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), label = label.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (menuLabel != null) __obj.updateDynamic("menuLabel")(menuLabel.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsWithChildren]
  }
}

