package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.itemDescriptionMod.ItemDescriptionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ItemDescription {
  @JSImport("semantic-ui-react/dist/commonjs/views/Item/ItemDescription", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: ItemDescriptionProps): SharedBuilder_ItemDescriptionProps919046406 = new SharedBuilder_ItemDescriptionProps919046406(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ItemDescription.type): SharedBuilder_ItemDescriptionProps919046406 = new SharedBuilder_ItemDescriptionProps919046406(js.Array(this.component, js.Dictionary.empty))()
}

