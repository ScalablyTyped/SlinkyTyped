package typingsSlinky.wordpressComponents.components

import typingsSlinky.wordpressComponents.rowMod.PanelRow.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PanelRow {
  
  @JSImport("@wordpress/components", "PanelRow")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props1106221617 = new SharedBuilder_Props1106221617(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: PanelRow.type): SharedBuilder_Props1106221617 = new SharedBuilder_Props1106221617(js.Array(this.component, js.Dictionary.empty))()
}
