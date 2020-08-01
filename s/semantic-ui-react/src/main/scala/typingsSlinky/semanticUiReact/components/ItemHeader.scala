package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.itemHeaderMod.ItemHeaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ItemHeader {
  @JSImport("semantic-ui-react/dist/commonjs/views/Item/ItemHeader", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: ItemHeaderProps): SharedBuilder_ItemHeaderProps464154223 = new SharedBuilder_ItemHeaderProps464154223(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ItemHeader.type): SharedBuilder_ItemHeaderProps464154223 = new SharedBuilder_ItemHeaderProps464154223(js.Array(this.component, js.Dictionary.empty))()
}

