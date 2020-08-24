package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.itemGroupMod.ItemGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ItemGroup {
  @JSImport("semantic-ui-react", "ItemGroup")
  @js.native
  object component extends js.Object
  
  def withProps(p: ItemGroupProps): SharedBuilder_ItemGroupProps1433844644 = new SharedBuilder_ItemGroupProps1433844644(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ItemGroup.type): SharedBuilder_ItemGroupProps1433844644 = new SharedBuilder_ItemGroupProps1433844644(js.Array(this.component, js.Dictionary.empty))()
}

