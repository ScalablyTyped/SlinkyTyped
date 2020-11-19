package typingsSlinky.wordpressComponents.iconButtonMod.IconButton

import slinky.core.facade.ReactElement
import typingsSlinky.wordpressComponents.buttonMod.Button.ButtonProps
import typingsSlinky.wordpressComponents.dashiconMod.Dashicon.Icon
import typingsSlinky.wordpressComponents.popoverMod.Popover.Position
import typingsSlinky.wordpressComponents.shortcutMod.Shortcut.ShortcutType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props extends ButtonProps {
  
  /**
    * Icon to use. Either a Dashicon slug or a custom component.
    */
  var icon: Icon | ReactElement = js.native
  
  /**
    * Position for the label.
    * @defaultValue "top"
    */
  var labelPosition: js.UndefOr[Position] = js.native
  
  var shortcut: js.UndefOr[ShortcutType] = js.native
  
  /**
    * Tooltip text to display.
    * @defaultValue Props.label
    */
  var tooltip: js.UndefOr[String] = js.native
}
object Props {
  
  @scala.inline
  def apply(icon: Icon | ReactElement): Props = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIconReactElement(value: ReactElement): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: Icon | ReactElement): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelPosition(value: Position): Self = this.set("labelPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelPosition: Self = this.set("labelPosition", js.undefined)
    
    @scala.inline
    def setShortcut(value: ShortcutType): Self = this.set("shortcut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortcut: Self = this.set("shortcut", js.undefined)
    
    @scala.inline
    def setTooltip(value: String): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
  }
}
