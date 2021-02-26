package typingsSlinky.wordpressBlockEditor.components

import typingsSlinky.wordpressBlockEditor.providerMod.BlockEditorProvider.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BlockEditorProvider {
  
  @JSImport("@wordpress/block-editor", "BlockEditorProvider")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: BlockEditorProvider.type): SharedBuilder_Props_1973207744 = new SharedBuilder_Props_1973207744(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): SharedBuilder_Props_1973207744 = new SharedBuilder_Props_1973207744(js.Array(this.component, p.asInstanceOf[js.Any]))
}
