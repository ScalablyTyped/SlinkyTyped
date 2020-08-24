package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.tableHeaderMod.TableHeaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableHeader {
  @JSImport("semantic-ui-react", "TableHeader")
  @js.native
  object component extends js.Object
  
  def withProps(p: TableHeaderProps): SharedBuilder_TableHeaderProps_2100104401 = new SharedBuilder_TableHeaderProps_2100104401(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: TableHeader.type): SharedBuilder_TableHeaderProps_2100104401 = new SharedBuilder_TableHeaderProps_2100104401(js.Array(this.component, js.Dictionary.empty))()
}

