package typingsSlinky.wordpressEditor.components

import typingsSlinky.wordpressEditor.redoMod.EditorHistoryRedo.Props
import typingsSlinky.wordpressEditor.redoMod.default.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Redo {
  @JSImport("@wordpress/editor/components/editor-history/redo", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props1170834997[^] = new SharedBuilder_Props1170834997[^](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Redo.type): SharedBuilder_Props1170834997[^] = new SharedBuilder_Props1170834997[^](js.Array(this.component, js.Dictionary.empty))()
}

