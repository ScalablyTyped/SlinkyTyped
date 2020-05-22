package typingsSlinky.wordpressComponents.iconButtonMod.IconButton

import slinky.core.facade.ReactElement
import typingsSlinky.wordpressComponents.buttonMod.Button.ButtonProps
import typingsSlinky.wordpressComponents.dashiconMod.Dashicon.Icon
import typingsSlinky.wordpressComponents.popoverMod.Popover.Position
import typingsSlinky.wordpressComponents.shortcutMod.Shortcut.ShortcutType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends ButtonProps {
  /**
    * Icon to use. Either a Dashicon slug or a custom component.
    */
  var icon: Icon | ReactElement
  /**
    * Position for the label.
    * @defaultValue "top"
    */
  var labelPosition: js.UndefOr[Position] = js.undefined
  var shortcut: js.UndefOr[ShortcutType] = js.undefined
  /**
    * Tooltip text to display.
    * @defaultValue Props.label
    */
  var tooltip: js.UndefOr[String] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    icon: Icon | ReactElement,
    ButtonProps: ButtonProps = null,
    labelPosition: Position = null,
    shortcut: ShortcutType = null,
    tooltip: String = null
  ): Props = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
    if (ButtonProps != null) js.Dynamic.global.Object.assign(__obj, ButtonProps)
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
    if (shortcut != null) __obj.updateDynamic("shortcut")(shortcut.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

