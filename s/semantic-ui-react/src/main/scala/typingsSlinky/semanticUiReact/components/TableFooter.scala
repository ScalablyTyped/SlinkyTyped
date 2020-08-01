package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.tableFooterMod.TableFooterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableFooter {
  @JSImport("semantic-ui-react/dist/commonjs/collections/Table/TableFooter", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: TableFooterProps): SharedBuilder_TableFooterProps2133173170 = new SharedBuilder_TableFooterProps2133173170(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: TableFooter.type): SharedBuilder_TableFooterProps2133173170 = new SharedBuilder_TableFooterProps2133173170(js.Array(this.component, js.Dictionary.empty))()
}

