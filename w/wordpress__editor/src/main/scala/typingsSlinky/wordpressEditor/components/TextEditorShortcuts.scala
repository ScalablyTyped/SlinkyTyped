package typingsSlinky.wordpressEditor.components

import typingsSlinky.wordpressEditor.textEditorShortcutsMod.TextEditorGlobalKeyboardShortcuts.Props
import typingsSlinky.wordpressEditor.textEditorShortcutsMod.default.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TextEditorShortcuts {
  @JSImport("@wordpress/editor/components/global-keyboard-shortcuts/text-editor-shortcuts", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props_122304882[^] = new SharedBuilder_Props_122304882[^](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: TextEditorShortcuts.type): SharedBuilder_Props_122304882[^] = new SharedBuilder_Props_122304882[^](js.Array(this.component, js.Dictionary.empty))()
}

