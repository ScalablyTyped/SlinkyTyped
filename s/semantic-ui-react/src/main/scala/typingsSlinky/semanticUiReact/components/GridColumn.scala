package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.gridColumnMod.GridColumnProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GridColumn {
  
  @JSImport("semantic-ui-react", "GridColumn")
  @js.native
  object component extends js.Object
  
  def withProps(p: GridColumnProps): SharedBuilder_GridColumnProps_612419309 = new SharedBuilder_GridColumnProps_612419309(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: GridColumn.type): SharedBuilder_GridColumnProps_612419309 = new SharedBuilder_GridColumnProps_612419309(js.Array(this.component, js.Dictionary.empty))()
}
