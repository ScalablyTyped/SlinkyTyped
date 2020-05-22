package typingsSlinky.wordpressEditor.components

import typingsSlinky.wordpressEditor.mod.EditorHistoryRedo.^
import typingsSlinky.wordpressEditor.redoMod.EditorHistoryRedo.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object EditorHistoryRedo {
  @JSImport("@wordpress/editor", "EditorHistoryRedo")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props1170834997[^] = new SharedBuilder_Props1170834997[^](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: EditorHistoryRedo.type): SharedBuilder_Props1170834997[^] = new SharedBuilder_Props1170834997[^](js.Array(this.component, js.Dictionary.empty))()
}

