package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.itemMetaMod.ItemMetaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ItemMeta {
  @JSImport("semantic-ui-react", "ItemMeta")
  @js.native
  object component extends js.Object
  
  def withProps(p: ItemMetaProps): SharedBuilder_ItemMetaProps247143672 = new SharedBuilder_ItemMetaProps247143672(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ItemMeta.type): SharedBuilder_ItemMetaProps247143672 = new SharedBuilder_ItemMetaProps247143672(js.Array(this.component, js.Dictionary.empty))()
}

