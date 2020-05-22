package typingsSlinky.wordpressComponents.tooltipMod.Tooltip

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.wordpressComponents.popoverMod.Popover.Position
import typingsSlinky.wordpressComponents.shortcutMod.Shortcut.ShortcutType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: ReactElement
  /**
    * The direction in which the tooltip should open relative to its
    * parent node.
    */
  var position: js.UndefOr[Position] = js.undefined
  var shortcut: js.UndefOr[ShortcutType] = js.undefined
  /**
    * The tooltip content to show on focus or hover.
    */
  var text: js.UndefOr[TagMod[Any]] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    children: ReactElement,
    position: Position = null,
    shortcut: ShortcutType = null,
    text: TagMod[Any] = null
  ): Props = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (shortcut != null) __obj.updateDynamic("shortcut")(shortcut.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

