package typingsSlinky.wordpressEditor.components

import typingsSlinky.wordpressEditor.mod.EditorHistoryUndo.^
import typingsSlinky.wordpressEditor.undoMod.EditorHistoryUndo.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object EditorHistoryUndo {
  @JSImport("@wordpress/editor", "EditorHistoryUndo")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props603283928[^] = new SharedBuilder_Props603283928[^](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: EditorHistoryUndo.type): SharedBuilder_Props603283928[^] = new SharedBuilder_Props603283928[^](js.Array(this.component, js.Dictionary.empty))()
}

