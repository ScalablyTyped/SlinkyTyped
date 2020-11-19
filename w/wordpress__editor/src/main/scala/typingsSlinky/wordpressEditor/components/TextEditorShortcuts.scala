package typingsSlinky.wordpressEditor.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.wordpressEditor.textEditorShortcutsMod.TextEditorGlobalKeyboardShortcuts.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TextEditorShortcuts {
  
  @JSImport("@wordpress/editor/components/global-keyboard-shortcuts/text-editor-shortcuts", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: TextEditorShortcuts.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
}
