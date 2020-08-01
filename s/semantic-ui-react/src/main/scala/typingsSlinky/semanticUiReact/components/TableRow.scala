package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.tableRowMod.TableRowProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableRow {
  @JSImport("semantic-ui-react/dist/commonjs/collections/Table/TableRow", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: TableRowProps): SharedBuilder_TableRowProps1849714678 = new SharedBuilder_TableRowProps1849714678(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: TableRow.type): SharedBuilder_TableRowProps1849714678 = new SharedBuilder_TableRowProps1849714678(js.Array(this.component, js.Dictionary.empty))()
}

