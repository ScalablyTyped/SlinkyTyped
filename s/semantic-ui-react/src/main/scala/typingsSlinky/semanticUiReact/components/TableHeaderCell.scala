package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.tableHeaderCellMod.TableHeaderCellProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableHeaderCell {
  @JSImport("semantic-ui-react/dist/commonjs/collections/Table/TableHeaderCell", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: TableHeaderCellProps): SharedBuilder_TableHeaderCellProps1382588088 = new SharedBuilder_TableHeaderCellProps1382588088(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: TableHeaderCell.type): SharedBuilder_TableHeaderCellProps1382588088 = new SharedBuilder_TableHeaderCellProps1382588088(js.Array(this.component, js.Dictionary.empty))()
}

