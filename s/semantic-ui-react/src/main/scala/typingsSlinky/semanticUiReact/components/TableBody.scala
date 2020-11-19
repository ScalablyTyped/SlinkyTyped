package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.tableBodyMod.TableBodyProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableBody {
  
  @JSImport("semantic-ui-react", "TableBody")
  @js.native
  object component extends js.Object
  
  def withProps(p: TableBodyProps): SharedBuilder_TableBodyProps_274813113 = new SharedBuilder_TableBodyProps_274813113(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: TableBody.type): SharedBuilder_TableBodyProps_274813113 = new SharedBuilder_TableBodyProps_274813113(js.Array(this.component, js.Dictionary.empty))()
}
