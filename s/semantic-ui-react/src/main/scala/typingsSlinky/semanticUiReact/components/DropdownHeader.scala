package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.dropdownHeaderMod.DropdownHeaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DropdownHeader {
  
  @JSImport("semantic-ui-react", "DropdownHeader")
  @js.native
  object component extends js.Object
  
  def withProps(p: DropdownHeaderProps): SharedBuilder_DropdownHeaderProps_361301233 = new SharedBuilder_DropdownHeaderProps_361301233(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: DropdownHeader.type): SharedBuilder_DropdownHeaderProps_361301233 = new SharedBuilder_DropdownHeaderProps_361301233(js.Array(this.component, js.Dictionary.empty))()
}
