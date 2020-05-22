package typingsSlinky.wordpressEditor.components

import typingsSlinky.wordpressEditor.undoMod.EditorHistoryUndo.Props
import typingsSlinky.wordpressEditor.undoMod.default.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Undo {
  @JSImport("@wordpress/editor/components/editor-history/undo", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props603283928[^] = new SharedBuilder_Props603283928[^](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Undo.type): SharedBuilder_Props603283928[^] = new SharedBuilder_Props603283928[^](js.Array(this.component, js.Dictionary.empty))()
}

