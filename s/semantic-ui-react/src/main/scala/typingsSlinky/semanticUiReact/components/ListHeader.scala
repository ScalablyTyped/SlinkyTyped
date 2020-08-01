package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.listHeaderMod.ListHeaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ListHeader {
  @JSImport("semantic-ui-react/dist/commonjs/elements/List/ListHeader", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: ListHeaderProps): SharedBuilder_ListHeaderProps958583138 = new SharedBuilder_ListHeaderProps958583138(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ListHeader.type): SharedBuilder_ListHeaderProps958583138 = new SharedBuilder_ListHeaderProps958583138(js.Array(this.component, js.Dictionary.empty))()
}

