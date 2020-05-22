package typingsSlinky.wordpressEditor.components

import typingsSlinky.wordpressEditor.visualEditorShortcutsMod.VisualEditorGlobalKeyboardShortcuts.Props
import typingsSlinky.wordpressEditor.visualEditorShortcutsMod.default.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object VisualEditorShortcuts {
  @JSImport("@wordpress/editor/components/global-keyboard-shortcuts/visual-editor-shortcuts", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props_57635024[^] = new SharedBuilder_Props_57635024[^](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: VisualEditorShortcuts.type): SharedBuilder_Props_57635024[^] = new SharedBuilder_Props_57635024[^](js.Array(this.component, js.Dictionary.empty))()
}

