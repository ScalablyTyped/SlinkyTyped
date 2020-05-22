package typingsSlinky.wordpressEditor.components

import typingsSlinky.wordpressEditor.mod.TextEditorGlobalKeyboardShortcuts.^
import typingsSlinky.wordpressEditor.textEditorShortcutsMod.TextEditorGlobalKeyboardShortcuts.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TextEditorGlobalKeyboardShortcuts {
  @JSImport("@wordpress/editor", "TextEditorGlobalKeyboardShortcuts")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props_122304882[^] = new SharedBuilder_Props_122304882[^](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: TextEditorGlobalKeyboardShortcuts.type): SharedBuilder_Props_122304882[^] = new SharedBuilder_Props_122304882[^](js.Array(this.component, js.Dictionary.empty))()
}

