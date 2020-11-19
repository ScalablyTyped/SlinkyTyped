package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.popupHeaderMod.PopupHeaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PopupHeader {
  
  @JSImport("semantic-ui-react", "PopupHeader")
  @js.native
  object component extends js.Object
  
  def withProps(p: PopupHeaderProps): SharedBuilder_PopupHeaderProps244003214 = new SharedBuilder_PopupHeaderProps244003214(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: PopupHeader.type): SharedBuilder_PopupHeaderProps244003214 = new SharedBuilder_PopupHeaderProps244003214(js.Array(this.component, js.Dictionary.empty))()
}
