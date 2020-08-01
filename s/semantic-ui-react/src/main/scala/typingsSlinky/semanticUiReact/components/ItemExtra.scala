package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.itemExtraMod.ItemExtraProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ItemExtra {
  @JSImport("semantic-ui-react/dist/commonjs/views/Item/ItemExtra", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: ItemExtraProps): SharedBuilder_ItemExtraProps1716559528 = new SharedBuilder_ItemExtraProps1716559528(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ItemExtra.type): SharedBuilder_ItemExtraProps1716559528 = new SharedBuilder_ItemExtraProps1716559528(js.Array(this.component, js.Dictionary.empty))()
}

