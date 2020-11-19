package typingsSlinky.wordpressBlockEditor.richTextMod.RichTextToolbarButton

import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.access
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.alt
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.ctrl
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.ctrlShift
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.primary
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.primaryAlt
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.primaryShift
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.secondary
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.shift
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.shiftAlt
import typingsSlinky.wordpressComponents.dashiconMod.Dashicon.Icon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props
  extends typingsSlinky.wordpressComponents.toolbarButtonMod.ToolbarButton.Props {
  
  var name: js.UndefOr[String] = js.native
  
  var shortcutCharacter: js.UndefOr[String] = js.native
  
  var shortcutType: js.UndefOr[
    primary | primaryShift | primaryAlt | secondary | access | ctrl | alt | ctrlShift | shift | shiftAlt
  ] = js.native
}
object Props {
  
  @scala.inline
  def apply(icon: Icon, onClick: () => Unit, title: String): Props = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick), title = title.asInstanceOf[js.Any])
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setShortcutCharacter(value: String): Self = this.set("shortcutCharacter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortcutCharacter: Self = this.set("shortcutCharacter", js.undefined)
    
    @scala.inline
    def setShortcutType(
      value: primary | primaryShift | primaryAlt | secondary | access | ctrl | alt | ctrlShift | shift | shiftAlt
    ): Self = this.set("shortcutType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortcutType: Self = this.set("shortcutType", js.undefined)
  }
}
