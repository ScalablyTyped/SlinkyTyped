package typingsSlinky.wordpressEditor.components

import typingsSlinky.wordpressEditor.mod.VisualEditorGlobalKeyboardShortcuts.^
import typingsSlinky.wordpressEditor.visualEditorShortcutsMod.VisualEditorGlobalKeyboardShortcuts.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object VisualEditorGlobalKeyboardShortcuts {
  @JSImport("@wordpress/editor", "VisualEditorGlobalKeyboardShortcuts")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props_57635024[^] = new SharedBuilder_Props_57635024[^](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: VisualEditorGlobalKeyboardShortcuts.type): SharedBuilder_Props_57635024[^] = new SharedBuilder_Props_57635024[^](js.Array(this.component, js.Dictionary.empty))()
}

