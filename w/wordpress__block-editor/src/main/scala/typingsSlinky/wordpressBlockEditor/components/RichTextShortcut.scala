package typingsSlinky.wordpressBlockEditor.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.wordpressBlockEditor.richTextMod.RichTextShortcut.Props
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RichTextShortcut {
  
  @JSImport("@wordpress/block-editor", "RichTextShortcut")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    character: String,
    onUse: () => Unit,
    `type`: /* keyof @wordpress/block-editor.anon.Access */ primary | primaryShift | primaryAlt | secondary | access | ctrl | alt | ctrlShift | shift | shiftAlt
  ): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(character = character.asInstanceOf[js.Any], onUse = js.Any.fromFunction0(onUse))
    __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[Props]))
  }
}
