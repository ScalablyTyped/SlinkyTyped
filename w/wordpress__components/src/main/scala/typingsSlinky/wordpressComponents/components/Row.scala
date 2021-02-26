package typingsSlinky.wordpressComponents.components

import typingsSlinky.wordpressComponents.rowMod.PanelRow.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Row {
  
  @JSImport("@wordpress/components/panel/row", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Row.type): SharedBuilder_Props1106221617 = new SharedBuilder_Props1106221617(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): SharedBuilder_Props1106221617 = new SharedBuilder_Props1106221617(js.Array(this.component, p.asInstanceOf[js.Any]))
}
