package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.tableHeaderCellMod.TableHeaderCellProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableHeaderCell {
  
  @JSImport("semantic-ui-react", "TableHeaderCell")
  @js.native
  object component extends js.Object
  
  def withProps(p: TableHeaderCellProps): SharedBuilder_TableHeaderCellProps1382588088 = new SharedBuilder_TableHeaderCellProps1382588088(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: TableHeaderCell.type): SharedBuilder_TableHeaderCellProps1382588088 = new SharedBuilder_TableHeaderCellProps1382588088(js.Array(this.component, js.Dictionary.empty))()
}
