package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.itemExtraMod.ItemExtraProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ItemExtra {
  
  @JSImport("semantic-ui-react", "ItemExtra")
  @js.native
  object component extends js.Object
  
  def withProps(p: ItemExtraProps): SharedBuilder_ItemExtraProps1716559528 = new SharedBuilder_ItemExtraProps1716559528(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ItemExtra.type): SharedBuilder_ItemExtraProps1716559528 = new SharedBuilder_ItemExtraProps1716559528(js.Array(this.component, js.Dictionary.empty))()
}
