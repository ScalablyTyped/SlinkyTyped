package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.gridRowMod.GridRowProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GridRow {
  @JSImport("semantic-ui-react/dist/commonjs/collections/Grid/GridRow", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: GridRowProps): SharedBuilder_GridRowProps_1468990785 = new SharedBuilder_GridRowProps_1468990785(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: GridRow.type): SharedBuilder_GridRowProps_1468990785 = new SharedBuilder_GridRowProps_1468990785(js.Array(this.component, js.Dictionary.empty))()
}

