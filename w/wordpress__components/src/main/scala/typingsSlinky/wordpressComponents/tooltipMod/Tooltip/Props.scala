package typingsSlinky.wordpressComponents.tooltipMod.Tooltip

import slinky.core.facade.ReactElement
import typingsSlinky.wordpressComponents.popoverMod.Popover.Position
import typingsSlinky.wordpressComponents.shortcutMod.Shortcut.ShortcutType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props extends js.Object {
  
  var children: ReactElement = js.native
  
  /**
    * The direction in which the tooltip should open relative to its
    * parent node.
    */
  var position: js.UndefOr[Position] = js.native
  
  var shortcut: js.UndefOr[ShortcutType] = js.native
  
  /**
    * The tooltip content to show on focus or hover.
    */
  var text: js.UndefOr[ReactElement] = js.native
}
object Props {
  
  @scala.inline
  def apply(children: ReactElement): Props = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
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
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Position): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setShortcut(value: ShortcutType): Self = this.set("shortcut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortcut: Self = this.set("shortcut", js.undefined)
    
    @scala.inline
    def setTextReactElement(value: ReactElement): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: ReactElement): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
