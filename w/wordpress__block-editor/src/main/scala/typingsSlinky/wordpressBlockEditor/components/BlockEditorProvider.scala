package typingsSlinky.wordpressBlockEditor.components

import typingsSlinky.wordpressBlockEditor.mod.BlockEditorProvider.^
import typingsSlinky.wordpressBlockEditor.providerMod.BlockEditorProvider.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BlockEditorProvider {
  @JSImport("@wordpress/block-editor", "BlockEditorProvider")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props1890041786[^] = new SharedBuilder_Props1890041786[^](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: BlockEditorProvider.type): SharedBuilder_Props1890041786[^] = new SharedBuilder_Props1890041786[^](js.Array(this.component, js.Dictionary.empty))()
}

