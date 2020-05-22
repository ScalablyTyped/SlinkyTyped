package typingsSlinky.wordpressBlockEditor.components

import typingsSlinky.wordpressBlockEditor.providerMod.BlockEditorProvider.Props
import typingsSlinky.wordpressBlockEditor.providerMod.default.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Provider {
  @JSImport("@wordpress/block-editor/components/provider", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props1890041786[^] = new SharedBuilder_Props1890041786[^](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Provider.type): SharedBuilder_Props1890041786[^] = new SharedBuilder_Props1890041786[^](js.Array(this.component, js.Dictionary.empty))()
}

