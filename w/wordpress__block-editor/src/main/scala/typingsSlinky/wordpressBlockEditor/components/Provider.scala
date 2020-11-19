package typingsSlinky.wordpressBlockEditor.components

import typingsSlinky.wordpressBlockEditor.providerMod.BlockEditorProvider.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Provider {
  
  @JSImport("@wordpress/block-editor/components/provider", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props_1973207744 = new SharedBuilder_Props_1973207744(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Provider.type): SharedBuilder_Props_1973207744 = new SharedBuilder_Props_1973207744(js.Array(this.component, js.Dictionary.empty))()
}
